import java.io.IOException;
public class Lesson15 {

	public static void main(String[] args) throws IOException {
		System.out.println("プログラムが起動しました");
		throw new IOException();

//	15-1,2
//		try {
//		String s = null;
//		System.out.println(s.length());
//
//		} catch (NullPointerException e){
//			System.out.println("NullPointerException例外をcatchしました");
//			System.out.println("ーースタックとレース(ここから)ーー");
//			e.printStackTrace();
//			System.out.println("ーースタックとレース(ここまで)ーー");
//		}
//
//	15-3
//		try {
//			int i = Integer.parseInt("三");
//
//		} catch (NumberFormatException e){
//				System.out.println("NumberFormatException例外をcatchしました");
//		}
//
	}

}
