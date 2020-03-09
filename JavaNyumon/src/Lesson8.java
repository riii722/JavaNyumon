import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Lesson8 {
	public static void main(String[] args) throws Exception {
		//仮想世界にインスタンスを生み出す
		//フィールドを初期設定する
		//メソッドを呼び出す（行動指示を出す）

		//インスタンスの生成
		Hero h1 = new Hero("ミナト");
		//フィールドに名前とHPを設定する
		//h1.name = "ミナト";
		//h1.hp = 100;
		Hero.setRandomMoney();
		//h1.money = 500; //個別財産として代入しても共有財産になる
		System.out.println("勇者" + h1.getName() + "[HP:"
				+ h1.getHp() + "]を生み出しました！");
		System.out.println("グループの所持金は"
				+ Hero.money + "メルです"); //静的フィールドへのアクセス

		Hero h2 = new Hero("アラン");
		System.out.println("勇者" + h2.getName() + "[HP:"
				+ h2.getHp() + "]を生み出しました！");

		Hero h3 = new Hero();
		System.out.println("勇者" + h3.getName() + "[HP:"
				+ h3.getHp() + "]を生み出しました！");

		Wizard w1 = new Wizard();
		w1.setName("ケント");
		w1.setHp(50);
		System.out.println("魔法使い" + w1.getName()
				+ "[HP:" + w1.getHp() + "を生み出しました！");

		Cleric c1 = new Cleric("エマ", 40, 5);
		System.out.println("クレリック" + c1.name
				+ "[HP:" + c1.hp + "][MP:" + c1.mp
				+ "]を生み出しました！");

		Cleric c2 = new Cleric("レイ", 40);
		System.out.println("クレリック" + c2.name
				+ "[HP:" + c2.hp + "][MP:" + c2.mp
				+ "]を生み出しました！");

		Cleric c3 = new Cleric("ハルカ");
		System.out.println("クレリック" + c3.name
				+ "[HP:" + c3.hp + "][MP:" + c3.mp
				+ "]を生み出しました！");

		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		h1.sword = s;
		System.out.println(h1.getName() + "の現在の武器は"
				+ h1.sword.name); //勇者の剣の名前

		SuperHero sh = new SuperHero();

		//メソッドの呼び出し
		h1.attack();
		h1.slip();
		h1.run();
		c1.selfAid();
		c1.pray(3); //3秒間祈る
		sh.run();

		//long型
//		long start = System.currentTimeMillis();
//		long end = System.currentTimeMillis();
//		System.out.println("処理にかかった時間は"+(end - start)+"ミリ秒でした");

		//Date型
		//現在日時を表示
//		Date now = new Date();
//		System.out.println(now);
//		System.out.println(now.getTime());
		//指定時点の日時を表示
//		Date past = new Date(20191213154050L);
//		System.out.println(past);

		//String型

		//int型,Calenderクラスの利用
		//現在の年を取得する
		Date now = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println("今日は"+ day +"日です");
		//指定した日のDate型の値を得る
//		c.set(2019,12,13,11,5);
		day += 100;
		c.set(Calendar.DAY_OF_MONTH, day);
		Date future = c.getTime();

////		Date now = new Date();
		SimpleDateFormat f = new SimpleDateFormat("yyyy/mm/dd");
		System.out.println(f.format(future));
//		Date d = f.parse("2011,09,22 01:23:45");


	}

}
