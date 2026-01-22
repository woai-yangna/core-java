package homework1;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/21
 */
public class No1 {
    public static void main(String[] args) {
        LibraryCard card=new LibraryCard("红色","A");
        Student student=new Student("杨娜",card);
        Librarian librarian=new Librarian();
        librarian.setName("苏永康");
        librarian.check(student);

    }
}
