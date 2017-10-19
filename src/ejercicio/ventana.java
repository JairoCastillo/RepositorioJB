package ejercicio;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.*;


public class ventana extends JFrame{
	
	
	private tablero panel; 
	public ventana () {
		setLocationRelativeTo(null);//centra el ejecutable en la pantalla de la maquina
		setDefaultCloseOperation(EXIT_ON_CLOSE);//cierra cuando da la x
        setResizable(false);//no se expanda
        panel= new tablero(this);//crea un panel
        add(panel);
        setVisible(true); //para q se vea
		setSize(600,600);
	}
}
