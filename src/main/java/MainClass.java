import org.graphstream.algorithm.ConnectedComponents;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.graph.Element;

import java.util.*;


public class MainClass {
    public static void main(String[] args) {


//      Objects that I need to start my program correctly.
        System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
        Graph graph = new SingleGraph("PARTITIONING INTO SUBGRAPHS");
        Styles style = new Styles();
        graph.setAttribute("ui.stylesheet", style.getStyleSheet());
        GeneratorClass gc = new GeneratorClass();
        ConnectedComponents cc = new ConnectedComponents();
        MyFullGenerator mfg = new MyFullGenerator();


//      The end of them.

//      Methods to generate graph.

        cc.init(graph);
        System.out.println("\nThe list of components that we have  -> " + gc.generate(graph)); // prints all my components

        mfg.addNode();
        mfg.addNode();
        mfg.addNode();


//      The end of them.
    }
}
