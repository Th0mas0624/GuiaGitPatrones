package launcher;

import java.util.Random;

import comics.abstractfactory.AbstractFactory;
import comics.abstractfactory.AbstractHero;
import comics.abstractfactory.AbstractVillano;
import comics.concretefactory.DC;
import comics.concretefactory.Marvel;

public class Launcher {
	
	public static void main(String[] args) {
		// Carlos Bermudez
		print("Probando hacer cambios para subirlos a git :)")
		// Miguel Thomas
		// Juan Barrera
		AbstractFactory factory = null;
		
		// Escoger de manera aletoria una fabrica
		Random r = new Random();
		int i   = r.nextInt(100);
		if(i<50){
			factory = new Marvel();
		} else {
			factory  = new DC();
		}
		
		AbstractHero hero = factory.getAbstractHero();
		AbstractVillano villano = factory.getAbstractVillano();
		
		System.out.println("La batalla será: ");
		System.out.println("Hero:\n"+hero.darPresentacion());
		System.out.println("VS");
		System.out.println("Villano:\n"+villano.darPresentacionMalvada());
		
	}

}
