package sample.unitTests;

import org.junit.Assert;
import org.junit.Test;
import sample.data.jpa.domain.Balance;
import sample.data.jpa.domain.IncomeReport;
import sample.data.jpa.service.ToXMLServiceImpl;

import java.math.BigDecimal;


public class XmlTest {

    @Test
    public void ObjToXMLBalance() {
        Balance balance = new Balance();

        balance.setBalanceId(12L);

        balance.setVersion(1);
        balance.setStatus("Processing");
        balance.setYear("2000");
        balance.setRow1300(new BigDecimal(12));
        balance.setRow1700(new BigDecimal(12));

        ToXMLServiceImpl.commonToXML(balance, "1.xml");
    }


    @Test
    public void xmlToObjBalance() {

        Balance balance = ToXMLServiceImpl.jaxbXMLToObjectBalance("1.xml");
        Assert.assertEquals("Processing", balance.getStatus());
    }

    @Test
    public void ObjToXMLIncomeRep() {
        IncomeReport incomeReport = new IncomeReport();

        incomeReport.setReportId(12l);
        incomeReport.setVersion(1);

        incomeReport.setStatus("Processing");
        incomeReport.setYear("2012");
        incomeReport.setRow2110(new BigDecimal(12));
        incomeReport.setRow2210(new BigDecimal(12));

        ToXMLServiceImpl.commonToXML(incomeReport, "2.xml");
    }

    @Test
    public void xmlToObjIncomeRep() {

        IncomeReport incomeReport = ToXMLServiceImpl.jaxbXMLToObjectIM("2.xml");
        Assert.assertEquals("Processing", incomeReport.getStatus());
    }
}
