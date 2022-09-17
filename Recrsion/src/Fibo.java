
public class Fibo {

	static int fiboCalc(int n) {
		if(n == 0) {
			return 0;
		}
		if(n == 1 || n ==2) {
			return 1;
		}
		return (fiboCalc(n-1) + fiboCalc(n-2));
	}
	
	public static void main(String[] args) {
		System.out.println(fiboCalc(7));
	}

}
