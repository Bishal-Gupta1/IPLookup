package ResouceIP;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class IPLookUP {

	private String url;
	public Document doc;

	public IPLookUP(String IPaddress) throws Exception {
		url = "https://whatismyipaddress.com/ip/" + IPaddress;
		try {
			doc = Jsoup.connect(url).get();
			details();
		} catch (Exception e) {
			throw e;
		}
	}

	public void details() {
		System.out.println(doc.getElementsByTag("P").first().text());
		System.out.println("____________________________\n");

		System.out.println(doc.select("p.information:nth-of-type(1)").first().text());
		System.out.println(doc.select("p.information:nth-of-type(2)").first().text());
		System.out.println(doc.select("p.information:nth-of-type(3)").first().text());
		System.out.println(doc.select("p.information:nth-of-type(4)").first().text());
		System.out.println(doc.select("p.information:nth-of-type(5)").first().text());
		System.out.println(doc.select("p.information:nth-of-type(6)").first().text());
		System.out.println(doc.select("p.information:nth-of-type(7)").first().text());
		System.out.println(doc.select("p.information:nth-of-type(8)").first().text());
		System.out.println(doc.select("p.information:nth-of-type(9)").first().text());
		System.out.println(doc.select("p.information:nth-of-type(10)").first().text());
		System.out.println(doc.select("p.information:nth-of-type(1)").last().text());
		System.out.println(doc.select("p.information:nth-of-type(2)").last().text());
		System.out.print("\n\n" + "Status :  ");
		System.out.println(isSafeIP() ? "OK" : "Not OK(Seems Fishy)");
	}

	public boolean isSafeIP() {
		long size = doc.getElementsByTag("p").text().length();
		return (size > 800 && size < 1200);
	}
}
