// 16. File Existence Check
import java.io.File;
class FileExistenceCheck {
    public static void main(String[] args) {
        File file = new File("testfile.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("File created successfully.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File already exists.");
        }
    }
}









