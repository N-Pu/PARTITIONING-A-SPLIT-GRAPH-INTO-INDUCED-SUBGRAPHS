import org.graphstream.algorithm.DStar;
import org.graphstream.algorithm.DynamicAlgorithm;
import org.graphstream.algorithm.generator.*;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.AbstractGraph;
import org.graphstream.graph.implementations.MultiNode;
import org.graphstream.stream.AttributeSink;



public class GeneratorClass {

    //  Generator g = new GridGenerator(true, false); -> square graph that I need

    public Integer generate(Graph graph) {
        Generator gen = new RandomGenerator(3, true, false);

//        Node node = new MultiNode((AbstractGraph) graph, "Random");
        gen.addSink(graph);
        gen.begin();

        for (int i = 0; i < 6; i++) {
            gen.nextEvents();
        }
        // For each node -> place a number
        // And for each node -> get degree
        // Also returns -> number of nodes
        int k = 0;
        for (Node node : graph) {
            node.setAttribute("ui.label", node.getId());
            System.out.println("Node " + "[" + k + "]" + " degree is -> " + node.getDegree());
            k++;
            System.out.println(node.getAttributeKeyIterator());
            System.out.println(node.getEachEdge());
            System.out.println(node.getEdgeIterator());
            System.out.println(node.getEachEnteringEdge());
        }


        gen.end();
        graph.display();


//        Square generation
//
//        Generator gen = new GridGenerator();
//        gen.addSink(graph);
//        gen.begin();
//
//        for(int i=0; i<10; i++) {
//            gen.nextEvents();
//        }
//
//        gen.end();
//
//// Nodes already have a position.
//        graph.display(false);
        return k;
    }


}
