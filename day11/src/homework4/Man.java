package homework4;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/21
 */
public class Man implements Person {

    @Override
    public void eating() {
        System.out.println("男的在吃饭");
    }

    @Override
    public void sleeping() {
        System.out.println("男的在睡觉");
    }

    @Override
    public void speaking() {
        System.out.println("男的在说话");
    }
}
