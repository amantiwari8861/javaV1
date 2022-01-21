import java.util.Scanner;

class Solution {
    public int static findMaxConsecutiveOnes(int[] nums) 
    {
      System.out.println("hii");
        return max;
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int size,num;
        System.out.println("enter array size :");
        size=sc.nextInt();

        int arr[]=new int[size];

        System.out.println("enter the data in array \n");

        for (int i = 0; i < arr.length; i++) {
            
            num=sc.nextInt();
            if (num==1 || num==0) 
            {
                arr[i]=num;
            } 
            else {
                System.out.println("number must be 0 or 1");
                break;
            }
        }
        int max=findMaxConsecutiveOnes(arr);
        System.out.println("maximum 1's is "+max);

    }
}