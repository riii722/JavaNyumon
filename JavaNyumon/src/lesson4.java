

public class lesson4 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//4-1
		int[] points = new int[4];
		double[] weights = new double[5];
		boolean[] answers = new boolean[3];
		String[] names = new String[3];

		//4-2
		int[] moneyList ={121902, 8302, 55100};
		for(int i=0; i<moneyList.length; i++) {
			System.out.println(moneyList[i]);
		}
		for(int m : moneyList) {
			System.out.println(m);
		}

		//4-4
		int[] numbers = {3,4,9};
		System.out.println("1桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		for(int n : numbers) {
			if(n == input) {
				System.out.println("アタリ！");
			}
		}

	}


}