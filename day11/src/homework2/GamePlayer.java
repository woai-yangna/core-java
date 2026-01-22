package homework2;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/21
 */
public class GamePlayer {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void PlayGames(Computer computer){
        GraphicsCard graphicsCard=computer.getGraphicsCard();
        if(graphicsCard.getCategory().equals("独立显卡") && graphicsCard.getVram()>=4){
            System.out.println(name+"玩游戏");
        }else{
            System.out.println(name+"玩不了游戏");
        }
    }
}
