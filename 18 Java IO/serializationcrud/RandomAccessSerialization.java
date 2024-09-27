import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RandomAccessSerialization {
    public static void main(String[] args) {
        List<Long> offsets = new ArrayList<>(); // To store offsets of each object
        
        try (RandomAccessFile file = new RandomAccessFile("person.ser", "rw");
             ObjectOutputStream indexOut = new ObjectOutputStream(new FileOutputStream("person_index.ser"))) {

            // Create some Person objects
            Person person1 = new Person("John Doe", 30);
            Person person2 = new Person("Jane Doe", 25);
            Person person3 = new Person("Alice Smith", 40);

            // Serialize each object and record its offset
            offsets.add(file.getFilePointer());  // Record start of object 1
            serializePerson(file, person1);
            
            offsets.add(file.getFilePointer());  // Record start of object 2
            serializePerson(file, person2);
            
            offsets.add(file.getFilePointer());  // Record start of object 3
            serializePerson(file, person3);

            // Write the offsets to an index file
            indexOut.writeObject(offsets);

            System.out.println("Objects serialized and offsets saved.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void serializePerson(RandomAccessFile file, Person person) throws IOException {
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        ObjectOutputStream objOut = new ObjectOutputStream(byteOut);
        objOut.writeObject(person);
        objOut.flush();

        byte[] personBytes = byteOut.toByteArray();
        file.write(personBytes);  // Write bytes of the serialized object to RandomAccessFile
    }
}
