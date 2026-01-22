package homework2;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/21
 */
public class No2 {
    public static void main(String[] args) {
        GraphicsCard graphicsCard=new GraphicsCard("独立显卡",16);
        Computer computer=new Computer("惠普",graphicsCard);
        GamePlayer gamePlayer=new GamePlayer();
        gamePlayer.setName("苏永康");
        gamePlayer.PlayGames(computer);
    }
}
