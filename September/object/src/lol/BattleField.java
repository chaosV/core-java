package lol;

public class BattleField {

	public static void main(String[] args) {
		Hero h1 = new Hero("����");
		System.out.println(h1);
		Hero h2 = new Hero("����");
		System.out.println(h2);
		for (int i = 1; h1.currentBlood > 0 && h2.currentBlood > 0; i++) {
			System.out.println("\n��" + i + "�غ�");
			h1.hit(h2);

			h2.hit(h1);

		}

	}

}
