package jeuvie;

public class Bestiole {

	public final static String VIVANTE="verte";
	public final static String MORTE="rouge";
	public final static String VIRTUELLE="noire";

	private static int compteur=0;

	private final int numero; // seules les constantes statiques sont en majuscules
	private String couleur;

	public Bestiole(String coul) {
		super();
		this.couleur = coul;
		//1er numero = 0 : d'abord je mets la valeur du compteur puis j'incrémente
		this.numero=compteur++;
		//1er numero = 1 : d'abord j'incrémente puis je mets la valeur du compteur
		//this.numero=++compteur; 
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public int getNumero() {
		return numero;
	}

	public boolean isVivante(){
		//boolean rep;
		/* peu lisible mais équivalent
		if (this.couleur=="verte")
			rep = true;
		else
			rep = false;
		*/
		/* mauvaise utilisation des booléens
		if (this.couleur.equals("verte")) {
			rep = true;
		}
		else {
			rep = false;
		}
		return rep;*/
		return this.couleur.equals(VIVANTE);
	}

	@Override
	public String toString() {
		String rep="Bestiole : numero=" + this.numero + ", couleur=" + this.couleur;
		if (this.isVivante()) {
			rep+=" (vivante)";
		}
		return rep;
	}

	



	
	

}
