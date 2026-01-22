package homework4;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/22
 */
public class No4 {
    public static void main(String[] args) {
        Factory factory=new ShadowRope();
        Person person=factory.CreateHumans();
        person.eating();
        person.sleeping();
        person.speaking();
    }
}
