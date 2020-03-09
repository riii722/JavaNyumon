//練習問題8,9
import java.util.Random;
public class Cleric {
	String name;
	int hp = 50;
	int mp = 10;
	static final int maxHp = 50;
	static final int maxMp = 10;

	public Cleric(String name, int hp, int mp){
		this.hp = hp;
		this.mp = mp;
		this.name = name;
	}

	public Cleric(String name, int hp) {
		this(name,hp,Cleric.maxMp);
	}

	public Cleric(String name) {
		this(name,Cleric.maxHp);
	}

	//MPを消費して自身のHPを全回復する
	public void selfAid() {
		System.out.println(this.name +"はセルフエイドを唱えた！");
		this.hp = Cleric.maxHp;
		this.mp -=5;
		System.out.println("HPが最大まで回復した");
	}

	//MPを回復する
	public int pray(int sec) {
		System.out.println(this.name +"は"+ sec +"秒間天に祈った！");
		//回復量をランダムで決定する
		//祈った秒数に0~2ポイントの補数をつけて回復する
		int recover = new Random().nextInt(3) + sec;
		//実際の回復量を計算する
		int recoverActual = Math.min(Cleric.maxMp - this.mp, recover);

		this.mp += recoverActual;
		System.out.println("MPが"+ recoverActual +"回復した");
		return recoverActual;
	}

}
