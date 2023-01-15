package views;

import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import controller.EtudiantController;

public class EtudiantForm extends JFrame{
	public JTextField t1,t2,t3,t4;
	public JLabel l1,l2,l3,l4;
	public JButton supprimer,ajouter,modifier,refresh;
	public JTable  table;
	 //constructeur
	public EtudiantForm() {
		
		table= new JTable();
		
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		t4=new JTextField();
		
		l1= new JLabel("Prénom");
		l2= new JLabel("nom");
		l3= new JLabel("Adresse");
		l4= new JLabel("Age");
		
		
		
		ajouter=new JButton("Ajouter");
		supprimer =new JButton("supprimer");
		modifier= new JButton ("modifier");
		refresh= new JButton("refresh");
		
		
		
		
		//x,y , width, height
		l1.setBounds(20,20,80,30);
		l2.setBounds(20,60,80,30);
		l3.setBounds(20,100,80,30);
		l4.setBounds(20,140,80,30);
		
		t1.setBounds(70,20,170,30);
		t2.setBounds(70,60,170,30);
		t3.setBounds(70,100,170,30);
		t4.setBounds(70,140,170,30);
		
		
		ajouter.setBounds(70,200,80,30);
		supprimer.setBounds(160,200,100,30);
		modifier.setBounds(270,200,100,30);
		refresh.setBounds(380,200,100,30);
		table.setBounds(500,20,300,300);
		
		
		//listenner 
		ajouter.addActionListener(new EtudiantController(this));
		//clear.addMouseListener(new EtudiantController(this));
		supprimer.addActionListener(new EtudiantController(this));
		modifier.addActionListener(new EtudiantController(this));
		refresh.addActionListener(new EtudiantController(this));
		
		getContentPane().add(l1);
		getContentPane().add(l2);
		getContentPane().add(l3);
		getContentPane().add(l4);
		
		getContentPane().add(t1);
		getContentPane().add(t2);
		getContentPane().add(t3);
		getContentPane().add(t4);
		
		getContentPane().add(ajouter);
		getContentPane().add(supprimer);
		getContentPane().add(modifier);
		getContentPane().add(refresh);
		
		
		getContentPane().add(table);
		

		getContentPane().setLayout(null);
		setBounds(50,50,900,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	

}
