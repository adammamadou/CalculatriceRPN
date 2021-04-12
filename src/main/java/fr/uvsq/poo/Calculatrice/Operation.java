package fr.uvsq.poo.Calculatrice;

public enum Operation {
	
	PLUS ('+'){
		
		public double Calcul(double val1, double val2) {
				 return val1 + val2;
		}	 

	},
	
	MOINS('-'){

		@Override
		public double Calcul(double val1, double val2) {
			// TODO Auto-generated method stub
			return val1 - val2;
		}
		
	},
	
	DIV('/'){

		@Override
		public double Calcul(double val1, double val2) {
			// TODO Auto-generated method stub
			return val1 / val2;
		}
		
	},
	
	MULT('*'){

		@Override
		public double Calcul(double val1, double val2) {
			return val1 * val2;
		}
		
	};
	
	private char operateur;

	private Operation(char operateur) {
				this.operateur= operateur;
	}
	
	public abstract double Calcul(double val1, double val2);

	public char getOperateur() {
		return operateur;
	}

	
	
}
