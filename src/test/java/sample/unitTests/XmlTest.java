package sample.unitTests;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import sample.data.jpa.domain.Balance;
import sample.data.jpa.domain.IncomeReport;
import sample.data.jpa.service.ToXMLServiceImpl;

import java.math.BigDecimal;
import java.util.Date;

public class XmlTest {

    @Test
    public void ObjToXMLBalance() {
        Balance balance = new Balance();

        balance.setVersion(1);
        balance.setCreated(new Date());
        balance.setStatus("Processing");
        balance.setRow1300(new BigDecimal(12));
        balance.setRow1700(new BigDecimal(12));

        ToXMLServiceImpl.commonToXML(balance);
    }

    @Ignore
    @Test
    public void xmlToObjBalance() {

        Balance balance = ToXMLServiceImpl.jaxbXMLToObjectBalance();
        Assert.assertEquals("Processing",balance.getStatus());
    }

    @Test
    public void ObjToXMLIncomeRep() {
        IncomeReport incomeReport = new IncomeReport();

        incomeReport.setVersion(1);
        incomeReport.setCreated(new Date());
        incomeReport.setStatus("Processing");
        incomeReport.setRow2110(new BigDecimal(12));
        incomeReport.setRow2210(new BigDecimal(12));

        ToXMLServiceImpl.commonToXML(incomeReport);
    }

    @Test
    public void xmlToObjIncomeRep() {

        IncomeReport incomeReport = ToXMLServiceImpl.jaxbXMLToObjectIM();
        Assert.assertEquals("Processing",incomeReport.getStatus());
    }
}
