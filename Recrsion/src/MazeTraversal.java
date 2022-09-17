
public class MazeTraversal {
	
	static int count(int n, int m) {
		if(m==1 || n==1) {
			return 1;
		}
		return (count(n-1,m) + count(n,m-1));
	}

	public static void main(String[] args) {
		int n = count(3,4);
		System.out.println(n);
	}

}
