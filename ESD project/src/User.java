/*
this class represent web app*/

/**
 *
 * @author isuru
 */
public class User {
    private String type;
    private String userID;
    private String path;
    private CentralAuth controlSys;
    
    public User (String id, String type, CentralAuth c){
        userID = id;
        this.type = type;
        controlSys = c;
    }
    
    public void reqPath(){
        path = this.getControl().sendPath(this);
        System.out.println(path);
    }
    
    public CentralAuth getControl(){
        return controlSys;
    }
    
}
