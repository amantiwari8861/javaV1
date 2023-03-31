public class Q15 {

    public static void main(String[] args) {
        
        int spacepos=8,starpos=9;
        for (int i = 1; i <= 16; i++) 
        {
            for (int j = 1; j <= 16; j++) 
            {
                if(spacepos>=j && i<=4 || spacepos>=8 && i<=8) 
                {
                    if(i==5)
                        spacepos=6;
                    System.out.print("@"); 
                }
            }
            spacepos--;
            System.out.println();
        }

    }
}