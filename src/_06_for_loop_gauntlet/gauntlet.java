package _06_for_loop_gauntlet;

public class gauntlet {
public static void main(String[] args) {
	//0 to 100
	int value = 0;
	for (int i = 0; i < 101; i++) {
		System.out.println(value);
		value = value + 1;
	}
	//100 to 0
	for (int i = 0; i < 102; i++) {
	 System.out.println(value);
		value = value - 1;
	}
	//Evens
	for (int i = 0; i < 102; i++) {
		if (value%2 == 0) {
			System.out.println(value);
		}
		value = value + 1;
	}
	//Odds 
	value = 1;
	for (int i = 0; i < 100; i++) {
		if (value%2 != 0) {
			System.out.println(value);
		}
		value = value + 1;
	}
	// 1 to 500, even or odd
		value = 1; 
		for (int i = 0; i < 500; i++) {
			System.out.println(value);
			if (value%2 ==0) {
			System.out.println("even");
			} else {
				System.out.println("odd");
			}
			value = value + 1;
		}
	//multiples of 7
	for (int i = 0; i < 778; i++) {
		if (i%7==0) {
			System.out.println(i);
		}
	}
	//years
	value = 0;
	int year = 2004;
	for (int i = 0; i < 17; i++) {
		System.out.println("In "+year+", I was "+value+" years old." );
		value = value + 1;
		year = year + 1 ; 
	}
	//2x2 grid
	for(int i = 0; i < 3; i++) {
		for(int j = 0; j < 3; j++) {
			System.out.println(i + " " +j);
			
			
		}

	}
	//3x3 grid
	for (int k = 0; k < 3; k++) {
		for (int l = 0; l < 3; l++) {
				System.out.print(k*3 + l + 1);
		
		}
		System.out.println();
	}
	//10x10
	for (int b = 0; b < 10; b++) {
		for (int a = 0; a < 10; a++) {
			System.out.print(b*10 + 1 + a + "\t");
		}
		System.out.println();
	}
	for (int i = 0; i < 6; i++) {
		for (int j = 0; j < i+1; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
	
}
