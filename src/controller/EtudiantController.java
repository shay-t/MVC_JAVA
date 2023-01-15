package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import metier.EtudiantMetier;
import model.Etudiant;
import net.proteanit.sql.DbUtils;
import views.EtudiantForm;
public class EtudiantController implements ActionListener ,MouseListener{
	
	EtudiantForm eff;
	public EtudiantController(EtudiantForm ef) {
		eff=ef;
	}
    //Pour 
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == eff.ajouter) {
			JOptionPane.showConfirmDialog(null, "coucou les amis");
			int K= Integer.parseInt(eff.t4.getText());
			Etudiant pp=new Etudiant(eff.t1.getText(),eff.t2.getText(),eff.t3.getText(),K);
			 //normalement insertion bd 
			
	        //metier
			EtudiantMetier metier =new EtudiantMetier();
			metier.InsererEtudiant(pp);
		}else if(e.getSource()==eff.refresh) {
			EtudiantMetier metier =new EtudiantMetier();
			ResultSet rs=metier.AfficherEtudiants();
			System.out.println("a");
		    eff.table.setModel(DbUtils.resultSetToTableModel(rs));
		}
		else if(e.getSource()==eff.modifier) {
			
		}
		
	}
	//

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hello baby");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hello  fish");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
   
}

