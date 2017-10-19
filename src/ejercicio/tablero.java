package ejercicio;

import java.awt.Color;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class tablero extends JPanel implements ActionListener {
	private JButton J1,J2,J3,J4,J5,J6,J7,J8,J9,J0,JCan,JLim,JSal,JBIns;
	private JTextField JTInserta;
	private ventana ventana;
	private JLabel JLIns,JLMen;
	public tablero(ventana ventana) {
		
		 J1= new JButton("1");
	     J1.addActionListener(this);//escuchador
	     J1.setActionCommand("1");//crea un comando
	     J1.setBounds(150,200,100,15);
	     add(J1);
	     
	     J2= new JButton("2");
	     J2.addActionListener(this);//escuchador
	     J2.setActionCommand("2");//crea un comando
	     J2.setBounds(200,300,100,15);
	     add(J2);
		
	     J3= new JButton("3");
	     J3.addActionListener(this);//escuchador
	     J3.setActionCommand("3");//crea un comando
	     J3.setBounds(250,200,100,15);
	     add(J3);
		
	     J4= new JButton("4");
	     J4.addActionListener(this);//escuchador
	     J4.setActionCommand("4");//crea un comando
	     J4.setBounds(300,200,100,15);
	     add(J4);
		
	     J5= new JButton("5");
	     J5.addActionListener(this);//escuchador
	     J5.setActionCommand("5");//crea un comando
	     J5.setBounds(350,200,100,15);
	     add(J5);
		
	     J6= new JButton("6");
	     J6.addActionListener(this);//escuchador
	     J6.setActionCommand("6");//crea un comando
	     J6.setBounds(400,200,100,15);
	     add(J6);
	
	     J7= new JButton("7");
	     J7.addActionListener(this);//escuchador
	     J7.setActionCommand("7");//crea un comando
	     J7.setBounds(450,200,100,15);
	     add(J7);
		
	     J8= new JButton("8");
	     J8.addActionListener(this);//escuchador
	     J8.setActionCommand("8");//crea un comando
	     J8.setBounds(500,200,100,15);
	     add(J8);
		
	     J9= new JButton("9");
	     J9.addActionListener(this);//escuchador
	     J9.setActionCommand("9");//crea un comando
	     J9.setBounds(550,200,100,15);
	     add(J9);
		
	     J0= new JButton("0");
	     J0.addActionListener(this);//escuchador
	     J0.setActionCommand("0");//crea un comando
	     J0.setBounds(600,200,100,15);
	     add(J0);
		
	     JCan= new JButton("Cancelar");
	     JCan.addActionListener(this);//escuchador
	     JCan.setActionCommand("Cancelar");//crea un comando
	     JCan.setBounds(500,300,100,15);
	     add(JCan);
		
	     JLim= new JButton("Limpiar");
	     JLim.addActionListener(this);//escuchador
	     JLim.setActionCommand("Limpiar");//crea un comando
	     JLim.setBounds(500,300,100,15);
	     add(JLim);
		
	     JSal= new JButton("Salir");
	     JSal.addActionListener(this);//escuchador
	     JSal.setActionCommand("Sali");//crea un comando
	     JSal.setBounds(500,300,100,15);
	     add(JSal);
		
	     JLIns=new JLabel("Inserte su tarjeta");
	     JLIns.setForeground(Color.black);
	     JLIns.setBounds(200,50,60,15);
	     add(JLIns);
	     
	     JTInserta=new JTextField();
	     JTInserta.setBounds(250,50,90,15);
	     add(JTInserta);
	     
	     JLMen=new JLabel("Retire su dinero");
	     JLMen.setForeground(Color.black);
	     JLMen.setBounds(200,50,60,15);
	     add(JLMen);
	     
	     
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
