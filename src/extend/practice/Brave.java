package extend.practice;


public class Brave extends Human {

	public Brave(String name, int hp, int offensive) {
		super(name, hp, offensive);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	void attack(Living target) {
		int nn = super.offensive * Rand.get(9);
		System.out.println(
				super.name + "が剣で攻撃！" + target.name + "に" + nn + "のダメージ");
		target.hp = target.hp - nn;
	}

	@Override
	void down() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("勇者は力尽きた");
	}

}
