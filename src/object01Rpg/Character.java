package object01Rpg;

public class Character {

    public String name;
    public int hp;
    public int offense;
    public int difense;

    public Character() {
    }

    public Character(String name, int hp, int offense, int difense) {
        this.name = name;
        this.hp = hp;
        this.offense = offense;
        this.difense = difense;
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
}
