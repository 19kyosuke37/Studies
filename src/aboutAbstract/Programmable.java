package aboutAbstract;
//インターフェイスとは、抽象クラスのみを持てるクラスのようなもの
public interface Programmable {
    void programming();
    /*上のメソッドは　void ~();　になっているけど、必ずpublicでabstractになるため、
     * 実際には下記のように定義したことになる
     *public abstract void programming();
     */

}
