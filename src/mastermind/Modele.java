package mastermind;

import java.awt.Color;

public class Modele
{
	Color[] COULEURS;
	int N_TENTATIVES;
	int DIFFICULTE;
	enum Etat {EN_COURS, GAGNE, PERDU};
	
	
	Etat état;
	Rangée combinaison;
	Rangée[] propositions;
	int tentative;
	
	public Modele()
	{
		this.COULEURS = new Color[] {Color.YELLOW, Color.GREEN, Color.BLUE, Color.MAGENTA, Color.RED, Color.ORANGE, Color.WHITE, Color.BLACK};
		
		this.N_TENTATIVES = 10;
		this.DIFFICULTE = 4;
	
		
		this.état = Etat.EN_COURS;
		this.combinaison = new Rangée(this.DIFFICULTE);
		
		for (int i = 0; i < 4; i++) this.combinaison.addColor(this.COULEURS[(int) Math.round(Math.random() * COULEURS.length)]);
		
		this.propositions = new Rangée[this.N_TENTATIVES];
		this.tentative = -1;
	}
}
