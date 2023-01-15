package metier;
import java.sql.ResultSet;

import DA.creud;
import model.Etudiant;

public class EtudiantMetier {
	 
   public void InsererEtudiant(Etudiant et) {
	   creud.inserer(et);
   }
   public ResultSet AfficherEtudiants() {
	   return creud.sel();
   }
}
