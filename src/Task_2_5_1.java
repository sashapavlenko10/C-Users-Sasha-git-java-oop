import java.io.IOException;
import java.io.RandomAccessFile;

public class Task_2_5_1 {

    static String fileAsText (String file) throws IOException{
        RandomAccessFile f = new RandomAccessFile (file,"r");
      
        try{
            byte [] buf = new byte [(int)f.length()];
            f.read(buf);
            return new String(buf);
        } finally {
            f.close();
        }
    }
    static void writeTextToFile (String file, String text) throws IOException {
        RandomAccessFile f = new RandomAccessFile (file,"rw");
        try{
            f.setLength(0); //!!!
            byte[] buf = text.getBytes();
            f.write(buf);
        } finally {
            f.close();
        }
    }
    public static void main(String[] args) throws IOException {
        
        final String file = "C:\\Users\\Sasha\\Documents\\1.txt";
        String text = fileAsText(file);
        text = text.replace("hello", "1234");
        writeTextToFile (file,text);
    }
}
