package homework1;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/21
 */
public class Librarian {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void check(Student student){
        LibraryCard card=student.getCard();
        if(card.getColor().equals("红色")){
            if(card.getCategory().equals("A")){
                System.out.println(student.getName()+"可以借到《java基础》");
            }else if("B".equals(card.getCategory())){
                System.out.println(student.getName()+"可以借到mysql数据库");
            }else {
                System.out.println(student.getName()+"可以借到javaa编程思想");
            }
        }else {
            System.out.println(student.getName()+"可以借到javaa编程思想");
        }
    }
}
