package _07_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
	public static void main(String[] args) {

		SkillPractice skills = new SkillPractice();
		skills.skill1();
		skills.skill2();
		skills.skill3();
		skills.skill4();
		skills.skill5();
	}

	void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have
		String Dimes = JOptionPane.showInputDialog(null,"How many dimes do you have?");
		int dimesNum = Integer.parseInt(Dimes);
		// Tell them how many cents they have (hint multiply by 10)
		dimesNum = dimesNum*10; 
		System.out.println("You have " +dimesNum+ " cents");
		// Ask the user how tall they are (inches)
		String height = JOptionPane.showInputDialog(null,"How tall are you by inches?");
		int Tall = Integer.parseInt(height);
		// If they are shorter than 36 inches, tell them to eat their Wheaties
		if (Tall >= 36 ) {
			System.out.println("Oh wow...");
		} else {
			System.out.println("Eat your wheaties");
		}
	}

	void skill2() { // Write a loop to print every third number between 1 and 30 to the console
		for (int i = 1; i < 30; i++) {
			if (i%3==0) {
				System.out.println(i);
			}
		}
	}

	void skill3() { // Get a random number that is less than 20 and print it to the console
		Random randomGenerator = new Random();
		int num = randomGenerator.nextInt(20);
		System.out.println("1st number is "+num); 
		// Get another random number that is less than 10 and print it to the console
		Random radNum = new Random();
		int num2 = radNum.nextInt(10);
		System.out.println("2nd number is "+num2);
		// Using a pop-up, tell the user the difference between the numbers // Hint: use
		// subtraction
		int num3 = num - num2;
		System.out.println("The difference between the numbers is "+num3+"." );
	}

	void skill4() { // In a pop-up, ask the user for the city they live in
		String city = JOptionPane.showInputDialog(null,"What city do you live in?");
		// If they answered "San Diego", tell them they live in America's Finest City
		if (city == "San Diego") {
			 JOptionPane.showMessageDialog(null,"Ah! The America's Finest City!");
		} else {
			JOptionPane.showMessageDialog(null,"Just move to San Diego");
		}
		// Otherwise, tell them to move to San Diego
		int cars = 3;
		// Create a variable - cars - and initialize it to the number of cars your
		// family has. // If there are 0 cars, use a pop-up to display, "I bet you use
		// public transportation."

		// If there is 1 car, use a pop-up to display the make/model of the car

		// If there is more than 1 car, use a pop-up to display how many wheels the //
		// cars have between them.

	}

	void skill5() { // In a pop-up, ask the user for the name of their school

		// In another pop-up, tell the user, that their school is a fantastic school. //
		// You must include the name of the school in the message.

	}
}