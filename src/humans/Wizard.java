package humans;

import bases.Human;
import utils.Dice;

public class Wizard extends Human {

	public Wizard(String name, String weapon) {
		super(name, weapon);
		this.setHp(Dice.get(120, 180));
		this.setOffensive(Dice.get(12, 18));
	}

}
