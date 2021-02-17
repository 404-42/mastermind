package mastermind;

import java.awt.BorderLayout;

/*
 * @author: BOTTI Joakim
 */


import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Observable;
import java.util.Observer;


public class Vue extends Frame implements WindowListener, Observer {
	
	
	private static final long serialVersionUID = 1L;
	
	

	public static void main(String[] args) {
		new Vue();
	}

	public Vue() {
		System.out.println("lancement du programme...");
		Modele modele = new  Modele();
		Controler controler = new Controler(modele);
		
		this.setLayout(new BorderLayout());
		
		VueClavier clavier = new VueClavier(controler);
		this.add(clavier, BorderLayout.SOUTH);
		
		VuePropositions canvas = new VuePropositions();
		this.add(canvas, BorderLayout.NORTH);
		
		this.addWindowListener(this);
		this.setTitle("Mastermind");
		this.setSize(400, 800);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.exit(0); 
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		// arg1 = class rangée; 
		// if ranger.state() == false => metre couleur en bas
		// else ecrire sur la prochaine ligne en partant du haut
		Rangée ranger = (Rangée) arg1;
		
		if (!ranger.state()) {
		
		} else {
			
		}
	}
}
