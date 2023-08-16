package comics.concretefactory;

import comics.abstractfactory.AbstractFactory;
import comics.abstractfactory.AbstractHero;
import comics.abstractfactory.AbstractVillano;
import comics.produtfamily.dc.HeroWonderWoman;
import comics.produtfamily.dc.VillanoDarkseid;

public class DC implements AbstractFactory{

	@Override
	public AbstractHero getAbstractHero() {
		// TODO Auto-generated method stub
		return new HeroWonderWoman();
	}

	@Override
	public AbstractVillano getAbstractVillano() {
		// TODO Auto-generated method stub
		return new VillanoDarkseid();
	}

}
