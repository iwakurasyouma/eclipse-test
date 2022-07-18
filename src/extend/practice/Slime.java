package extend.practice;

public class Slime extends Monster {

	public Slime(String name, int hp, int offensive) {
		super(name, hp, offensive);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	void attack(Living target) {
		int nn = super.offensive * Rand.get(9);
		System.out.println(
				super.name + "がとっしんで攻撃！" + target.name + "に" + nn + "のダメージ");
		target.hp = target.hp - nn;
	}
	@Override
	void down() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("スライムは力尽きた");
	}

}
