
public class Connection {
	private Node one, two;
    
    /**
     * Constructor
     * @param one The first node in the Connection
     * @param two The second node in the Connection
     */
    public Connection(Node one, Node two){
    	this.one = (one.getName().compareTo(two.getName()) <= 0) ? one : two;
        this.two = (this.one == one) ? two : one;
    }
    
    
    /**
     * To get other node of this connection
     * @param current
     * @return The neighbor of current along this Connection
     */
    public Node getNeighbor(Node current){
        if(!(current.equals(one) || current.equals(two))){
            return null;
        }
        return (current.equals(one)) ? two : one;
    }
    
    
    /**
     * @return Node this.one
     */
    public Node getOne(){
        return this.one;
    }
    
    
    /**
     * @return Node this.two
     */
    public Node getTwo(){
        return this.two;
    }
    
    
    /**
     * @return String A String representation of this Connection
     */
    public String toString(){
        return "({" + one.getName() + ", " + two.getName() + "},)";
    }

    
    /**
     * @return int The hash code for this Connection 
     */
    public int hashCode(){
        return (one.getName() + two.getName()).hashCode(); 
    }
    
    
    /**
     * @param other The Object to compare against this
     * @return ture iff other is an Connection with the same Vertices as this
     */
    public boolean equals(Object other){
        if(!(other instanceof Connection)){
            return false;
        }
        Connection e = (Connection)other;
        return e.one.equals(this.one) && e.two.equals(this.two);
    }   

}
