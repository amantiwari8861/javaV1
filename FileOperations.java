import java.io.File;
import java.io.IOException;

public class FileOperations {
    public static void main(String[] args) {

        // File file1 = new File("C:/users/aman_tiwari/desktop/File1.txt");
        // File file2 = new File("C:/users/aman_tiwari/desktop/File2.txt");
        // File file3 = new File("C:/users/aman_tiwari/desktop/File3/ab.txt");

        // System.out.println("the file will created here :" + file1.getAbsolutePath());
        /*
         * try { System.out.println(file1.createNewFile());
         * System.out.println(file2.createNewFile());
         * 
         * if (file1.createNewFile()) { System.out.println("File created: " +
         * myObj.getName()); } else { System.out.println("File already exists."); }
         * 
         * } catch (IOException e) { e.printStackTrace(); }
         */
        // System.out.println("file name:"+file1.getName());
        // System.out.println("file exist ?:"+file1.exists());
        // System.out.println("file size in bytes ?:"+file1.length());
        // System.out.println("have reading permission ? :"+file1.canRead());
        // System.out.println("have writing permission ? :"+file1.canWrite());
        // file1.setWritable(false);
        // file1.setWritable(true);
        // System.out.println("have writing permission ? :"+ file1.canWrite());
        // System.out.println("have read permission ? :"+ file1.canRead());
        // System.out.println(file2.delete());
        // System.out.println(file3.mkdir());
        // System.out.println(file3.mkdirs());
        File f = new File("C:/users/aman_tiwari/desktop/non_existing_dir/someDir");
        // System.out.println("is folders created ? :"+f.mkdir());
        // System.out.println("is folders created ? :" + f.mkdirs());
        // will yield false for the first [and no dir will be created], and true for the
        // second, and you will have created non_existing_dir/someDir

        // File desk = new File("C:/users/aman_tiwari/desktop");
        // String filelist[] = desk.list();
        // System.out.println("here is files list in desktop folder");
        // for (String file : filelist) {
        //     System.out.println(file);
        // }
            
    }
}

// canRead() Boolean Tests whether the file is readable or not
// canWrite() Boolean Tests whether the file is writable or not
// createNewFile() Boolean Creates an empty file
// delete() Boolean Deletes a file
// exists() Boolean Tests whether the file exists
// getName() String Returns the name of the file
// getAbsolutePath() String Returns the absolute pathname of the file
// length() Long Returns the size of the file in bytes
// list() String[] Returns an array of the files in the directory
// mkdir() Boolean Creates a directory