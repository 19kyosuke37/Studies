package capsuleRpg;

public class Character {

    private String name;
    private int hp;
    private int offense;
    private int difense;
    
    public Character() {
    }

    public Character(String name, int hp, int offense, int difense) {
        this.name = name;
        this.hp = hp;
        this.offense = offense;
        this.difense = difense;
    }
    
    public static void seiteki() {
        System.out.println("Characterクラスはキャラクターのこたいちについて扱う");
    }

//↓これはCharacterクラスのインスタンスをひきすうにするってだけ。opponentってのはこのメソッドで定義した変数ってだけ。
    public void attack(Character opponent) {
//↓this.offenseはこのメソッドを実際に使っているインスタンスのoffense
//↓opponent.defenseはこのメソッドの引数で呼び出されたCharacterクラスのインスタンス（opponent）のフィールド変数のdifenseをよびだしている。
        int damage = this.offense - opponent.difense;
        if (damage >0){
            opponent.hp = opponent.hp - damage;
            System.out.println(this.name + "は" + opponent.name + "に" + damage + "のダメージを与えた");
        }else{
            System.out.println(this.name + "は" + opponent.name + "にダメージを”あたえられない");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getOffense() {
        return offense;
    }

    public void setOffense(int offense) {
        this.offense = offense;
    }

    public int getDifense() {
        return difense;
    }

    public void setDifense(int difense) {
        this.difense = difense;
    }
    
}
