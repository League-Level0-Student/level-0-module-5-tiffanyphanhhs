package _02_fibonacci;

public class fibonacci {
public static void main(String[] args) {
	int number1 = 0;
	int number2 = 1;
	System.out.println(number1);	
	System.out.println(number2);
	for (int i = 0; i < 10; i++) {
		int sum = 0;
		sum = number1 + number2; 
		System.out.println(sum);
		number1 = number2;
		number2 = sum;
		
	}

	
}
}