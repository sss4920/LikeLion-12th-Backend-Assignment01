package bj_2588;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = num1 * (num2 % 10);
		int num4 = num1 * (num2 % 100 - num2 % 10)/10;
		int num5 = num1*(num2/100);
		int result = num1 * num2;
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(result);
		sc.close();
	}

}
