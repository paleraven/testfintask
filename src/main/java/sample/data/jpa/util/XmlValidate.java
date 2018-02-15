package sample.data.jpa.util;

import java.io.File;
import java.io.IOException;
import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;
import sample.data.jpa.domain.FormType;

public class XmlValidate {

    private XmlValidate() {
    }

    public static boolean validateXmlByXsd(FormType formType, String pathXml) {

        try {
            ClassLoader classLoader = ClassLoader.getSystemClassLoader();
            String pathXsd;

            switch (formType) {
                case BALANCE:
                    pathXsd = classLoader.getResource("xsd/balance.xsd").toString();
                    break;
                case INCOME_REPORT:
                    pathXsd = classLoader.getResource("xsd/income_report.xsd").toString();
                    break;
                default:
                    return false;
            }

            File xml = new File(pathXml);

            if (!xml.exists()) {
                return false;
            }

            SchemaFactory factory = SchemaFactory
                    .newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new StreamSource(pathXsd));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(pathXml));
            return true;
        } catch (SAXException | IOException e) {
            return false;
        }

    }

}
