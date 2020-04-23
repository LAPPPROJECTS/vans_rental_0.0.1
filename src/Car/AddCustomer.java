package customer;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;

@Getter
@RequiredArgsConstructor
public class AddCustomer {

    //Main run for test only
/*    public static void main(String[] args) {

        AddCustomer customer = new AddCustomer();
        customer.createCustomer();
    }*/

    private String name;
    private String lastName;
    private String password1Input;
    private String password2Input;
    private String password;
    private String phoneNumber;
    private String emailAddress;

    private void createCustomer(){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter first name> ");
        name = in.nextLine();
        System.out.print("Enter last name> ");
        lastName = in.nextLine();
        System.out.print("Enter password> ");
        password1Input = in.nextLine();
        System.out.print("Repeat password> ");
        password2Input = in.nextLine();
        System.out.print("Enter phoneNumber> ");
        phoneNumber = in.nextLine();
        System.out.print("Enter email addres> ");
        emailAddress = in.nextLine();

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;

        try{
            builder = factory.newDocumentBuilder();
            Document document = builder.newDocument();

            Element customer = document.createElement("Customer");
            document.appendChild(customer);

            Element userName = document.createElement("UserName");
            Element userPassword = document.createElement("Password");
            Element userLastName = document.createElement("LastName");
            Element userPhoneNumber = document.createElement("PhoneNumber");
            Element userEmailAddress = document.createElement("EmailAddress");


            userName.appendChild(document.createElement(name));
            if(password1Input!=null && password1Input!= null && password1Input.equals(password2Input)) {
                userPassword.appendChild(document.createTextNode(password));
            }
            userLastName.appendChild(document.createTextNode(lastName));
            //TODO add phone number format checker
            userPhoneNumber.appendChild(document.createTextNode(phoneNumber));
            //TODO add email format checker
            userEmailAddress.appendChild(document.createTextNode(emailAddress));

            customer.appendChild(userName);
            customer.appendChild(userPassword);
            customer.appendChild(userLastName);
            customer.appendChild(userPhoneNumber);
            customer.appendChild(userEmailAddress);



            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();

            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File("src/main/resources/customers"));

            transformer.transform(source, result);



        } catch (ParserConfigurationException | TransformerConfigurationException| NullPointerException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }

    }

}
