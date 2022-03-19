import org.graphstream.algorithm.generator.Generator;
import org.graphstream.algorithm.generator.GridGenerator;
import org.graphstream.algorithm.generator.RandomGenerator;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.AbstractGraph;
import org.graphstream.graph.implementations.MultiNode;


public class GeneratorClass {
//    Generator generator = new Generator() {
//        @Override
//        public void begin() {
//
//        }
//
//        @Override
//        public boolean nextEvents() {
//            return false;
//        }
//
//        @Override
//        public void end() {
//
//        }
//
//        @Override
//        public void addSink(Sink sink) {
//
//        }
//
//        @Override
//        public void removeSink(Sink sink) {
//
//        }
//
//        @Override
//        public void addAttributeSink(AttributeSink attributeSink) {
//
//        }
//
//        @Override
//        public void removeAttributeSink(AttributeSink attributeSink) {
//
//        }
//
//        @Override
//        public void addElementSink(ElementSink elementSink) {
//
//        }
//
//        @Override
//        public void removeElementSink(ElementSink elementSink) {
//
//        }
//
//        @Override
//        public void clearElementSinks() {
//
//        }
//
//        @Override
//        public void clearAttributeSinks() {
//
//        }
//
//        @Override
//        public void clearSinks() {
//
//        }
//    };

    public void generate(Graph graph) {
        Generator gen = new RandomGenerator(3);
//        Node node = new MultiNode((AbstractGraph) graph, "Random");
        gen.addSink(graph);
        gen.begin();

        for (int i = 0; i < 20; i++) {
            gen.nextEvents();
        }
        // For each node -> place a number
        for (Node node : graph) {
            node.setAttribute("ui.label", node.getId());
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

    }
}
