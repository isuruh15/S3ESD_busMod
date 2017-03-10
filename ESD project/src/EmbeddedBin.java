
import java.util.Observable;
import java.util.Observer;

/*this class represent embedded bin
 */

/**
 *
 * @author isuru
 */
public class EmbeddedBin implements Observer{
    
    private String id;
    private Owner owner;
    private String loc;
    private int status;         //authority can check levels anytime
    private boolean isFull;

    @Override
    public void update(Observable o, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the owner
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * @param owner the owner to set
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     * @return the loc
     */
    public String getLoc() {
        return loc;
    }

    /**
     * @param loc the loc to set
     */
    public void setLoc(String loc) {
        this.loc = loc;
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }
    
   
    
}
