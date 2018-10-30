package adapter;

import org.json.JSONObject;
import org.json.XML;

public class XMLAdapter extends XMLPage {
	private JSONPage converter;

	public XMLAdapter(JSONPage converter) {
		this.converter = converter;
	}

	@Override
	public String getXML() {
		JSONObject json = new JSONObject(converter.getJSON().toString());
		String str = XML.toString(json);
		return str;
	}
}
