package mastermind;

import java.awt.Color;
import java.util.Observable;

public class Controler extends Observable
{
	Modele modl;

	public Controler(Modele modele)
	{
		this.modl = modele;
		this.addObserver(modele);
	}

	public void update(Object arg1)
	{
		if (arg1 instanceof Color)
		{
			this.setChanged();
			this.notifyObservers(arg1);
		}
	}

}
