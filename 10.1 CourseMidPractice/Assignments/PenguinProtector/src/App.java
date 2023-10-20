import simulation.Simulation;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Simulation simulation=new Simulation();
        System.out.println("Welcome to Paw Patrol");
        System.out.println("=====================");
        simulation.choosePawDogs();
        System.out.println("\nRunning simulation from month 7- 6");
        simulation.simulatePerMonth();
        System.out.println("Goodbye");
    }
}