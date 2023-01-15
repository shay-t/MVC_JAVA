package model;

public class Etudiant {
	private String prenom;
	private String nom;
	private String adresse;
	private int    age;
	//constructeur
	public Etudiant(String prenom, String nom, String adresse, int age) {
		this.prenom = prenom;
		this.nom = nom;
		this.adresse = adresse;
		this.age = age;
	}
	//getters and setters
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
