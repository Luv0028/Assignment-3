// 18. Copying a File
import java.io.*;
class FileCopy {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("source.txt");
        FileOutputStream fos = new FileOutputStream("destination.txt");
        int i;
        while ((i = fis.read()) != -1) {
            fos.write(i);
        }
        fis.close();
        fos.close();
        System.out.println("File copied successfully.");
    }
}









