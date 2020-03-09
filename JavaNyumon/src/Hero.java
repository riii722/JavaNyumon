
public class Hero {
	//Hero型（複数のインスタンスが生成できる）
	//属性（フィールド）の定義
	private String name;
	private int hp; //別のクラスからは変更できないようにする
	Sword sword;

	//getterメソッドを経由してフィールドにアクセスする
	public int getHp() {return this.hp;}
	public String getName() {
		return this.name;
	}

	//setterメソッドを経由してフィールドにアクセスする
	public int setHp(int hp) {return this.hp;}
	public String setName(String name) {
		return this.name;
	}

	//コンストラクタ
	//条件：メソッドとクラスの名前が完全に等しいこと、メソッド宣言に戻り値が記述されていないこと
	Hero(String name){ //voidもダメ、異なる追加情報（名前）を受け取る
		this.hp = 100; //hpフィールドが自動的に初期化される
		this.name = name;
	}
	//名前が指定されなかった場合（オーバーロードの活用）
	Hero(){
		//this.hp = 100;
		this("名無し"); //別のコンストラクタを呼び出す
	}

	//操作（メソッド）の定義
	public void attack(){ //publicはどのクラスからでも呼び出すことができる
		System.out.println(this.name +"は攻撃した！");
		System.out.println("敵に5ポイントのダメージを与えた！");

	}

	void run() {
		System.out.println(this.name +"は逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは"+ this.hp +"でした");
	}

	void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name +"は、"+ sec +"秒座った！");
		System.out.println("HPが"+ sec +"ポイント回復した");

	}

	void slip() {
		this.hp -= 5;
		System.out.println(this.name +"は転んだ！");
		System.out.println("5のダメージ！");
	}

	void sleep() {
		this.hp = 100; //thisで自身を表す
		System.out.println(this.name +"は、眠って回復した！");

	}

	private void die() {
		System.out.println(this.name +"は死んでしまった！");
		System.out.println("GAME OVERです");
	}

	//別のインスタンスとフィールドを共有する
	static int money; //静的フィールド
	//勇者の所持金をランダムに設定する
	static void setRandomMoney() {
		Hero.money =(int) (Math.random()*1000);
	}


}
