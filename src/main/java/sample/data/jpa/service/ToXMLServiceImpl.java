package sample.data.jpa.service;

import sample.data.jpa.domain.Balance;
import sample.data.jpa.domain.FormType;
import sample.data.jpa.domain.IncomeReport;
import sample.data.jpa.util.XmlValidate;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;



public class ToXMLServiceImpl {

    private ToXMLServiceImpl() {

    }

    private static final String FILE_NAME_BALANCE = "jaxb_balance.xml";
    private static final String FILE_NAME_IR = "jaxb_ir.xml";


    public static void commonToXML(Object toXML, String fileName) {
        if (fileName.isEmpty())
            fileName = FILE_NAME_BALANCE;
        try {
            JAXBContext context;
            if (toXML instanceof Balance) {
                context = JAXBContext.newInstance(Balance.class);
            } else if (toXML instanceof IncomeReport) {
                context = JAXBContext.newInstance(IncomeReport.class);
            } else throw new ClassCastException();

            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            m.marshal(toXML, new File(fileName));

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }


    public static Balance jaxbXMLToObjectBalance(String fileName) {
        XmlValidate.validateXmlByXsd(FormType.BALANCE, FILE_NAME_BALANCE);
        if (fileName.isEmpty())
            fileName = FILE_NAME_BALANCE;
        try {
            JAXBContext context = JAXBContext.newInstance(Balance.class);
            Unmarshaller un = context.createUnmarshaller();

            return (Balance) un.unmarshal(new File(fileName));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static IncomeReport jaxbXMLToObjectIM(String fileName) {
        if (fileName.isEmpty())
            fileName = FILE_NAME_IR;
        try {
            JAXBContext context = JAXBContext.newInstance(IncomeReport.class);
            Unmarshaller un = context.createUnmarshaller();

            return (IncomeReport) un.unmarshal(new File(fileName));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

}
