package homework2;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/21
 */
public class Computer {
    private String type;
    private GraphicsCard graphicsCard;

    public Computer() {
    }

    public Computer(String type, GraphicsCard graphicsCard) {
        this.type = type;
        this.graphicsCard = graphicsCard;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }
}
