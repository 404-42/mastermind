package mastermind;

import java.awt.Color;

public class Modele
{
	Color[] COULEURS;
	int N_TENTATIVES;
	int DIFFICULTE;
	enum Etat {EN_COURS, GAGNE, PERDU};
	
	public Modele()
	{
		this.COULEURS = new Color[] {Color.YELLOW, Color.GREEN, Color.BLUE, Color.MAGENTA, Color.RED, Color.ORANGE, Color.WHITE, Color.BLACK};
		
		this.N_TENTATIVES = 10;
		this.DIFFICULTE = 4;
	}
}
