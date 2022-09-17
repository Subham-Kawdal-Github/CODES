
public class Factorial {
	static int n = 1;
	public static int fact(int num) {
		///////////////  termination case
		if(num == 1) {
			return n;
		}
		n = n*num;
		fact (num-1);
		
		/////////////////////// last return 
		return n;
	}

	public static void main(String[] args) {
		int f = fact(5);
		System.out.println(f);
	}
}
