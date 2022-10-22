package JavaAssignment1;

public class swappingTwoNumbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int temp = 0;

		System.out.println("a value before swapping" + a);
		System.out.println("b value before swapping" + b);

		temp = b;
		b = a;
		a = temp;

		System.out.println("a value after swapping" + a);
		System.out.println("b value after swapping" + b);

	}

}
