package capsuleRpg;

public class Hero extends Character {
    private int weapon;

    public int getWeapon() {
        return weapon;
    }

    public void setWeapon(int weapon) {
        this.weapon = weapon;
    }
    
    public Hero(String name, int hp,int offense, int defense,int weapon) {
        super(name,hp,offense,defense);
        this.weapon = weapon;
    }

}
