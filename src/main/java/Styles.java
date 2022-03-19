public class Styles {

//  My styles for graph nodes and edges.
    public String getStyleSheet() {
        return styleSheet;
    }

    private static final String styleSheet =
            "edge {" +
                    "	size: 2px;" +
                    "	fill-color: red, yellow, green, #444;" +
                    "	fill-mode: dyn-plain;" +
                    "}" +
                    "node {" +
                    "	size: 20px;" +
                    "	fill-color: #00a86b;" +
                    "}";
}
