
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/*
this class represent data handling
*/

/**
 *
 * @author isuru
 */
public class MainDatabase {
    private String db1_path;
    
    public void writeDB(File path, String data){
        try{
            PrintWriter pwrite = new PrintWriter(path);
            pwrite.println(data);
            pwrite.close();
        }catch (IOException e){
            System.out.println("Error in write");
        }
    }
}
