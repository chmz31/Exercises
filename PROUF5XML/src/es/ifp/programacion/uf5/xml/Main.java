package es.ifp.programacion.uf5.xml;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        File file = new File("alumnos.xml");
		
		
		//Crear una instancia para trabajar con el documento
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		//Creo una instancia documentBuilder para parsear el documento XML
		DocumentBuilder db;
		Document doc;
		
		try {
			db = dbf.newDocumentBuilder();
			doc = db.parse(file);
			
			doc.getDocumentElement().normalize();
			System.out.println("Elemento raíz:"+doc.getDocumentElement().getNodeName());
			
			NodeList nodeList = doc.getElementsByTagName("estudiante"); 
			Node nodo;
			int size = nodeList.getLength();
			for (int i=0; i<size; i++) {
				nodo = nodeList.item(i);
			 if (nodo.getNodeType()==Node.ELEMENT_NODE) { //Tiene elementos hijos 
				 Element eElement = (Element)nodo;
				 String tmp;
				tmp = eElement.getElementsByTagName("id").item(0).getTextContent(); 
				 System.out.println("ID Alumno:"+tmp);
				tmp = eElement.getElementsByTagName("nombre").item(0).getTextContent(); 
				 System.out.println("Nombre Alumno:"+tmp);
				tmp = eElement.getElementsByTagName("apellidos").item(0).getTextContent(); 
				 System.out.println("Apellidos Alumno:"+tmp);
			 }
			
			}
		
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Se ha producido un error al parsear el documento.");
		}
		
	}

}
