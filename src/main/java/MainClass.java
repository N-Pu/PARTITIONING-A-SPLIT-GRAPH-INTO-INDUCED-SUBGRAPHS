import org.graphstream.algorithm.ConnectedComponents;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;


public class MainClass {
    public static void main(String[] args) {


//      Objects that I need to start my program correctly.
        System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
        Graph graph = new SingleGraph("PARTITIONING A SPLIT GRAPH INTO INDUCED SUBGRAPHS");
        Styles style = new Styles();
        graph.setAttribute("ui.stylesheet", style.getStyleSheet());
        GeneratorClass gc = new GeneratorClass();
        ConnectedComponents cc = new ConnectedComponents();
//      The end of them.

//      Methods to generate graph.
        gc.generate(graph);

        cc.init(graph);
        System.out.println("The list of components that we have  -> " + cc.getGiantComponent()); // prints all my components


//      The end of them.
    }
}
