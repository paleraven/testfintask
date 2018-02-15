package sample.data.jpa.service;

import sample.data.jpa.domain.Balance;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;


public class ToXMLServiceImpl  {

    private static final String FILE_NAME = "jaxb.xml";

    public static void jaxbObjectToXML(Balance balance) {

        try {
            JAXBContext context = JAXBContext.newInstance(Balance.class);
            Marshaller m = context.createMarshaller();

            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            m.marshal(balance, new File(FILE_NAME));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static Balance jaxbXMLToObject() {
        try {
            JAXBContext context = JAXBContext.newInstance(Balance.class);
            Unmarshaller un = context.createUnmarshaller();

            return (Balance) un.unmarshal(new File(FILE_NAME));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

}
