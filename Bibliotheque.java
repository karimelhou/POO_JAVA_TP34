package mypackage;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {

	public static void main(String[] args) {
		Document document = new Document("Destiny");
		Livree livre = new Livree("MyFate", "Unknown", 300);
		Dictionnaire dictionnaire = new Dictionnaire("OXford", "English-English", 5);

		System.out.println(document.getTitre());
		System.out.println(livre.getTitre());
		System.out.println(dictionnaire.getTitre());

		List<Document> l1 = new ArrayList<Document>();
		l1.ajouteDocument(document);
		l1.ajouteDocument(livre);
		l1.ajouteDocument(dictionnaire);
		l1.tousLesAuteurs();
		l1.tousLesDocuments();

	}

}
