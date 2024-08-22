import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo  {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setGender('M');
        animal.setName("Bolt");
        animal.setAnimalWeight("12 Kg");
        // Animal animal2 = new Animal();
        // animal.setGender('F');
        // animal.setName("Liala");
        
        try {
            FileOutputStream fos = new FileOutputStream("animal.ser",true);
            // FileOutputStream fos = new FileOutputStream("animal.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(animal);
            // oos.writeObject(animal2);
            System.out.println("Success..");
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}