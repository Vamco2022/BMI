package BMI;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double height=sc.nextDouble();
		int weights=sc.nextInt();
		double weight=weights/2;
		double bmi=weight/(height*height);
		System.out.println("你的身高是"+height+"米");
		System.out.println("你的体重是"+weight+"千克");
		System.out.println("你的BMI是"+bmi);
		if (bmi < 18.5) {
			System.out.println("太瘦了");
		}
		if (bmi >= 18.5 && bmi < 24.9) {
			System.out.println("体重正常");
		}
		if (bmi >= 24.9) {
			System.out.println("太胖了");
		}
		sc.close();
		}

}
