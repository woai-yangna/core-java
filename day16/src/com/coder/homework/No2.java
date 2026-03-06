package com.coder.homework;

import java.time.LocalDate;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/2/2
 */
public class No2 {
    public static void main(String[] args) {
        int value=1788;
        buyer p1=new buyer("李白", LocalDate.of(2026,9,5));
        buyer p2=new buyer("李信", LocalDate.of(2026,9,10));
        buyer p3=new buyer("白起", LocalDate.of(2026,9,28));
        buyer p4=new buyer("李元芳", LocalDate.of(2026,10,10));
        buyer[] buyers=new buyer[4];
        buyers[0]=p1;
        buyers[1]=p2;
        buyers[2]=p3;
        buyers[3]=p4;
        buySkin1(buyers);
    }
    public static void buySkin1(buyer[] buyers){
        int value=1788;
        LocalDate date=LocalDate.of(2026,9,2);
        WangZhe wangZhe=new WangZhe();
        for (buyer buyer : buyers) {
            int i = wangZhe.buySkin(date, buyer.getDate1());
            if(i==-1){
                System.out.println("皮肤已下线无法购买");
            }else {
                System.out.println(buyer.getName()+"花费"+i*0.1*value+"点卷成功购买皮肤");
            }

        }
    }
}
