package data.algo;


public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 84, num2 = 128,r;
		if(num1 <= num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		while(num2 != 0) {
			r = num1 % num2;
			num1 = num2;
			num2 = r;
		}
		System.out.println("GCD is" + " " + num1);
	}

}
