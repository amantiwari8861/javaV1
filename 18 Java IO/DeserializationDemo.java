import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {
    public static void main(String[] args) {
        Animal animal = null;
        try {
            // FileInputStream fis = new FileInputStream("animal.txt");
            FileInputStream fis = new FileInputStream("animal.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            animal = (Animal) ois.readObject();
            System.out.println( animal.getName() + " " +animal.getGender() +" "+animal.getAnimalWeight() );

            animal = (Animal) ois.readObject();
            System.out.println( animal.getName() + " " +animal.getGender() +" "+animal.getAnimalWeight() );

            // while (true) 
            // {
            //     try {
            //         animal=(Animal)ois.readObject();
            //         System.out.println( animal.getName() + " " +animal.getGender()+" "+animal.getAnimalWeight() );
            //     } 
            //     catch (EOFException e) 
            //     {
            //         break;
            //     }
            // }
            ois.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}