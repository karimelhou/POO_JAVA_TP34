package mypackage;

import java.util.ArrayList;
import java.util.List;

public class ListeDeDocuments {
	private List<Document> l1;

	public ListeDeDocuments() {
		l1 = new ArrayList<Document>();
	}

	public void ajouteDocument(Document Document) {
		l1.add(Document);
	}

	public void tousLesAuteurs() {
		Document Document;
		for (int i = 0; i < l1.size(); i++) {
			Document = l1.get(i);
			System.out.print(Document.getnumEnregistrement());
			if (Document instanceof Livree)
				System.out.println(" " + ((Livree) Document).getAuteur());
			else
				System.out.println();
		}
	}

	public void tousLesDocuments() {
		Document Document;
		for (int i = 0; i < l1.size(); i++) {
			Document = l1.get(i);
			System.out.println(Document);
		}
	}

	public static void main(String[] args) {

	}
}
