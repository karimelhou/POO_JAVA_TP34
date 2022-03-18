package mypackage;

import java.util.Vector;
import java.util.Enumeration;

public class TestFigure {
	public static void main(String[] argv) {
		Figure f1 = new Figure(1, 1, 1);
		Figure f2 = new Figure(2, 2, 2);
		Rectangle r2 = new Rectangle(6, 6, 6, 6, 6);
		Carre c3 = new Carre(3, 3, 3, 3);
		Figure f4 = new Figure(4, 4, 4);
		Carre c5 = new Carre(5, 5, 5, 5);
		Rectangle r1 = new Rectangle(9, 9, 9, 9, 6);

		System.out.println("Liste des figures : ");
		Enumeration e = Figure.getInstances().elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

		System.out.println("Liste des carres : ");
		e = Carre.getInstances().elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

		System.out.println("Liste des Rectangles : ");
		e = Carre.getInstances().elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}