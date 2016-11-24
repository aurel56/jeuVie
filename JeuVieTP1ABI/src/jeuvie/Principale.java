package jeuvie;

import controleur.Controleur;

public class Principale {

	public static void main(String[] args) {
		Bestiole b1 = new Bestiole("verte");
		Bestiole b2 = new Bestiole("rouge");
		Bestiole b3 = new Bestiole("noire");
		
		/*System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b1.isVivante());
		System.out.println(b2.isVivante());
		System.out.println(b3.isVivante());*/

		Controleur ctrleur = new Controleur();
		/*ctrleur.setBestiole(b1, 10, 10);
		ctrleur.setBestiole(b2, 15, 10);
		ctrleur.setBestiole(b3, 15, 15);*/
		//dessinerLigne(ctrleur, 10, 20, 50);
		//dessinerColonne(ctrleur, 20, 10, 50);
		dessinerCarrePlein(ctrleur, 50, 30, 40);
		dessinerRectanglePlein(ctrleur, 55, 40, 10, 25);
		dessinerPyramide(ctrleur, 21, 30, 20);
		
	}
	
	public static void dessinerLigne(Controleur c, int premiereColonne, int ligne, int taille) {
		Bestiole b = new Bestiole(Bestiole.VIVANTE);
		for (int i = 0; i < taille; i++) {
			c.setBestiole(b, i+premiereColonne, ligne);
		}
	}
	public static void dessinerColonne(Controleur c, int colonne, int premiereLigne, int taille) {
		Bestiole b = new Bestiole(Bestiole.MORTE);
		for (int i = 0; i < taille; i++) {
			c.setBestiole(b, colonne, i+premiereLigne);
		}
	}
	
	// TODO dessiner un carré en utilisant dessinerColonne
	// TODO dessiner un carré en utilisant dessinerRectangle
	public static void dessinerCarrePlein(Controleur c, int premiereColonne, int premiereLigne, int taille) {
		for (int i = 0; i < taille; i++) {
			dessinerLigne(c, premiereColonne, premiereLigne+i, taille);
		}
	}
	
	// TODO dessiner un rectangle en utilisant dessinerLigne
	public static void dessinerRectanglePlein(Controleur c, int premiereColonne,
			                            int premiereLigne, int largeur, int hauteur) {
		for (int i = 0; i < largeur; i++) {
			dessinerColonne(c, premiereColonne+i, premiereLigne, hauteur);
		}
	}

	// TODO Dessiner un rectangle creux (on ne dessine que les bords)
	
	//TODO dessiner une pyramide d'une hauteur donnée 
	public static void dessinerPyramide(Controleur c, int sommetX, int sommetY, int hauteur) {
		
	}

	// TODO Dessiner une pyramide inversée
	// TODO dessiner un losange en utilisant les deux pyramides (attention à la ligne du milieu)

	
}
