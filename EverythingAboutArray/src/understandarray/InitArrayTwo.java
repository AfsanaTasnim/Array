package understandarray;

public class InitArrayTwo {

	public static void main(String[] args) {
		
		int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
		
		System.out.println("Index\tValue");

		
		for(int counter = 0; counter < array.length; counter++) {
			System.out.println(counter + "\t" + array[counter]);
		}
	}

}
