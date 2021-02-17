package mastermind;

import java.awt.Button;
import java.awt.Panel;
import java.util.Observable;
import java.util.Observer;

public class VueClavier extends Panel implements Observer {
	
	private static final long serialVersionUID = 1L;
	
	
	public Button jaune;
	public Button vert;
	public Button bleu;
	public Button magenta;
	public Button rouge;
	public Button orange;
	public Button blanc;
	public Button noir;
	
	public VueClavier() {
		jaune = new Button("jaune");
		vert = new Button("vert");
		bleu = new Button("bleu");
		magenta = new Button("magenta");
		rouge = new Button("rouge");
		orange = new Button("orange");
		blanc = new Button("blanc");
		noir = new Button("noir");
		
		this.add(this.jaune);
		this.add(this.vert);
		this.add(this.bleu);
		this.add(this.magenta);
		this.add(this.rouge);
		this.add(this.orange);
		this.add(this.blanc);
		this.add(this.noir);
	}
	
	

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}
}
