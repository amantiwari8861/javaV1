class Run
{

    public static void main(String[] args) {
//   System.out.println((char)65);      

        for(int i=0;i<5;i++)
        {
            for(int j=0;j<=i;j++)
            {
                // System.out.print((char)(65+j));
                System.out.print((char)(j+'a'));
            }
            System.out.println();
        }
    }
}