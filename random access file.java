// 20. Random Access File
import java.io.RandomAccessFile;
class RandomAccessFileExample {
    public static void main(String[] args) throws Exception {
        RandomAccessFile raf = new RandomAccessFile("randomfile.txt", "rw");
        raf.writeUTF("Hello, World!");
        raf.seek(0);
        System.out.println(raf.readUTF());
        raf.close();
    }
}











