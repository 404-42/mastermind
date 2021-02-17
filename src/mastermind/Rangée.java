package mastermind;

import java.awt.Color;

public class Rangée
{
	Color[] jetons;
	int indiceJeton;
	int[] noirs;
	int[] blancs;
	
	public Rangée(int difficulte)
	{
		this.jetons = new Color[difficulte];
		
		this.indiceJeton = 0;
		
		this.noirs = new int[difficulte];
		this.blancs = new int[difficulte];
	}
	
	public void addColor(Color c)
	{
		if (indiceJeton != 4)
		{
			jetons[indiceJeton] = c;
		}
	}
}
