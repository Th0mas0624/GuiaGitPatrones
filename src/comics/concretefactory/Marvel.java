package comics.concretefactory;

import comics.abstractfactory.AbstractFactory;
import comics.abstractfactory.AbstractHero;
import comics.abstractfactory.AbstractVillano;
import comics.productfamily.marvel.HeroThor;
import comics.productfamily.marvel.VillanoThanos;

public class Marvel implements AbstractFactory{

	@Override
	public AbstractHero getAbstractHero() {
		// TODO Auto-generated method stub
		return new HeroThor();
	}

	@Override
	public AbstractVillano getAbstractVillano() {
		// TODO Auto-generated method stub
		return new VillanoThanos();
	}

}
