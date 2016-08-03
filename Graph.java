import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class Graph {
    private HashMap<String, Node> nodes;
    private HashMap<Integer, Connection> edges;
    
    public Graph() {
        this.nodes = new HashMap<String, Node>();
        this.edges = new HashMap<Integer, Connection>();
    }
    
    /**
     * This constructor accepts an ArrayList<Node> and populates
     * this.nodes. If multiple Node objects have the same label,
     * then the last Node with the given label is used. 
     * @param nodes The initial Vertices to populate this Graph
     */
    public Graph(ArrayList<Node> nodes) {
        this.nodes = new HashMap<String, Node>();
        this.edges = new HashMap<Integer, Connection>();
        
        for(Node n: nodes) {
            this.nodes.put(n.getName(), n);
        }
        
    }
    

    /**
     * Accepts two nodes iff no Connection relating one and two 
     * exists in the Graph.
     * @param one The first Node of the Connection
     * @param two The second Node of the Connection
     */
    public boolean addConnection(Node one, Node two) {
        if(one.equals(two)) {
            return false;   
        }
       
        //check the Connection is not in the Graph
        Connection e = new Connection(one, two);
        if(edges.containsKey(e.hashCode())) {
            return false;
        }
       
        //and that the Connection isn't already incident to one of the nodes
        else if(one.containsNeighbor(e) || two.containsNeighbor(e)) {
            return false;
        }
            
        edges.put(e.hashCode(), e);
        one.addNeighbor(e);
        two.addNeighbor(e);
        return true;
    }

    
    /**
     * 
     * @param e The Connection to look up
     * @return true iff this Graph contains the Connection e
     */
    public boolean containsConnection(Connection e) {
        if(e.getOne() == null || e.getTwo() == null) {
            return false;
        }
        
        return this.edges.containsKey(e.hashCode());
    }
    
    
    /**
     * This method removes the specified Connection from the Graph,
     * including as each node's incidence neighborhood.
     * @param e The Connection to remove from the Graph
     * @return Connection The Connection removed from the Graph
     */
    public Connection removeConnection(Connection c) {
       c.getOne().removeNeighbor(c);
       c.getTwo().removeNeighbor(c);
       return this.edges.remove(c.hashCode());
    }

    
    /**
     * @param node The Node to look up
     * @return true iff this Graph contains node
     */
    public boolean containsNode(Node node) {
        return this.nodes.get(node.getName()) != null;
    }

    
    /**
     * @param label The specified Node label
     * @return Node The Node with the specified label
     */
    public Node getNode(String label) {
        return nodes.get(label);
    }
    
    
    /**
     * This method adds a Node to the graph. If a Node with the same label
     * as the parameter exists in the Graph, the existing Node is overwritten
     * only if overwriteExisting is true. If the existing Node is overwritten,
     * the Connections incident to it are all removed from the Graph.
     * @param node
     * @param overwriteExisting
     * @return true iff node was added to the Graph
     */
    public boolean addNode(Node node, boolean overwriteExisting) {
        Node current = this.nodes.get(node.getName());
        if(current != null) {
            if(!overwriteExisting) {
                return false;
            }
            
            while(current.getNeighborCount() > 0) {
                this.removeConnection(current.getNeighbor(0));
            }
        }
        
        nodes.put(node.getName(), node);
        return true;
    }

    
    /**
     * @param label The label of the Node to remove
     * @return Node The removed Node object
     */
    public Node removeNode(String label) {
        Node v = nodes.remove(label);
        while(v.getNeighborCount() > 0) {
            this.removeConnection(v.getNeighbor((0)));
        }
        return v;
    }

    
    /**
     * @return Set<String> The unique labels of the Graph's Node objects
     */
    public Set<String> nodeKeys() {
        return this.nodes.keySet();
    }
    
    
    /**
     * @return Set<Connection> The Connections of this graph
     */
    public Set<Connection> getConnections() {
        return new HashSet<Connection>(this.edges.values());
    }

}
