package dom;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import model.Recipients;

public class DomRecipient {
	public List<Recipients> parse(Document document) throws FileNotFoundException, XMLStreamException {
		NodeList nodeList = document.getElementsByTagName("Recipient");
		List<Recipients> recipients = new ArrayList<Recipients>();
		for (int i = 0; i < nodeList.getLength(); i++) {
			recipients.add(getRecipient(nodeList.item(i)));
		}
		return recipients;
	}

	private static Recipients getRecipient(Node node) {
		NamedNodeMap attributes = node.getAttributes();
		Node nameAttrib = attributes.getNamedItem("id");
		String id = nameAttrib.getNodeValue();
		Recipients recipient = new Recipients();
		Element element = (Element) node;
		recipient.setId(Integer.parseInt(id));
		recipient.setEmail(getTagValue("email", element));
		recipient.setText(getTagValue("text", element));
		return recipient;
	}

	private static String getTagValue(String tag, Element element) {
		NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = nodeList.item(0);
		return node.getNodeValue();

	}

}
