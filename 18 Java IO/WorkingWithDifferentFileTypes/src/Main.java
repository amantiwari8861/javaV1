import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FileHandler fh = null;
        String choice;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Enter ur choice:");
            choice = sc.nextLine();
            switch (choice) {
                case "csv":
                    fh = new FileHandler("src/csv/files/Data.csv");
                    break;
                case "html":
                    fh = new FileHandler("");
                    break;
                case "json":
                    fh = new FileHandler("");
                    break;
                case "xml":
                    fh = new FileHandler("");
                    break;
                case "excel":
                    fh = new FileHandler("");
                    break;
                default:System.out.println("invalid operation!");
                    break;
            }
            if (fh != null) 
            {
                fh.initiate();
            }
        } while (!choice.equals("exit"));
        sc.close();
    }
}