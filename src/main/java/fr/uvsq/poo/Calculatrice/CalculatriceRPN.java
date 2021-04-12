package fr.uvsq.poo.Calculatrice;

public enum CalculatriceRPN {

	
	CALCULATRICERPN;
	public void run(String[] args) {
			SaisieRPN saisie = new SaisieRPN();
			saisie.afficheValues();
			saisie.saisie();
	}

	public static void main(String[] args) {

		CALCULATRICERPN.run(args);

	}

}