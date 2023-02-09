// import java.math.BigDecimal;
// import java.util.*;

// class BigDecimalDemo {
//     public static void main(String[] args) {
//         // Input
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         String[] s = new String[n + 2];
//         for (int i = 0; i < n; i++) {
//             s[i] = sc.next();
//         }
//         sc.close();

//         BigDecimal bdarr[] = new BigDecimal[n];
//         for (int i = 0; i < n; i++) 
//         {
//             bdarr[i] = new BigDecimal(s[i]);
//         }
//         Collections.sort(Arrays.asList(bdarr), (e1, e2) -> {
//             if (e1.compareTo(e2)==1)
//                 return -1;
//             else
//                 return 1;
//         });
//         List<BigDecimal> bdList = Arrays.asList(bdarr);
//         for (int i = 0; i < bdList.size(); i++) {
//             s[i] = String.valueOf(bdList.get(i));
//         }
//         // Output
//         for (int i = 0; i < n; i++) {
//             System.out.println(s[i]);
//         }
//     }
// }
import java.math.BigDecimal;
import java.util.*;

class BigDecimalDemo {

    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        for (int i = 0; i < n; i++) 
        {
            // inserting string values to bigdecimal
            BigDecimal First = new BigDecimal(s[i]);
            int index = i;
            for (int j = i + 1; j < n; j++) 
            {
                // second BigDecimal to compare the first Bigdecimal
                BigDecimal Second = new BigDecimal(s[j]);

                // comparing if First element is greater that second element
                // if the First element is greater than Second element than compareTo() returns
                // 1

                if (Second.compareTo(First) == 1) {
                    First = Second;
                    
                    index = j;
                }
            }
            String temp = s[i];
            s[i] = s[index];
            s[index] = temp;
        }

        // Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }

}
/* 9,-100,50,0,56.6,90,0.12,.12,02.34,000.000 */