package mastermind;

/*
 * @author: BOTTI Joakim
 */


import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;



public class Vue extends Frame implements WindowListener {
	
	
	private static final long serialVersionUID = 1L;
	
	

	public static void main(String[] args) {
		new Vue();
	}
	
	public void Vue() {
		Modele modele = new  Modele();
		Controler controler = new Controler();
		
		
		
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
}
