package _01_prime_or_not;

import javax.swing.JOptionPane;

public class prime_or_not {
	public static void main(String[] args) {
		String Prime = JOptionPane.showInputDialog("Input a Number");
		//Check if the number is prime
		
		int Ornot = Integer.parseInt(Prime);
		boolean isPrime = false;
		
		
		for (int i = 2; i < Ornot; i++) {
			if(Ornot % i == 0) {
				System.out.println("Not Prime");
				isPrime = true;
				break;
			}
		}
		
		if(isPrime == false) {
			System.out.println("Prime");
		}
	}


}
