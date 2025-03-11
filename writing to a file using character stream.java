// 14. Writing to a File Using Character Stream
class FileWriteCharStream {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("example.txt");
        fw.write("This is a character stream example.");
        fw.close();
    }
}







