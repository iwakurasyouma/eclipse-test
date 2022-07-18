package extend.practice;

public abstract class Living {

	protected String name;
	protected int hp;
	protected int offensive;

	public Living(String name, int hp, int offensive) {
		this.name = name;
		this.hp = hp;
		this.offensive = offensive;
	}
	abstract void down();
	abstract void attack(Living target);

}
