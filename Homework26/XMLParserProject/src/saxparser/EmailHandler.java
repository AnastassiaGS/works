package saxparser;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import modele.Email;

public class EmailHandler extends DefaultHandler {

	private List<Email> emails;
	private Email email;
	boolean bEmailOfReceiver = false;
	boolean bSubject = false;
	boolean bBodyOfEmail = false;

	public List<Email> getEmails() {
		return emails;
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

		if (qName.equalsIgnoreCase("email")) {
			String id = attributes.getValue("id");
			email = new Email();
			email.setId(Integer.parseInt(id));
			if (emails == null) {
				emails = new ArrayList<>();
			}
		} else if (qName.equalsIgnoreCase("emailOfReceiver")) {
			bEmailOfReceiver = true;
		} else if (qName.equalsIgnoreCase("subject")) {
			bSubject = true;
		} else if (qName.equalsIgnoreCase("bodyOfEmail")) {
			bBodyOfEmail = true;
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (qName.equalsIgnoreCase("email")) {
			emails.add(email);
		}
	}

	@Override
	public void characters(char ch[], int start, int length) throws SAXException {

		if (bEmailOfReceiver) {
			email.setEmailOfReceiver(new String(ch, start, length));
			bEmailOfReceiver = false;
		} else if (bSubject) {
			email.setSubject(new String(ch, start, length));
			bSubject = false;
		} else if (bBodyOfEmail) {
			email.setBodyOfEmail(new String(ch, start, length));
			bBodyOfEmail = false;
		}
	}
}
