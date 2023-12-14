package data.algo;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fnum = 0;
		int snum = 1;
		int tnum = 0;
		System.out.print(fnum + "," + snum + ",");
		for (int i = 0; i < 9; i++) {
			tnum = fnum + snum;
			fnum = snum;
			snum = tnum;
			System.out.print(tnum + ",");
		}
		System.out.println();
		factorial();
		System.out.println();
		prime();

	}

	static void factorial() {
		int num = 6, fac = 1;
		if (num == 0) {
			System.out.print("1");
		} else {
			for (int i = 1; i <= num; i++) {
				fac = fac * i;
			}
			System.out.print(fac);
		}
	}
	static void prime() {
		int num = 7,count = 0;
		if(num == 0 || num == 1) {
			System.out.println("0 and 1 is not a prime number");
		}
		else {
			for(int i = 2 ; i <= num/2; i++) {
				if(num%i == 0) {
					System.out.print(num + " " + "is not a prime number");
					count = 1;
					break;
				}
			}
			if(count == 0) {
				System.out.print(num + " "+ "is a prime number");
			}
		
		}
	}

}
