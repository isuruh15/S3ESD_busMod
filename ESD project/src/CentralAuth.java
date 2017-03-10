
import java.util.Observable;

/*
 this class represents the central control system
 */

/**
 *
 * @author isuru
 */
public class CentralAuth extends Observable {
    
    private String path;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public void notfyObservers(){
        //call for status reports of bins
    }
    
    public String sendPath(User u){
        //compute path here
        return path;
    }
    
}
