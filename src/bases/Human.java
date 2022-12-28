package bases;

import utils.Dice;

// 人間を表現する抽象クラス
public abstract class Human extends Living {

	// コンストラクタ
	public Human(String name, String weapon) {
		// Livingクラスで定義したコンストラクタを利用する
		super(name, weapon);
	}

	// attackメソッドのオーバーライド
	@Override
	public void attack(Living target) {
		// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする
		int damage = Dice.get(1, 10) * this.offensive;
		int decrease = 1;

		// 相手のHPをダメージ値だけ減らす
		target.setHp(target.getHp() - damage);

		// 自分の攻撃力を1だけ減らす
		this.setOffensive(this.getOffensive() - decrease);

		// コンソールにステータスを表示
		System.out.printf("\n「%s」が「%s」で攻撃！「%s」に%dのダメージを与えた。", this.getName(), this.getWeapon(), target.getName(),
				damage);
		System.out.printf("\nしかし自分の攻撃力も%d減少した。\n", decrease);
	}
}