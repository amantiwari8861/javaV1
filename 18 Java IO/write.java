import java.io.*;
class file1{
  public static void main(String[] args) {
     try{
           FileWriter file = new FileWriter("C:/Users/Aman_Tiwari/Desktop/note2.txt");
           file.write("my data ");
           file.close();
        }
        catch(IOException i){
            System.out.println("handled ");
        }
  }
}