import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        File file = new File("hi.txt");
        //file.createNewFile(); // new file created
        if(!file.exists())//if it exist or not boolean
        {
          file.createNewFile();
        }
        System.out.println(file.canRead());//can we read
        System.out.println(file.canWrite());//can we write
        System.out.println(file.getName());//file name
        System.out.println(file.getAbsolutePath());//path

        //write in file
        FileWriter myFileWriter = new FileWriter("hi.txt");
        myFileWriter.write("hey yo \n kya" );
        myFileWriter.close();

        //Read a file

        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();

        //list all files in a folder
        File file1 = new File("C:\\Users\\Lenovo\\work\\firstJava");
        String[] arr = file1.list();
        System.out.println(arr[0]);

        System.out.println(file.length());// length of file in byte

        //Create a new folder
        File file2 = new File("C:\\Users\\Lenovo\\work\\firstJava\\YO");
        System.out.println(file2.mkdir());//The mkdir() method is used for creating a new directory.

        //delete a file
        //file.delete();

    }
}
