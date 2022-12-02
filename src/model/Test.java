package model;

import java.util.Scanner;
public class Test {

	public static void main(String[] args) throws Exception  {
		
		Etudiant e1 = new Etudiant();
		e1.info();
		
		Etudiant e2 = new Etudiant("KSENTINI",18,19,"Tunis");
		e2.info();
		//j'ai constaté que le constructeur initialise les attributs à null
		Scanner scanner = new Scanner(System.in);
		System.out.println("veuillez entrer votre nom : ");
		String nom = scanner.nextLine();
		System.out.println("veuillez entrer votre age : ");
		int age = scanner.nextInt();
		System.out.println("veuillez entrer votre moyenne : ");
		double moyenne = scanner.nextDouble();
		System.out.println("veuillez entrer votre adresse : ");
		String adresse = scanner.next();
		Etudiant e3 = new Etudiant(nom,age,moyenne,adresse);
		e3.info();
		Etudiant e4 = new Etudiant();
		e4.setNom("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
		e4.setAge(28);
		e4.setMoyenne(20);
		e4.info();
	}

}
