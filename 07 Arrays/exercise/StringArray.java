public class StringArray {

    public static void main(String[] args) {
        
        String colleges[]=new String[5];

        colleges[0]="IPU";
        colleges[1]="DU";
        colleges[2]="Xyz";
        colleges[3]="ABCD";
        colleges[4]="Hello";

        System.out.println("All colleges :");
        for (int i = 0; i < colleges.length; i++) 
        {
            System.out.println(colleges[i]);
        }

    }
}