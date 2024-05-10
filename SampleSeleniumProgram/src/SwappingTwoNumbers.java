public class SwappingTwoNumbers {

	public static void main(String[] args) {
		int a = 30;
		int b = 50;

		
		System.out.println("Before Swapping: a="+a + " b"+b);
		int temp = a;
		a=b;
		b=temp;
		
		System.out.println("After Swapping: a="+a + " b="+b);
		}

}
