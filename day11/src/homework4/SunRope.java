package homework4;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/22
 */
public class SunRope implements Factory {

    @Override
    public Person CreateHumans() {
        return new Man();
    }
}
