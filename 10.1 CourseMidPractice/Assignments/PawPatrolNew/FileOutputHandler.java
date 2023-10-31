import java.io.FileWriter;

public class FileOutputHandler {

    public void writDataIntoFile(double familyGroupSurvivalRate, double penguinSurvivalRate, double eggSurvivalRate,double chickSurvivalRate, double overallColonySurvival) {

        final String FILE_NAME="colonyFinal.txt";
        FileWriter writer=null;
        try
        {
            writer = new FileWriter(FILE_NAME);
            writer.write(familyGroupSurvivalRate+",");
            writer.write(penguinSurvivalRate+",");
            writer.write(eggSurvivalRate+",");
            writer.write(chickSurvivalRate+",");
            writer.write(overallColonySurvival+"\n");
        }
        catch (Exception e)
        {
            System.out.println("Error in writing to file! Exiting...");
        }
        finally
        {
            try {
                writer.close();
            } catch (Exception e) {
                System.out.println("Error:"+e.getMessage());
            }
        }
    }
    
}
