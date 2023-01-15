package DA;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;





public class creud {
	public static Connection con;
	//se connecter a la base
	public static void connecter() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//System.out.println("Driver O.K");
			String url="jdbc:mysql://localhost:3306/etudiants";
			String user="root";
			String passwd="";
			con = DriverManager.getConnection(url,user,passwd);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//se deconnecter de la base
	public static void fermer() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//insert 
	public static void inserer(model.Etudiant et) {
			try {
				   connecter();
				   //String requete = "INSERT INTO etudiant (NOM,PRENOM) VALUES ('"+et.getNom()+"','"+et.getPrenom()+"')";
				   String requete =String.format("INSERT INTO etudiant (prenom,nom,adresse,age) VALUES ('%s','%s','%s','%d')",et.getPrenom(),et.getNom(),et.getAdresse(),et.getAge()); 
				   Statement stmt = con.createStatement();
				   int resultats = stmt.executeUpdate(requete);
				   fermer();
				} catch (SQLException e) {
					System.out.println("il nest pas insérer");
			}
		}
   //rammener l'ensemble des etudiants présent dans la base 
    public  static String  requete2 = "SELECT * FROM etudiant";
	public static ResultSet sel() {
				try {
				   connecter();
				   Statement stmt = con.createStatement();
				   ResultSet resultats = stmt.executeQuery(requete2);
				   return resultats;
				} catch (SQLException e) {
					return null;
				}
			}
	}

