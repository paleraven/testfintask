package mvc.controller;

import mvc.model.dao.DAOFactory;
import mvc.model.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Set;

@Controller
@MultipartConfig(fileSizeThreshold = 1024* 1024* 2,
                    maxFileSize = 1024*1024,
                    maxRequestSize = 1024*1024*2)
public class CreateAdController{

    private DAOFactory daoFactory;

    @Autowired
    public void setDaoFactory(DAOFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView getAddAdForm(ModelAndView mAV){
        mAV.setViewName("add");

        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("manufacturers", this.daoFactory.getManufactorDAO().readAll());
        modelMap.addAttribute("models", this.daoFactory.getModelDAO().readAll());
        modelMap.addAttribute("bodies", this.daoFactory.getBodyDAO().readAll());
        modelMap.addAttribute("colours", this.daoFactory.getColorDAO().readAll());
        modelMap.addAttribute("transmissions", this.daoFactory.getTransmissionsDAO().readAll());
        mAV.addAllObjects(modelMap);

        return mAV;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String createAd(HttpServletRequest req,
                           HttpSession session,
                           @RequestParam String model,
                           @RequestParam String transmission,
                           @RequestParam String body,
                           @RequestParam String color,
                           @RequestParam String title,
                           @RequestParam String price,
                           @RequestParam("upfiles") MultipartFile[] files){

        Ad ad = new Ad();
        ad.setTittle(title);
        ad.setCar(new Car(
                new Model(Integer.parseInt(model)),
                new Transmission(Integer.parseInt(transmission)),
                new Body(Integer.parseInt(body)),
                new Color(Integer.parseInt(color))));
        ad.setCreate(new Timestamp(System.currentTimeMillis()));

        String slogin = (String) session.getAttribute("slogin");
        String spassword = (String) session.getAttribute("spassword");

        User user = this.daoFactory.getUserDAO().
                getByLoginPassword(slogin, spassword);
        ad.setUser(user);
        ad.setDone(false);
        ad.setPrice(Integer.parseInt(price));

        Set<Image> images = null;
        try {
            images = this.daoFactory.getAdDAO().getFiles(req, files);
        } catch (IOException | ServletException e) {
            DAOFactory.logger.error(e.getMessage(), e);
        }
        ad.setImages(images);
        this.daoFactory.getAdDAO().create(ad);

        return "redirect:ads.do";
    }


}
