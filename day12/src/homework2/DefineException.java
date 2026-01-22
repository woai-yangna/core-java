package homework2;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/22
 */
public class DefineException extends Exception{
    public DefineException() {
        super("身份证信息异常");
    }

    public DefineException(String message) {
        super(message);
    }
}
