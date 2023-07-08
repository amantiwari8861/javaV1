/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraypack;

public class MergedArray {
    public int[] arr = new int[20];
        public void display()
        {
            System.out.println("\nThe merged list is:");
            for (int i = 0; i < 20; i++)
                System.out.println(arr[i]);
            System.out.println();
        }
}
