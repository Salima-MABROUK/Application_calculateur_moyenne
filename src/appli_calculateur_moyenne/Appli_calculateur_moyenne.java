package appli_calculateur_moyenne;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Appli_calculateur_moyenne {
	
	public static void main(String[] args) {

		//déclaration des variables
		// Pour lire l'entrée de l'utilisateur
		
		Scanner lecteur = new Scanner(System.in); 

		// Le nombre total d'élèves
		int nombreEleves;  

		// Le nombre de notes par élève
		int nombreNotes;  

		// Somme des notes d'un élève (chiffre avec,)
		double sommeNotes; 

		// La moyenne d'un élève (chiffre avec,)
		double moyenneEleve;

		// La somme des moyennes de tous les élèves (chiffre avec,)
		double sommeMoyennes = 0;

		// Liste pour stocker les moyennes de chaque élève
        List<Double> moyennesEleves = new ArrayList<>();

        // Demander à l'utilisateur le nombre d'élèves
        System.out.print("Entrez le nombre d'élèves : ");
        nombreEleves = lecteur.nextInt();

        // Boucle pour saisir les notes des élèves
        for (int i = 0; i < nombreEleves; i++) {
            System.out.println("Élève " + (i + 1) + ":");
            System.out.print("Entrez le nombre de notes pour cet élève : ");
            nombreNotes = lecteur.nextInt();

            sommeNotes = 0; // Réinitialiser la somme des notes pour chaque élève

            // Boucle pour saisir les notes de l'élève
            for (int j = 0; j < nombreNotes; j++) {
                System.out.print("Entrez la note " + (j + 1) + " : ");
                double note = lecteur.nextDouble();
                sommeNotes += note; // Ajouter la note à la somme des notes de l'élève
            }

            // Calcul de la moyenne de l'élève
            moyenneEleve = sommeNotes / nombreNotes;
            moyennesEleves.add(moyenneEleve); // Ajouter la moyenne à la liste des moyennes
            sommeMoyennes += moyenneEleve; // Ajouter la moyenne de l'élève à la somme des moyennes
        }

        // Calcul de la moyenne générale de la classe
        double moyenneGenerale = sommeMoyennes / nombreEleves;

        // Affichage des résultats
        System.out.println("\nMoyenne de chaque élève :");
        for (int i = 0; i < moyennesEleves.size(); i++) {
            System.out.println("Élève " + (i + 1) + " : " + moyennesEleves.get(i));
        }

        System.out.println("\nMoyenne générale de la classe : " + moyenneGenerale);

        lecteur.close(); // Fermer le scanner
    }
}


