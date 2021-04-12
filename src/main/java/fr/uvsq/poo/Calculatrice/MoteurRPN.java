package fr.uvsq.poo.Calculatrice;

import java.util.Hashtable;
import java.util.Stack;

public class MoteurRPN implements Interpreteur  {
	
		//permet de créer une pile vide.
		Stack <Double> pile = new Stack<Double> ();
		//permet de hacher une table
		public Hashtable HT= new Hashtable();
		
		// Ajouter des éléments à la pile
		public void push(double elmt){
			pile.push(elmt);
		}
		//return la valeur de la pile
		public Double SaveOP(double val) {
			return pile.push(val);
		}
		public String listeOperandes(){
			String string = "";
			for(Double val: pile){
				string += val + " ";
			}

			return string;
		}

		public Double calculeOperation(Operation op) {
			return SaveOP(op.Calcul(pile.pop(), pile.pop()));
		}
		
		//Supprimer l'élément de la pile
		public void pop(double elmt){
			pile.pop();
		}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		pile.pop();
		System.out.println(listeOperandes());
		
	}
	@Override
	public void quit() {
		// TODO Auto-generated method stub
		System.out.println("Terminer! ");
		
	}
	
	
}
