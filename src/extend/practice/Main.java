package extend.practice;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Human> listh = new ArrayList<>();
		Human brave = new Brave("勇者", 100, 10);
		listh.add(brave);
		Human wizard = new Wizard("魔法使い", 100, 10);
		listh.add(wizard);
		Human fighter = new Fighter("戦士", 100, 10);
		listh.add(fighter);

		List<Monster> listm = new ArrayList<>();
		Monster dragon = new Dragon("ドラゴン", 100, 10);
		listm.add(dragon);
		Monster oak = new Oak("オーク", 100, 10);
		listm.add(oak);
		Monster slime = new Slime("スライム", 100, 10);
		listm.add(slime);

		Human human = listh.get(Rand.get(listh.size()));
		Monster monster = listm.get(Rand.get(listm.size()));

		while (listm.size() != 0 || listh.size() != 0) {
			System.out.println("人間のターン");
			human = listh.get(Rand.get(listh.size()));
			monster = listm.get(Rand.get(listm.size()));
			human.attack(monster);
			if (monster.hp <= 0) {
				monster.down();
				listm.remove(monster);
			}
			if (listm.size() == 0) {
				System.out.println("人間の勝利");
				break;
			}

			System.out.println("モンスターのターン");
			human = listh.get(Rand.get(listh.size()));
			monster = listm.get(Rand.get(listm.size()));
			monster.attack(human);
			if (human.hp == 0) {
				human.down();
				listh.remove(human);
			}
			if (listh.size() == 0) {
				System.out.println("モンスターの勝利");
				break;
			}
		}

	}
}