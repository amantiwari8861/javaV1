class ArrayTest {

	public static void delete(char[] ar, int pos){
	    //Traversing the array from the position where the element has to be deleted to the end
		for(int i=pos-1;i<ar.length-1;i++){
		    //Moving each element one position to the left
			ar[i]=ar[i+1];
		}
		
		//The space that is left at the end is filled with character '0'
		ar[ar.length-1]='0';
	}
}

class ArrayDelete{
	public static void main(String args[]){
		char arr[]=new char[6];
		arr[0]='A';
		arr[1]='B';
		arr[2]='J';
		arr[3]='C';
		arr[4]='D';
		arr[5]='E';
		
		//Make changes and try to delete elements from different positions
		ArrayTest.delete(arr, 3);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

}
