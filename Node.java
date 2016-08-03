import java.util.ArrayList;


public class Node {
	
    private ArrayList<Connection> neighborConnections;
    private Entity entity;
    
    /**
     * @param Entity to put in a Node
     */
    public Node (Entity inEntity){
        this.entity = inEntity;
        this.neighborConnections = new ArrayList<Connection>();
    }
    
    
    /**
     * @return related entity
     */
    public Entity getEntity() {
		return entity;
	}
    
    
    /**
     * This method adds an Connection to the Node of this graph iff the connection is not already present. 
     * @param connection The connection to add
     */
    public void addNeighbor(Connection connection){
        if(this.neighborConnections.contains(connection)){
            return;
        }
        this.neighborConnections.add(connection);
    }
    
    
    /**
     * @param nodeToSearch The edge for which to search
     * @return true iff nodeToSearch is contained in neighborConnections
     */
    public boolean containsNeighbor(Connection connection){
        return this.neighborConnections.contains(connection);
    }
    
    
    /**
     * @param index The index of the Connection to retrieve
     * @return Connection The Connection at the specified index in this.neighborConnections
     */
    public Connection getNeighbor(int index){
        return this.neighborConnections.get(index);
    }
    
    
    /**
     * @param index The index of the Connection to remove from this.neighborConnections
     * @return Connection The removed Connection
     */
    Connection removeNeighbor(int index){
        return this.neighborConnections.remove(index);
    }
    
    
    /**
     * @param e The Connection to remove from this.neighborConnections
     */
    public void removeNeighbor(Connection e){
        this.neighborConnections.remove(e);
    }
    
    
    /**
     * @return int The number of neighbors of this Node
     */
    public int getNeighborCount(){
        return this.neighborConnections.size();
    }
    
    
    /**
     * @return String The label of this Node
     */
    public String getName(){
        return this.entity.getName();
    }
    
    
    /**
     * @return String A String representation of this Node
     */
    public String toString(){
        return "Node " + getName();
    }
    
    
    /**
     * @return The hash code of this Node's entity
     */
    public int hashCode(){
        return this.entity.hashCode();
    }
    
    
    /**
     * @param other The object to compare
     * @return true iff other instance of Node and the two Node objects have the same entity
     */
    public boolean equals(Object other){
        if(!(other instanceof Node)){
            return false;
        }
        
        Node tmp = (Node)other;
        return this.entity.equals(tmp.entity);
    }
    
    
    /**
     * @return ArrayList<Connection> A copy of this.neighborConnections. Modifying the returned
     */
    public ArrayList<Connection> getAllConnections(){
        return new ArrayList<Connection>(this.neighborConnections);
    }

}
