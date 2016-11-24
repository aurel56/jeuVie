package controleur;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import ihm.IHMSwing;
import jeuvie.Bestiole;

public class Controleur {

	// la fen�tre est initialis�e � null. Son contenu sera cr�� lors du 1er appel � la m�thode setBestiole.
	private static IHMSwing fenetre=null;
	
	// Deux constantes qui permettent de d�finir la taille de la fen�tre
	private static final byte LARGEUR = 100; // la largeur de l'oc�an correspond � la largeur de la fen�tre 
	private static final byte HAUTEUR = 100; // la longueur de l'oc�an correspond � la hauteur de la fen�tre
	
	// Dans cet exemple, les oc�ans seront bleus.
	private static final Color COULEUR_OCEAN=Color.blue;
	
	
	/**
	 * � la cr�ation d'une instance de Controleur, une matrice de points est cr��e.
	 * Un contr�leur contr�le une fen�tre (donc une matrice de points).
	 */
	public Controleur() {
		super();
		
		fenetre = new IHMSwing("oc�ans "+LARGEUR+"x"+HAUTEUR+" bleu");
		List<List<Color>> matriceBleue = new ArrayList<List<Color>> (HAUTEUR);
		for (int k = 0; k < HAUTEUR; k++) {
			List<Color> ligne = new ArrayList<Color>(LARGEUR);
			for (int l = 0; l < LARGEUR; l++) {
				ligne.add(COULEUR_OCEAN);
			}
			matriceBleue.add(ligne);
		}
		fenetre.setMatrice(matriceBleue);

	}

	/**
	 * Une fonction utile pour le premier TP permettant de placer une bestiole dans un oc�an 
	 * @param coordX : l'abscisse
	 * @param coordY : l'ordonn�e
	 */
	public void setBestiole(Bestiole b, int coordX,int coordY){
		// Lorsque nous sommes ici, la matrice est d�j� initialis�e. Il ne reste plus qu'� poser la bestiole � l'endroit souhait�.
		fenetre.setPoint(Controleur.getCouleur(b), coordX, coordY);
	}
	
	/**
	 * Cette m�thode priv�e permet de transformer une chaine de caract�res du m�tier (String) en couleur pour l'ihm (Color)
	 * NB: cette m�thode est statique car elle ne d�pend pas de l'instance de Controleur, son r�sultat ne d�pend que de son param�tre
	 * Elle est rang�e ici car elle sert de tampon entre le m�tier et l'ihm
	 * NB : Nous avons vu en cours les enum, ceux-ci permettent de limiter le nombre de valeurs possibles, en chaine de caract�res, pour les couleurs
	 * des bestioles. Ils seraient donc totalement adapt�s dans notre cas. Mais chaque chose en son temps, ils seront utilis�s par la suitelors du TP4.
	 * 
	 * Seules le couleurs noire, rouge et verte sont actuellement prises en compte.  
	 *  
	 * @param b la bestiole qui contient sa couleur sous la forme d'une chaine de caract�res
	 * @return la couleur de cette bestiole selon les instances de la classe Color
	 */
	private static Color getCouleur(Bestiole b) {
		Color reponse = Color.black;
		if (b.getCouleur().equals("verte")) {
			reponse= Color.green;
		}
		else if (b.getCouleur().equals("rouge")) {
			reponse= Color.red;
		}
		return reponse;
	}
	
	
	
}


