package mvc.model.dao;

import mvc.model.models.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import static junit.framework.Assert.assertNotNull;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-mvc-context-test.xml")
public class AdDAOTest {

    @Autowired
    private DAOFactory daoFactory;

    public Ad createAd(String manuf){

        //create car
        Car car = new Car();
        car.setModel(this.getModel(manuf));
        car.setTransmission(this.getTransmission());
        car.setBody(this.getBody());
        car.setColor(this.getColor());
        daoFactory.getCarDAO().create(car);

        //create user
        Role role = new Role();
        role.setRole("test1");
        daoFactory.getRoleDAO().create(role);

        User user = new User();
        user.setLogin("test1");
        user.setPassword("test1");
        user.setName("test1");
        user.setCreate(new Timestamp(System.currentTimeMillis()));
        user.setRole(role);
        daoFactory.getUserDAO().create(user);

        //create ad
        Ad ad = new Ad();
        ad.setTittle("test2");
        ad.setDone(false);
        ad.setCar(car);
        ad.setUser(user);
        ad.setCreate(new Timestamp(System.currentTimeMillis()));
        ad.setPrice(10);

        int id = daoFactory.getAdDAO().create(ad);
        ad.setImages(new HashSet<Image>(){{
            add(new Image("urltest21", ad));
            add(new Image("urltest22", ad));
        }});
        return ad;
    }

    private Color getColor() {
        Color color = new Color();
        color.setColor("red");
        int id =  daoFactory.getColorDAO().create(color);
        return color;
    }

    private Body getBody() {
        Body body = new Body();
        body.setBody("sedan");
        int id = daoFactory.getBodyDAO().create(body);
        return body;
    }

    private Transmission getTransmission() {
        Transmission transmission = new Transmission();
        transmission.setName("manual");
        int id = daoFactory.getTransmissionsDAO().create(transmission);
        return transmission;
    }

    private Model getModel(String manuf) {
        Model model = new Model();
        model.setModel("test1");
        model.setManuf(this.getManuf(manuf));
        int id = daoFactory.getModelDAO().create(model);
        return model;
    }

    private Manufactor getManuf(String m) {
        Manufactor manuf = new Manufactor();
        manuf.setManuf(m);
        int id = daoFactory.getManufactorDAO().create(manuf);
        return manuf;
    }

    @Test
    public void whenReadAdShouldGetIt(){
        Ad ad = this.createAd("toyota");
        Ad ad1 = daoFactory.getAdDAO().read(ad.getId());
        assertNotNull(ad1);
    }

    @Test
    public void whenReadAllAdsShouldGetThem(){
        this.createAd("toyota");
        List<Ad> ads = daoFactory.getAdDAO().readAll();
        assertTrue(ads.size() > 0);
    }

    @Test
    public void whenCreateAdsShouldGetId(){
        Ad ad = this.createAd("toyota");
        assertTrue(ad.getId() > 0);
    }

    @Test
    public void whenDeleteAdsShouldGetInt(){
        Ad ad = this.createAd("toyota");
        int i = daoFactory.getAdDAO().delete(ad.getId());
        assertThat(i, is(1));
    }

    @Test
    public void whenUpdateAdsShouldGetInt(){
        Ad ad = this.createAd("toyota");

        //update
        Ad newAd = new Ad();
        newAd.setTittle("tittle");
        int i = daoFactory.getAdDAO().update(ad.getId(), newAd);
        assertThat(i, is(1));
    }

    @Test
    public void whenGetAdByManufShouldGetIt(){
        this.createAd("toyota");

        Map<String, String> m = new HashMap<>();
        m.put("manuf", "toyota");
        m.put("from", "");
        m.put("to", "");
        List<Ad> ads = daoFactory.getAdDAO().getAdByFilters(m);
        assertTrue(ads.size() > 0);
    }

}
