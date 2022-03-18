package mypackage;

import java.util.Vector;
import java.util.Enumeration;

public class Carre extends Figure {
	private int cote;

	public Carre(int abscisse, int ordonnee, int couleur, int cote) {
		super(abscisse, ordonnee, couleur);
		this.cote = cote;
	}

	public static Vector getInstances() {
		int nCarre = 0;
		Vector instancesCarre = new Vector();
		Vector instances = Figure.getInstances();
		Enumeration e = instances.elements();
		Figure uneFigure;
		while (e.hasMoreElements()) {
			uneFigure = (Figure) e.nextElement();
			if (uneFigure instanceof Carre)
				instancesCarre.add(uneFigure);
		}
		return instancesCarre;
	}

	public String toString()
	{
		return (super.toString()+" "+cote);
	}}
