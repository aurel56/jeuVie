package ihm;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class IHMSwing extends JFrame{

	private final static int COTE = 3;

	// Vous aurez peut être à ajuster cette prise en compte du décalage avec les bords de fenêtre "windows"
	private static final int DELTA_Y = 20;
	private static final byte DELTA_X = 4;

	private static int ihmLargeur;
	private static int ihmLongueur;

	private List<List<Color>> matrice = null;

	public void setPoint(Color couleur, int i, int j){
		(matrice.get(j)).set(i, couleur);
	}
	
	public void setMatrice(List<List<Color>> matrice) {
		this.matrice = matrice;
		ihmLongueur = matrice.size() * (COTE + 1) + 1;
		if (!matrice.isEmpty()) {
			ihmLargeur= ((matrice.get(0)).size()) * (COTE + 1) + 1;
		}
		setSize(ihmLargeur+DELTA_X, ihmLongueur+DELTA_Y);
	}

	class Fermeur extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

	public IHMSwing(String title) {
		super(title);
		addWindowListener(new Fermeur());
		setVisible(true);
	}

	public void paint(Graphics g) {
		int y = 0;
		g.setColor(Color.gray);
		g.fillRect(DELTA_X, DELTA_Y, ihmLargeur, ihmLongueur);
		for (List<Color> ligne : matrice) {
			int x = 0;
			for (Color point : ligne) {
				g.setColor(point);
				g.fillRect(x+DELTA_X, y+DELTA_Y, COTE, COTE);
				x += COTE + 1;
			}
			y += COTE + 1;
		}

	}

}
