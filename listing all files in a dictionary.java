// 17. Listing All Files in a Directory
import java.io.File;
class ListFiles {
    public static void main(String[] args) {
        File directory = new File(".");
        String[] files = directory.list();
        if (files != null) {
            for (String file : files) {
                System.out.println(file);
            }
        }
    }
}









