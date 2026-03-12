package com.coder.homework.homework1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/3/12
 */
public class No1 {
    public static void main(String[] args) {
        List<Player> list=new ArrayList<>();
        list.add(new Player("李白",new ArrayList<>()));
        list.add(new Player("杜甫",new ArrayList<>()));
        list.add(new Player("白居易",new ArrayList<>()));
        list.add(new Player("底牌",new ArrayList<>()));
        CardDealingMachine.sendCard(list);
        for (Player player : list) {
            System.out.println("玩家"+player.getName());
            List<Poker> pokers=player.getPokers();
            System.out.println(pokers);
        }
    }
}
