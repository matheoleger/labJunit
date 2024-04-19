package labJunit.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCompteBancaire {

	@Test
	void testDebiterSolde1() {
		CompteBancaire compteBancaire = new CompteBancaire(1000);
		assertEquals(900, compteBancaire.debiterSolde(100));
	}
	
	@Test
	void testDebiterSolde2() {
		CompteBancaire compteBancaire = new CompteBancaire(1000);
		assertEquals(1000, compteBancaire.debiterSolde(-100));
	}
	
	@Test
	void testCrediterSolde1() {
		CompteBancaire compteBancaire = new CompteBancaire(1000);
		assertEquals(1100, compteBancaire.crediterSolde(100));
	}
	
	@Test
	void testCrediterSolde2() {
		CompteBancaire compteBancaire = new CompteBancaire(1000);
		assertEquals(1000, compteBancaire.crediterSolde(-100));
	}

}
