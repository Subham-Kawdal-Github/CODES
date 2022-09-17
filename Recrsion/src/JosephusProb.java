public class JosephusProb {

	static int jos(int n, int k) {
		if(n == 1) {
			return 0;
		}
		return ((jos(n-1,k)+k)%n);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = jos(1, 1);
		System.out.println(n);
	}
}
