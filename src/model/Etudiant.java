package model;

public class Etudiant {

	private String nom ;
	private int age ;
	private double moyenne;
	private String adresse;
	public void info() 
	{
		System.out.println("nom: "+nom+" age: "+age+" moyenne: "+moyenne+" adresse: "+adresse);
	}
	public Etudiant() 
	{

	}
	public Etudiant(String nom) {
		this.nom=nom;
	}
	public Etudiant (String nom , int age ,double moyenne, String adresse) 
	{
		this.nom=nom;
		this.age=age;
		this.moyenne=moyenne;
		this.adresse=adresse;
	}
	public String getNom() throws Exception {
		if (nom.length()>=8 && nom.length()<=30){
			return nom;
		}
		else {
			throw new Exception("veuillez entrer un nom entre 8 et 30 caractére");
		}
	}
	public void setNom(String nom) throws Exception {
		if (nom.length()>=8 && nom.length()<=30) {
			this.nom = nom;
		}
		else {
			throw new Exception("veuillez entrer un nom entre 8 et 30 caractére");
		}

	}
	public int getAge() throws Exception {
		if(age>=18 && age<=28) {
			return age ; }
		else {
			throw new Exception("veuillez entrer un age entre 18 et 28 caractéres");
		}
	}
	public void setAge(int age) throws Exception {
		if(age>=18 && age<=28) {
			this.age=age; }
		else {
			throw new Exception("veuillez entrer un age entre 18 et 28 ");
		}
	}
	public double getMoyenne() throws Exception {
		if(moyenne>=0 && moyenne<=20) {
			return moyenne ;  }
		else {
			throw new Exception("veuillez entrer une moyenne entre 0 et 20");
		}
	}
	public void setMoyenne(double moyenne) throws Exception {
		if(moyenne>=0 && moyenne<=20) {
			this.moyenne=moyenne;}
		else {
			throw new Exception("veuillez entrer une moyenne entre 0 et 20");
		}
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse=adresse;
	}
}
