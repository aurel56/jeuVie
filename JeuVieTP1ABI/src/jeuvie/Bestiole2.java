package jeuvie;

public class Bestiole2 { 
	private final int numero;
	private String couleur;
	private static int compteur = 0;
	
	
	
	public int getNumero() {
		return numero;
	}

	public static int getCompteur() {
		return compteur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public Bestiole2(String couleur) {
		super();
		this.couleur = couleur;
	
	this.numero = compteur++;
	
	
	
	}
}


