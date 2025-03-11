// 12. Writing to a File Using Byte Stream
class FileWriteByteStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("output.txt");
        fos.write("Java I/O Streams Example".getBytes());
        fos.close();
    }
}





