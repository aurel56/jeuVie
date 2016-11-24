package controleur;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import ihm.IHMSwing;
import jeuvie.Bestiole;

public class Controleur {

	// la fenêtre est initialisée à null. Son contenu sera créé lors du 1er appel à la méthode setBestiole.
	private static IHMSwing fenetre=null;
	
	// Deux constantes qui permettent de définir la taille de la fenêtre
	private static final byte LARGEUR = 100; // la largeur de l'océan correspond à la largeur de la fenêtre 
	private static final byte HAUTEUR = 100; // la longueur de l'océan correspond à la hauteur de la fenêtre
	
	// Dans cet exemple, les océans seront bleus.
	private static final Color COULEUR_OCEAN=Color.blue;
	
	
	/**
	 * à la création d'une instance de Controleur, une matrice de points est créée.
	 * Un contrôleur contrôle une fenêtre (donc une matrice de points).
	 */
	public Controleur() {
		super();
		
		fenetre = new IHMSwing("océans "+LARGEUR+"x"+HAUTEUR+" bleu");
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
	 * Une fonction utile pour le premier TP permettant de placer une bestiole dans un océan 
	 * @param coordX : l'abscisse
	 * @param coordY : l'ordonnée
	 */
	public void setBestiole(Bestiole b, int coordX,int coordY){
		// Lorsque nous sommes ici, la matrice est déjà initialisée. Il ne reste plus qu'à poser la bestiole à l'endroit souhaité.
		fenetre.setPoint(Controleur.getCouleur(b), coordX, coordY);
	}
	
	/**
	 * Cette méthode privée permet de transformer une chaine de caractères du métier (String) en couleur pour l'ihm (Color)
	 * NB: cette méthode est statique car elle ne dépend pas de l'instance de Controleur, son résultat ne dépend que de son paramètre
	 * Elle est rangée ici car elle sert de tampon entre le métier et l'ihm
	 * NB : Nous avons vu en cours les enum, ceux-ci permettent de limiter le nombre de valeurs possibles, en chaine de caractères, pour les couleurs
	 * des bestioles. Ils seraient donc totalement adaptés dans notre cas. Mais chaque chose en son temps, ils seront utilisés par la suitelors du TP4.
	 * 
	 * Seules le couleurs noire, rouge et verte sont actuellement prises en compte.  
	 *  
	 * @param b la bestiole qui contient sa couleur sous la forme d'une chaine de caractères
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


