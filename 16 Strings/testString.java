import java.util.Scanner;

class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        for (int i=0;i<nums.length;i++)
        {
             for(int j=i+1;j<nums.length;j++)
             {
                if (nums[i]+nums[j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of array elements");
        int n=obj.nextInt();

        int[] nums=new int[n];
        System.out.println("Enter the array elements");
        for(int a=0;a<n;a++)
        {
            nums[a]=obj.nextInt();
        }
        System.out.println("Enter the target sum number");
        int t=obj.nextInt();
        
        Solution obj2=new Solution();

        int arr[]=obj2.twoSum(nums,t);
        
        for (int i : arr) {
            System.out.println(" The indices are :"+i);
        }
    }
}