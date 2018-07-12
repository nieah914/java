package java_algorithm;

public class RefStudy {
	
	public void test() {
		int bagic = 0;
		
		bagic = 0;
		System.out.println("groud :" + bagic);
		test2(bagic);
		System.out.println("groud out :" + bagic);
		
	}
	public void test2(int ttt) {
		ttt += 1;
		System.out.println("inside of test2 : "+ttt);
	}
}



/*



public class RefStudy {
	public int bagic = 0;
	public void test() {
		int bagic2 = 0;
		System.out.println("groud :" + bagic2);
		test2(bagic2);
		System.out.println("groud out :" + bagic2);
		
	}
	public void test2(int ttt) {
		ttt += 1;
		System.out.println("inside of test2 : "+ttt);
	}
}

*/

/*

public class RefStudy {
	public int bagic = 0;
	public void test() {
		int bagic2 = 0;
		int[] bagic3 = new int[1];
		bagic3[0] = 0;
		System.out.println("groud :" + bagic3[0]);
		test2(bagic3);
		System.out.println("groud out :" + bagic3[0]);
		
	}
	public void test2(int[] ttt) {
		ttt[0] += 1;
		System.out.println("inside of test2 : "+ttt[0]);
	}
}

*/