/*
 * Auteur: Zachary Xie
 * Date: Décembre 10 2020
 * Cette programme manipule les tableaux en différentes façons.
 * 
 */
public class Formatif_Zachary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    // Notre Tableau
		int[] testTableau = {23,65,75,34,29,34,76,16};
		
		// Méthodes
		System.out.println(sommeDesElements(testTableau));
		System.out.println(tableauContientElement(testTableau, 4));
		System.out.println();
		
		// Nouvelle tableau crée par la méthode
		int[] nouveauTableau = EnlevePlusGrandNombre(testTableau);
		
		// Imprimer les nombres du tableau
		for(int i : nouveauTableau) {
			System.out.print(i + " ");
		}
		
	}
	
	// Calcule la somme des éléments d'un tableau
	static int sommeDesElements(int[] tableau) {
		// Variable temporaire pour contenir la somme du tableau
		int somme = 0;
		
		for(int i : tableau) {
			// Ajoute chaque valeur au variable somme
			somme += i;
		}
		
		// Retourne le variable somme
		return somme;
	}
	
	static boolean tableauContientElement(int[] tableau, int nombreATester) {
		
		// Vérifie si un des valeurs est égale au nombre à tester
		for(int i : tableau) {
			//Si c'est égale on retourne vrai
			if(i == nombreATester) return true;
		}
		
		// Si il n'y a pas de valeur égal au nombre on retourne faux
		return false;
	}
	
	static int[] EnlevePlusGrandNombre(int[] tableau) {
        // Variables temporaires
		int plusGrandNombre = tableau[0];
		int plusGrandNombreIndex = 0;
		
		for(int i = 0; i < tableau.length; i++) {
			// Si le nombre est plus grand que le plus grand nombre qu'on a vu,
			// Il prend la place du plus grand nombre et on note son index
			if(tableau[i] > plusGrandNombre) {
				plusGrandNombreIndex = i;
				plusGrandNombre = tableau[i];
			}
		}
		
		// On crée un nouveau tableau temporaire, avec un place de moins car on 
		// enlève le plus grand élément
		int[] nouvelleTableau = new int[tableau.length - 1];
		
		// Augmente variable utilisé quand on voit le plus grand nombre
		int augmente = 0;
		for(int i = 0; i < nouvelleTableau.length; i++) {
			
			if(i == plusGrandNombreIndex) {
				// Quand on voit le plus grand nombre, augmente est 1 pour qu'on
				// n'inclut pas le plus grand nombre
				augmente++;
			}
			
			// On écrit les valeurs dans la nouvelle tableau
			nouvelleTableau[i] = tableau[i + augmente];

		}
		
		// On retourne la nouvelle tableau
		return nouvelleTableau;
		
	}

}
