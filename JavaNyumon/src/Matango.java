
public class Matango {
	int hp = 50;
	final int LEVEL = 10; //定数フィールド（変数を固定できる/大文字で名前をつける）
	private char suffix; //AとかBとか語尾につける

	public Matango(char suffix) {
		this.suffix = suffix;
	}

	public void attack(Hero h) {
		System.out.println("キノコ"+ this.suffix +"の攻撃");
		System.out.println("10のダメージ");
		h.setHp(h.getHp() - 10);
	}

	void run(){
		System.out.println("お化けきのこ"+ this.suffix +"は逃げ出した！");
	}

}
