package mastermind;

import java.awt.Button;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.util.Observable;
import java.util.Observer;

public class VueClavier extends Panel {
	
	private static final long serialVersionUID = 1L;
	
	
	public String[] couleur = {"jaune", "vert", "bleu", "magenta", "rouge", "orange", "blanc", "noir"};
	
	
	public VueClavier(Controler controler) {
		
		for (int i=0; i < couleur.length; i++) {
			Button tmp = new Button(couleur[i]);
			this.add(tmp);
			
			tmp.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		           
		        }
		    });
		}
	}
}
