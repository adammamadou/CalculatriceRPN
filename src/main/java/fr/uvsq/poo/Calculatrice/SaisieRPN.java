package fr.uvsq.poo.Calculatrice;


import java.util.Scanner;

public class SaisieRPN {

	private Scanner scanner;
	private MoteurRPN moteur;

	public SaisieRPN() {
		this.scanner = new Scanner(System.in);
		this.moteur = new MoteurRPN();
	}


	public void saisie(){

		String string = "";
		boolean arret = false;
		System.out.println("Saissez un nombre");
		System.out.println("Pour quitter tapez quit.");
		System.out.println("Pour effacer la dernière valeur saisie tapez undo");

		while (arret == false) {
    // condition pour empiler dans le cas de nombre
			if (scanner.hasNextDouble()) { 
				moteur.SaveOP(scanner.nextDouble()); 
				System.out.println(moteur.listeOperandes()); 
				string = scanner.nextLine();
			}

			else { // si la saisie est une opération ou une chaine de caractère
				string = scanner.nextLine();
				if (this.testeOperation(string)) {
					// si la saisie est une opération
					// enlève les deux premiers éléments, fait l'opération et met le résultat dans la pile 	
					moteur.calculeOperation(this.renvoieOperation(string)); 
					System.out.println(moteur.listeOperandes());  
				}
				// si la saisie est "Fin" peu importe miniscule ou maj, on arrête le programme 
				else if (string.equalsIgnoreCase("quit")) {
					arret = true;
					moteur.quit();
				}
				else if(string.equals("undo")) {
					moteur.undo();
				}

				else
					System.out.println("Saisie Incorrecte: Les valeurs acceptées sont : Nombre, undo, quit");
				
			}
		}
	}

// Fonction pour le test 
	private boolean testeOperation(String string) {
		if (string.length() != 1)
			return false;
		return this.renvoieOperation(string) != null;
	}


	private Operation renvoieOperation(String string) {
		for (Operation op : Operation.values())
			if (string.charAt(0) == op.getOperateur())
				return op;
		return null;
	}

	public void afficheValues(){
		System.out.println(moteur.listeOperandes());
	}

	public MoteurRPN getMoteurRPN() {
		return this.moteur;
	}

	
}