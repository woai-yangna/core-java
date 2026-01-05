/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/5
 */
public class BaseType {
    public static void main(String[] args) {
        byte b1 = -128;
        short s=32767;
        int i=2134567890;
        long x=123456789l;
        //float类型记得加f或F，默认情况是double类型的
        float f=123.12345f;
        double d=3.55d;

        //重点  这里a+b并没有定义类型，默认为int类型，这里做了强制类型转换
        short a=10;
        short b=20;
        short c=(short)(a+b);
    }
}
