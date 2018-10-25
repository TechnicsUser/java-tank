package myTank.views;

public class genericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(max(19,40,54));
		System.out.println(max("zapple","tots", "car"));

		System.out.println(max('a','g','b'));	
	}
	
	public static <T extends Comparable<T>> T max(T a, T b, T c) {
		T max = a;
		if(b.compareTo(max) > 0) max = b;
		if(c.compareTo(max) > 0) max = c;
		return max;
	}

}
