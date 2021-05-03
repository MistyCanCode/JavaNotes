public class HelloWorld {

	public static void main(String[] args) {

		// All primitive variables are created and stored in the stack, objects are in a
		// memory location on the heap with the variable on the
		// stack pointing to the memory location in the heap
		// created on the stack
		int x = -5;
		// created on the stack
		char y = 'y';
		// string variable lives in the stack, but the actual object that is stored
		// inside the variable lives in the heap
		// the string "Hello World" has a memory address in the heap, and the variable s
		// is in the stack
		String s = "Hello World!";

		System.out.println(y);
		System.out.println(x);
		// this points to where the object lives in the heap (memory location)
		System.out.println(s);

		// postfix works with increment or decrement
		System.out.println(x++);
		System.out.println(x);
		// prefix
		System.out.println(++x);
		System.out.println(x);
		System.out.println(x--);
		System.out.println(x);

		// Assignment operators
		x += 2;
		x -= 2;
		x /= 2;
		x *= 2;
		x %= 2;
		System.out.println(x);

		int totalSugarInGlass = 0;
		int sugar = 5;
		int maxSugar = 10;

		if (sugar <= maxSugar) {
			totalSugarInGlass += sugar;
			System.out.println(totalSugarInGlass);
		} else {
			System.out.println("We only allow 10 tsp. of sugar per glass.");
		}
		System.out.println("I will run no matter what.");

		int splenda = 2;
		int maxSplenda = 10;
		int totalSplendaInGlass = 0;

		while (totalSplendaInGlass < maxSugar) {
			totalSplendaInGlass += splenda;
			System.out.println("Total splenda in glass: " + totalSplendaInGlass);
		}
		System.out.println("This will not run until the loop finishes");

		do {
			totalSplendaInGlass += splenda;
			System.out.println("Total Splenda in glass: " + totalSplendaInGlass);
		} while (totalSplendaInGlass < maxSplenda);

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		int[] numbers = new int[5];
		int[] num = new int[] {6,7,8,9,10};
		//numbers[0] = 4;
		int count = 1;
		System.out.println(numbers);//fully qualified class name, @ symbol & a hexadecimal representation
		System.out.println(numbers.toString());//same as above
		
		for(int i = 0; i< numbers.length; i++, count++)
		{
			numbers[i] = count;
			System.out.println(numbers[i] + " " + num[i]);
			}
		int currentNumber = 11;
		int max = ((int)Math.random() * 10) + 1;
		int temp[] = new int[numbers.length + 1];
		for (int j = 0; j < max; j++, currentNumber++) {
			temp[j] = numbers[j];
		}
		temp[temp.length - 1] = currentNumber;
		numbers = temp;
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
	
} 
