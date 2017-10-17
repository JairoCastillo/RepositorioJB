package ejercicio;
import java.awt.*;
import javax.swing.*;


public class Jfame extends JFrame{

	PanelCentro panelcentro;
	
	Jfame(){
		super("Banco Udec");
		iniciar();
		componente();
		setVisible(true);
		 pack();
		setLocationRelativeTo( null );
	}

public Jfame iniciar(){
		
		Dimension dims = new Dimension(800, 750);
		this.setSize(dims);
		this.setPreferredSize(dims);
		this.getContentPane( ).setLayout( new BorderLayout( ) );
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		return this;
	}

public void componente() {
	
	panelcentro = new PanelCentro();
	add(panelcentro, BorderLayout.CENTER );
	 
}



}

