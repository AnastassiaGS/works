package adapter;

public class JSONtoXML {
	public static void main(String[] args) {
		XMLAdapter adapter = new XMLAdapter(new JSONPage());
		System.out.println(adapter.getXML());
	}
}