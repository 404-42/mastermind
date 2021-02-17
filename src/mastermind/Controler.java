package mastermind;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

public class Controler extends Observable implements Observer
{
	Modele modl;

	public Controler(Modele modele)
	{
		this.modl = modele;
		this.addObserver(modele);
	}

	@Override
	public void update(Observable arg0, Object arg1)
	{
		if (arg1 instanceof Color)
		{
			this.setChanged();
			this.notifyObservers(arg1);
		}
	}

}
