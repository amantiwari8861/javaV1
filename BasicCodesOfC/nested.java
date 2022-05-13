public class nested {
    public static void main(String[] args) 
    {
        int marks=90;

        // if (marks>=90 && marks<=100) 
        // {
        //     System.out.println("A1");
        // }
        // else if (marks>=80 && marks<=89)
        // {
        //     System.out.println("A2");
        // }
        // else if (marks>=70 && marks<=79)
        // {
        //     System.out.println("B1");
        // }
        // else if (marks>=60 && marks<=69)
        // {
        //     System.out.println("B2");
        // }
        // else if (marks>=50 && marks<=59)
        // {
        //     System.out.println("C1");
        // }
        // else if (marks>=40 && marks<=49)
        // {
        //     System.out.println("C2");
        // }
        // else if (marks>=33 && marks<=39)
        // {
        //     System.out.println("D");
        // }
        // else if (marks>=0 && marks<=32)
        // {
        //     System.out.println("Fail");
        // }
        // else
        // {
        //     System.out.println("Invalid");
        // }

        if(marks>=0 && marks<=100)
        {
            System.out.println("Valid marks");
            if(marks>=60)
            {
                System.out.println("first division pass");
                if(marks==100)
                {
                    System.out.println("Distinction");
                }
            }
            else
            {
                System.out.println("other divisions");
            }
        }
        else
        {
            System.out.println("invalid marks!");
        }
    }
}