package mastermind;

import java.awt.Color;

public class Rangée implements Comparable<Rangée>
{
	Color[] jetons;
	int indiceJeton;
	int noirs;
	int blancs;
	
	public Rangée(int difficulte)
	{
		this.jetons = new Color[difficulte];
		
		this.indiceJeton = 0;

		this.noirs = 0;
		this.blancs = 0;
	}
	
	public void addColor(Color c)
	{
		if (indiceJeton != 4)
		{
			jetons[indiceJeton] = c;
		}
	}
	
	public void changeResult(int noirs, int blancs)
	{
		this.noirs = noirs;
		this.blancs = blancs;
	}
	
	public boolean state()
	{
		if (this.indiceJeton == jetons.length) return true;
		else return false;
	}

	@Override
	public int compareTo(Rangée arg0)
	{
		int difference = 0;
		int noirs = 0, blancs = 0;
		
		
		for (int i = 0; i < jetons.length; i++)
		{
			if (this.jetons[i] == arg0.jetons[i])
			{
				noirs++;
			}
			else
			{
				int j = i;
				while (j < jetons.length && this.jetons[j] != arg0.jetons[i])
				{
					j++;
				}
				if (this.jetons[j] == arg0.jetons[i])
				{
					blancs++;
					difference++;
				}
				else difference+=2;
			}
		}
		
		arg0.changeResult(noirs, blancs);
		
		return difference;
	}
}
