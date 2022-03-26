import org.graphstream.algorithm.generator.*;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.ui.graphicGraph.GraphicEdge;

import java.util.*;


public class GeneratorClass {


    //  Generator g = new GridGenerator(true, false); -> square graph that I need

    public Integer generate(Graph graph) {
        Generator gen = new RandomGenerator(3, true, false);
//     Edge edge = new GraphicEdge("PARTITIONING INTO SUBGRAPHS", Map<Integer, Integer>, true, Map<String, String>);
        Edge edge = new Edge() {
            @Override
            public boolean isDirected() {
                return false;
            }

            @Override
            public boolean isLoop() {
                return false;
            }

            @Override
            public <T extends Node> T getNode0() {
                return null;
            }

            @Override
            public <T extends Node> T getNode1() {
                return null;
            }

            @Override
            public <T extends Node> T getSourceNode() {
                return null;
            }

            @Override
            public <T extends Node> T getTargetNode() {
                return null;
            }

            @Override
            public <T extends Node> T getOpposite(Node node) {
                return null;
            }

            @Override
            public String getId() {
                return null;
            }

            @Override
            public int getIndex() {
                return 0;
            }

            @Override
            public <T> T getAttribute(String s) {
                return null;
            }

            @Override
            public <T> T getFirstAttributeOf(String... strings) {
                return null;
            }

            @Override
            public <T> T getAttribute(String s, Class<T> aClass) {
                return null;
            }

            @Override
            public <T> T getFirstAttributeOf(Class<T> aClass, String... strings) {
                return null;
            }

            @Override
            public CharSequence getLabel(String s) {
                return null;
            }

            @Override
            public double getNumber(String s) {
                return 0;
            }

            @Override
            public ArrayList<? extends Number> getVector(String s) {
                return null;
            }

            @Override
            public Object[] getArray(String s) {
                return new Object[0];
            }

            @Override
            public HashMap<?, ?> getHash(String s) {
                return null;
            }

            @Override
            public boolean hasAttribute(String s) {
                return false;
            }

            @Override
            public boolean hasAttribute(String s, Class<?> aClass) {
                return false;
            }

            @Override
            public boolean hasLabel(String s) {
                return false;
            }

            @Override
            public boolean hasNumber(String s) {
                return false;
            }

            @Override
            public boolean hasVector(String s) {
                return false;
            }

            @Override
            public boolean hasArray(String s) {
                return false;
            }

            @Override
            public boolean hasHash(String s) {
                return false;
            }

            @Override
            public Iterator<String> getAttributeKeyIterator() {
                return null;
            }

            @Override
            public Iterable<String> getEachAttributeKey() {
                return null;
            }

            @Override
            public Collection<String> getAttributeKeySet() {
                return null;
            }

            @Override
            public void clearAttributes() {

            }

            @Override
            public void addAttribute(String s, Object... objects) {

            }

            @Override
            public void changeAttribute(String s, Object... objects) {

            }

            @Override
            public void setAttribute(String s, Object... objects) {

            }

            @Override
            public void addAttributes(Map<String, Object> map) {

            }

            @Override
            public void removeAttribute(String s) {

            }

            @Override
            public int getAttributeCount() {
                return 0;
            }
        };


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
            System.out.println(node.getId());
            System.out.println(node.getEachEdge());
            System.out.println(edge.getOpposite(node));
//            System.out.println(edge.));


        }



        graph.getEdgeSet().forEach(e -> System.out.println(e.getId()));





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
