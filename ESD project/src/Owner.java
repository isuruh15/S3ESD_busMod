/*
this class holds owner's details
*/

/**
 *
 * @author isuru
 */
public class Owner {
    private String name;
    private String location;
    private String type;
    
    public Owner (String n, String l, String t){
        name = n;
        location = l;
        type = t;
        
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }
    
    
}
