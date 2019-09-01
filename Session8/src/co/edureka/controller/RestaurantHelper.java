package co.edureka.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import co.edureka.model.Restaurant;


/*
 
 // DesignPattern : Singleton
 class DocumentBuilderFactory{
	
	private static DocumentBuilderFactory factory = new DocumentBuilderFactory();

	public static DocumentBuilderFactory newInstance(){
		return factory;
	}
}

DocumentBuilderFactory obj = DocumentBuilderFactory.newInstance();
 
*/

public class RestaurantHelper {
	
	// Restaurant Object is passed as an input to this method
	// This method must be saving a Single restaurant Object
	public void saveRestaurant(Restaurant restaurant) {
		
		try {
			
			// 1. Create File and FileOutputStream Objects
			File file = new File("/Users/ishantkumar/Downloads/restaurants_1_9_19.xml");
			FileOutputStream stream = new FileOutputStream(file);
			
			// 2. Create Document Object which shall represent XML
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.newDocument(); // This Document represents an empty XML document with just Prolog Statement 
			
			// 3. Generate Elements for XML File
			Element elmRoot = document.createElement("restaurants");
			Element elmRestaurant = document.createElement("restaurant");
			Element elmName = document.createElement("name");
			Element elmPhone = document.createElement("phone");
			Element elmAddress = document.createElement("address");
			Element elmCategory = document.createElement("category");
			Element elmOHours = document.createElement("openingHours");
			Element elmCHours = document.createElement("closingHours");
			Element elmPrice = document.createElement("priceForTwoPeople");
			
			// 4. Read Data from Object and put in createTextNode method to save the data in XML file
			Text txtName = document.createTextNode(restaurant.name);
			Text txtPhone = document.createTextNode(restaurant.phone);
			Text txtAddress = document.createTextNode(restaurant.address);
			Text txtCategory = document.createTextNode(restaurant.category);
			Text txtOHours = document.createTextNode(restaurant.openingHours);
			Text txtCHours = document.createTextNode(restaurant.closingHours);
			Text txtPrice = document.createTextNode(String.valueOf(restaurant.priceForTwoPeople));
			
			// 5. Append the Nodes
			elmName.appendChild(txtName);
			elmPhone.appendChild(txtPhone);
			elmAddress.appendChild(txtAddress);
			elmCategory.appendChild(txtCategory);
			elmOHours.appendChild(txtOHours);
			elmCHours.appendChild(txtCHours);
			elmPrice.appendChild(txtPrice);
			
			elmRestaurant.appendChild(elmName);
			elmRestaurant.appendChild(elmPhone);
			elmRestaurant.appendChild(elmAddress);
			elmRestaurant.appendChild(elmCategory);
			elmRestaurant.appendChild(elmOHours);
			elmRestaurant.appendChild(elmCHours);
			elmRestaurant.appendChild(elmPrice);
			
			elmRoot.appendChild(elmRestaurant);
			
			document.appendChild(elmRoot);
			
			// 6. Convert Document Object into XML File
			DOMSource source = new DOMSource(document);     // Who is suppose to get converted into XML File
			StreamResult result = new StreamResult(stream); // Where we wish to write Data i.e. XML File
			
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			transformer.transform(source, result);
			
			System.out.println(">> XML file "+file.getName()+" saved with details for "+restaurant.name);
			
		}catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
		
		
	}
	
	// Restaurant ArrayList is passed as an input to this method
	// This method must be saving a Multiple restaurant Objects
	public void saveRestaurant(ArrayList<Restaurant> restaurants) {
		
		// Implement this method :)
		
		for(Restaurant restaurant : restaurants) {
			
			// Your Code goes here :)
		}
		
		
	}

}
