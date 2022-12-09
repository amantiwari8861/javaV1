package structure;

/** Show Two-Dimensional Array of Objects */
// tag::main[]
public class ArrayTwoDObjects {

	/** Return list of subscript names (unrealistic; just for demo). */
	public static String[][] getArrayInfo() {
		String info[][];
		info = new String[10][10];
		for (int i=0; i < info.length; i++) {
			for (int j = 0; j < info[i].length; j++) {
				info[i][j] = "String[" + i + "," + j + "]";
			}
		}
		return info;
	}

	/** Run the initialization method and print part of the results */
	public static void main(String[] args) {
		print("from getArrayInfo", getArrayInfo());
	}

	/** Print selected elements from the 2D array */
	public static void print(String tag, String[][] array) {
		System.out.println("Array " + tag + " is " + array.length + " x " + 
			array[0].length);
		System.out.println("Array[0][0] = " + array[0][0]);
		System.out.println("Array[0][1] = " + array[0][1]);
		System.out.println("Array[1][0] = " + array[1][0]);
		System.out.println("Array[0][0] = " + array[0][0]);
		System.out.println("Array[1][1] = " + array[1][1]);
	}
}
// end::main[]
