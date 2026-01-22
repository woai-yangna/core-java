package homework2;



/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/21
 */
public class GraphicsCard {
    private String category;
    private int vram;

    public GraphicsCard(String category, int vram) {
        this.category = category;
        this.vram = vram;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getVram() {
        return vram;
    }

    public void setVram(int vram) {
        this.vram = vram;
    }

    public GraphicsCard() {
    }
}
