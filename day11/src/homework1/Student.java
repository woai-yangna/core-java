package homework1;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/21
 */
public class Student {
    private String name;
    private LibraryCard card;

    public Student() {
    }

    public Student(String name, LibraryCard card) {
        this.name = name;
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LibraryCard getCard() {
        return card;
    }

    public void setCard(LibraryCard card) {
        this.card = card;
    }
}
