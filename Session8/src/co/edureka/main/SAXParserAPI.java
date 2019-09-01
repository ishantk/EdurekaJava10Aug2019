package co.edureka.main;

import java.io.File;
import java.io.FileInputStream;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

class MyHandler extends DefaultHandler{
	
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		//System.out.print("<"+qName+">");
	}
	
	public void characters(char[] ch, int start, int length) throws SAXException {
		String textData = new String(ch, start, length);
		System.out.print(textData);
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		//System.out.println("</"+qName+">");
	}
	
}

public class SAXParserAPI {

	public static void main(String[] args) {
		
		try {
			
			//File file = new File("/Users/ishantkumar/Downloads/customers.xml");
			//FileInputStream stream = new FileInputStream(file);
			
			FileInputStream stream = new FileInputStream(new File("/Users/ishantkumar/Downloads/customers.xml"));
			
			MyHandler handler = new MyHandler();
			
			//SAXParserFactory factory = SAXParserFactory.newInstance();
			//SAXParser parser = factory.newSAXParser();
			
			SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
			
			// parse method will internally execute the methods of MyHandler class for us with information :)
			parser.parse(stream, handler); // SAX Parse now shall work automatically for us
			
			
		} catch (Exception e) {
			System.out.println(">> Some Excepption: "+e);
		}
		

	}

}
