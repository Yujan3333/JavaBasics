package basic;

public class Recursion {
	public static void main (String[]args) {
		int a=2 , ans;
		ans=recursion(a);
		System.out.println(ans);
	}
	/**
	 * @param k
	 * @return
	 */
	private static int recursion(int k){
		if(k>0) {
			return k+recursion(k-1);
		}
		else
			return 0;
	}
}
