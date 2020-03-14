//Method to find if float number is even or odd


public class FloatEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float f = 2.543f;
		String num = Float.toString(f);
		num.replace('.', '|');

		// Method 1 using split method
		String[] aStrings = num.split("|");
		System.out.print("Using method 1 "+f +" is  ");
		System.out.println((Integer.parseInt(aStrings[aStrings.length - 1]) % 2 == 0) ? "Even" : "Odd");

		// Method 2 without split method
		System.out.print("Using method 2 " + f +" is  ");
		System.out.println((Integer.parseInt(String.valueOf(num.charAt(num.length() - 1)))) % 2 == 0 ? "Even" : "Odd");

		//Method 3 : If input is given as string
		String num2="3.486";
		System.out.print("Using method 3 "+ num2 +" is  ");
		System.out.println((Integer.parseInt(String.valueOf(num2.charAt(num2.length() - 1)))) % 2 == 0 ? "Even" : "Odd");

	}

}
