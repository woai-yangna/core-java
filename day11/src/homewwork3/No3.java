package homewwork3;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/21
 */
public class No3 {
    public static void main(String[] args) {
        Person person= Factory.CreateHumans("女");
        person.eating();
        person.sleeping();
        person.speaking();
    }
}
