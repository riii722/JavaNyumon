

public class lesson5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//5-1
		introduceOneself();

		//5-2
		String title = "Christmas";
		String address = "goodknight@gmail.com";
		String text ="Let's Sing Christmas Carol";
		email(title, address, text);
		//5-3
		email(address, text);

		//5-4
		double triangleArea = calcTriangleArea(7.0, 3.0);
		System.out.println("三角形の面積："+ triangleArea +"平方cm");
		double circleArea = calcCircleArea(5.0);
		System.out.println("円の面積："+ circleArea +"平方cm");
	}

	//5-1
	public static void introduceOneself(){
		String name = "Rina";
		int age = 23;
		double height = 158.6;
		char gender = '女';

		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(gender);
	}

	//5-2
	public static void email(String title, String address, String text){
		System.out.println(address+"に、以下のメールを送信しました");
		System.out.println("件名："+title);
		System.out.println("本文："+text);
	}

	//5-3
	public static void email(String address, String text){
		System.out.println(address+"に、以下のメールを送信しました");
		System.out.println("件名：無題");
		System.out.println("本文："+text);
	}

	//5-4
	public static double calcTriangleArea(double bottom, double height) {
		double area = (bottom * height)/2;
		return area;
	}

	public static double calcCircleArea(double radius) {
		double area = radius * radius * 3.14;
		return area;
	}


}
