package mastermind;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Observable;
import java.util.Observer;

public class VuePropositions extends Canvas implements Observer {
	
	public VuePropositions() {
		this.setBackground (Color.GRAY);
		this.setSize(400, 700);
	}
	
	public void paint(Graphics g) {
		Graphics2D g2;
        g2 = (Graphics2D) g;
	}
	
	

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}
}
