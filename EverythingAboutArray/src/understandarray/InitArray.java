package understandarray;

public class InitArray {

	public static void main(String[] args) {
		int[] array;			//declare array named array
		array = new int[10];	//create the array object
		
		System.out.println("Index\tValue");
		
		for(int counter = 0; counter < array.length; counter++) {
			System.out.println(counter + "\t" + array[counter]);
		}

	}

}
