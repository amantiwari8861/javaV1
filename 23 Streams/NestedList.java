import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class NestedList {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        
        // arr.forEach(line -> {
        //     line.forEach(e->{
        //         System.out.print(e+" ");
        //     });
        //     System.out.println();
        // });
        let sum=0;
        for (int i = 0; i < 4; i++) 
        {
            for (int j = 0; j < 4; j++) 
            {
                tempsum=matr[i][j]+matr[i][j+1]+matr[j+2]+matr[i+1][j+1]+matr[i+2][j]+matr[i+2][j+1]+matr[i+2][j+2];
                if (tempsum>sum) 
                {
                    sum=tempsum;
                }
            }
        }
        
        
    }
}
