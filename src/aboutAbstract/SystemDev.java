package aboutAbstract;

//下記でインターフェイスをインポート
//インターフェイスを実装したクラスを”実装クラス”という
import aboutAbstract.Programmable;
//extendsが抽象クラス呼び出し　　　implementsがインターフェイス呼び出し
//順番はextends implementsの順番
//二つの違いとしてextendsは一個まで（多重継承不可）→　具象クラスは抽象クラスである（人間は哺乳類である）
//            implementsは何個でもいける（多重継承可能）→具象クラスはインターフェイスを持っている（人間は言語を持っている、知恵を持っている、プログラミン能力を持っている、、、、、、）

public class SystemDev extends Division implements Programmable {
    /*
     * この抽象メソッドは、具象クラスを作った時点で引き継がれる
     * これに実際に値を入れて定義しているのがコメントの下
     *
     *@Override
     * public void greeting() {
     * System.out.println("");
     *}
     *
     */
    @Override//こっちは抽象クラスの
    public void greeting() {
        System.out.println("システム開発部の皆さんおはようございます");
    }

    @Override//こっちはインターフェイスの
    public void programming() {
        System.out.println("システム開発部の皆さんはプログラミング可能です");
    }

}
