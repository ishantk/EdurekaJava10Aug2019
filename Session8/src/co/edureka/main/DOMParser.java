package co.edureka.main;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMParser {

	public static void main(String[] args) {
		
		try {
			
			// 1. Create a File Object to be read
			File file = new File("/Users/ishantkumar/Downloads/customers.xml");
			
			// 2. Create Document Object which shall XML file as Tree Object
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(file); // Read XML file and create a Tree Structure :) 
						
			// 3. Read Root Element in XML file
			String rootElm = document.getDocumentElement().getNodeName();
			System.out.println(">> Root Element in "+file.getName()+" is: "+rootElm);
			
			NodeList nodes = document.getElementsByTagName("customer");
			System.out.println(">> "+nodes.getLength()+" customer tages found in "+file.getName());
			
			System.out.println();
			
			System.out.println("****************************");
			for(int i=0;i<nodes.getLength();i++) {
				Node node = nodes.item(i);
				Element element = (Element)node;
				System.out.println(">> Name: "+element.getElementsByTagName("name").item(0).getTextContent());
				System.out.println(">> Phone: "+element.getElementsByTagName("phone").item(0).getTextContent());
				System.out.println(">> Email: "+element.getElementsByTagName("email").item(0).getTextContent());
				System.out.println("****************************");
			}
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
			e.printStackTrace(); // This shall print the line numbers where exception came in !
		}
		

	}

}
