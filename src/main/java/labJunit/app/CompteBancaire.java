package labJunit.app;

public class CompteBancaire {
	public double solde;
	
	public CompteBancaire(double s) {
		solde = s;
	}
	
	public double debiterSolde(double montant) {
		
		if(montant < 0) {
			return solde;
		}
		
		solde -= montant;
		return solde;
	}
	
	public double crediterSolde(double montant) {
		
		if(montant < 0) {
			return solde;
		}
		
		solde += montant;
		return solde;
	}
}
