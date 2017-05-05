public class Solution {
    public ArrayList<DirectedGraphNode> topSort(ArrayList<DirectedGraphNode> graph) {
        ArrayList<DirectedGraphNode> sorted = new ArrayList<>();
        HashMap<DirectedGraphNode> nodes = new HashMap<>();

        // Map for quick access
        for (DirectedGraphNode node : graph) {
            nodes.put(node.label, node);
        }

        // Find
        for (int i = 0; i < graph.size(); ++i) {
            for (DirectedGraphNode node : graph) {
                if (node.neighbors.isEmpty()) {
                    
                }
            }
        }
    }
}
