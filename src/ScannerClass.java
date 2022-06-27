

import java.util.Scanner;


public class ScannerClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Bir sayi giriniz:");
		int a = scan.nextInt();
		System.out.println("girmiş olduğunuz sayı:"+a);
	}

}