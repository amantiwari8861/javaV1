import java.util.Scanner;
public class Array3 {
    public static void main(String[] args) {      
        int matr[][]= new int[2][2];
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter value in matrix ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matr[i][j]=obj.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            
            for (int j = 0; j < 2; j++) {
                
                System.out.print(matr[i][j]+" \t");
            }
            System.out.println();
        }
    }
}
