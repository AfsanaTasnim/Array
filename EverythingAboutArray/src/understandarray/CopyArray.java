package understandarray;

public class CopyArray {

	public static void main(String[] args) {
		
		int myArray[] = new int[10];
		int copyTo[] = new int[10];
		
		for(int i = 0; i < myArray.length; i++) {
			myArray[i] = i + 1;
		}
		
		for(int i = 0; i < myArray.length; i++) {
			copyTo[i] = myArray[i];
		}
		
		for(int i = 0; i < myArray.length; i++) {
			System.out.println(copyTo[i]);
		}

	}

}
