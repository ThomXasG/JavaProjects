package ec.edu.charge.strategy.providers;

import ec.edu.charge.strategy.implement.IAuthenticationStrategy;
import ec.edu.charge.strategy.implement.Principal;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;
import java.io.FileInputStream;
import java.io.IOException;

public class XMLAuthenticationProvider implements IAuthenticationStrategy {
    private static final String rolXPath = "Users/User[@userName='%s' and @password='%s']/@rol";
    @Override
    public Principal authenticate(String userName, String passwrd) {
        //InputStream file = null;
        FileInputStream file = null;
        try {
            //file = getClass().getResourceAsStream("/META_INFO/UserFile.xml");
            file = new FileInputStream("UserFile.xml");
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            var builder = builderFactory.newDocumentBuilder();
            // Document document = dBuilder.parse(new FileInputStream("XMLFile.xml"));
            Document xmlDocument =  builder.parse(file);
            XPath xPath = XPathFactory.newInstance().newXPath();

            String xpath = String.format(rolXPath, userName, passwrd);
            String rol = xPath.compile(xpath).evaluate(xmlDocument);
            if (rol != null && !rol.isEmpty()) {
                return new Principal(userName, rol);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                file.close();
            } catch (IOException ex) { }
        }
    }
}
