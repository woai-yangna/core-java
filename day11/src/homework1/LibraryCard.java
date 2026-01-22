package homework1;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/21
 */
public class LibraryCard {
    private String color;
    private String category;

    public LibraryCard() {
    }

    public LibraryCard(String color, String category) {
        this.color = color;
        this.category = category;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}