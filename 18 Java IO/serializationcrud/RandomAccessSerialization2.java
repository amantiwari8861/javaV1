import java.io.*;
import java.util.List;

public class RandomAccessSerialization2 {
    public static void main(String[] args) {
        // Read the index file to get the offsets
        try (ObjectInputStream indexIn = new ObjectInputStream(new FileInputStream("person_index.ser"));
             RandomAccessFile file = new RandomAccessFile("person.ser", "r")) {

            List<Long> offsets = (List<Long>) indexIn.readObject();
            System.out.println("Offsets read from index file: " + offsets);

            // Randomly access the second person (index 1)
            long secondPersonOffset = offsets.get(1);
            long thirdPersonOffset = offsets.size() > 2 ? offsets.get(2) : file.length(); // End of file or next object offset

            file.seek(secondPersonOffset);  // Go to the offset for the second object

            // Read bytes between secondPersonOffset and thirdPersonOffset (next object's offset or end of file)
            byte[] personBytes = new byte[(int)(thirdPersonOffset - secondPersonOffset)];
            file.readFully(personBytes);

            Person person = deserializePerson(personBytes);
            System.out.println("Randomly accessed Person: " + person);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Deserialize person object from a byte array
    private static Person deserializePerson(byte[] personBytes) throws IOException, ClassNotFoundException {
        ByteArrayInputStream byteIn = new ByteArrayInputStream(personBytes);
        ObjectInputStream objIn = new ObjectInputStream(byteIn);
        return (Person) objIn.readObject();
    }
}
