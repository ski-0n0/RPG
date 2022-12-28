package humans;

import bases.Human;
import utils.Dice;

public class Brave extends Human {

	public Brave(String name, String weapon) {
		super(name, weapon);
		this.setHp(Dice.get(170, 230));
		this.setOffensive(Dice.get(7, 13));
	}

}
