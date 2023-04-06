public class TwoDimArray 
{
    public static void main(String[] args) {
        
        String country[]={"India","America","Australia"};
        String stateData[][]={
                                {"Delhi","Mumbai","UP","Bihar"},
                                {"New York","California","Los Angeles","Texas"},
                                {"Sydney","QueensLand","Victoria"}
                            };

        for (int i = 0; i < stateData.length; i++) 
        {
            System.out.print("Printing States of "+country[i]+": \n\t");
            for (int j = 0; j < stateData[i].length; j++) 
            {
                System.out.print(stateData[i][j]+"  ");
            }
            System.out.println();
        }                        
    }
}
