package sample.unitTests;

import org.junit.Assert;
import org.junit.Test;
import sample.data.jpa.domain.Balance;
import sample.data.jpa.service.ToXMLServiceImpl;

import java.math.BigDecimal;
import java.util.Date;

public class XmlTest {

    @Test
    public void ObjToXML() {
        Balance balance = new Balance();

        balance.setVersion(1);
        balance.setCreated(new Date());
        balance.setStatus("Processing");
        balance.setRow1300(new BigDecimal(12));
        balance.setRow1700(new BigDecimal(12));

        ToXMLServiceImpl.jaxbObjectToXML(balance);
    }

    @Test
    public void xmlToObj() {

        Balance balance = ToXMLServiceImpl.jaxbXMLToObject();
        Assert.assertEquals("Processing",balance.getStatus());
    }
}
