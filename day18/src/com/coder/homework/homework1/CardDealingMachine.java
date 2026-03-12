package com.coder.homework.homework1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/3/12
 */
public class CardDealingMachine {
    private static List<Poker> list;
    static {
        list =new ArrayList<>(54);
        list.add(new Poker(1,"大王"));
        list.add(new Poker(1,"小王"));
        String[] colors={"黑桃","红桃","梅花","方块"};
        String[] points={"A","K","Q","J","10","9","8","7","6","5","4","3","2"};
        int index=3;
        for (String color : colors) {
            for (String point : points) {
                list.add(new Poker(index++,color+point));
            }
        }
    }
    public static List<Poker> getList(){
        return list;
    }
    public static void sendCard(List<Player> players){
        for (int i = 0; i < list.size()-3; i++) {
            if(i%3==0){
                players.get(0).getPokers().add(list.get(i));
            }
            if(i%3==1){
                players.get(1).getPokers().add(list.get(i));
            }
            if(i%3==2){
                players.get(2).getPokers().add(list.get(i));
            }
        }
        players.get(3).getPokers().addAll(list.subList(list.size()-3,list.size()));
        for (Player player : players) {
            Collections.sort(player.getPokers(), new Comparator<Poker>() {
                @Override
                public int compare(Poker o1, Poker o2) {
                    return Integer.compare(o1.getIndex(),o2.getIndex());
                }
            });
        }
    }

    public static void shuffle(){
        Collections.shuffle(list);
    }
}
