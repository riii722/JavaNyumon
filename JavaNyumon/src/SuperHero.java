//継承
public class SuperHero extends Hero {
	private boolean flying;

	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}

	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}

	//子クラスだけメソッド内容を追加・変更する(オーバーライド)
	public void run() {
		System.out.println("撤退した");
	}

	public void attack() {
		super.attack();
		if(this.flying) {super.attack();}
	}

}