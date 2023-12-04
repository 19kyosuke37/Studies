package capsuleRpg;

public class Enemy extends Character {
    
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public Enemy() {
        
    }
    public Enemy(String name,int hp,int offense,int defense,String type) {
        super(name,hp,offense,defense);
        this.type=type;
        
    }
}
