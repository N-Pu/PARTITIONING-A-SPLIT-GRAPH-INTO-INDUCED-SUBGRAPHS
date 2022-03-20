import org.graphstream.algorithm.DStar;
import org.graphstream.algorithm.DynamicAlgorithm;
import org.graphstream.algorithm.generator.Generator;
import org.graphstream.algorithm.generator.GridGenerator;
import org.graphstream.algorithm.generator.RandomGenerator;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.AbstractGraph;
import org.graphstream.graph.implementations.MultiNode;


public class GeneratorClass {


    public Integer generate(Graph graph) {

        Generator gen = new RandomGenerator(3);
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
