package homewwork3;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/21
 */
public class Factory {
    public static Person CreateHumans(String sex){
        if(sex.equals("男")){
            return new Man();
        }else {
            return new Woman();
        }
    }
}
