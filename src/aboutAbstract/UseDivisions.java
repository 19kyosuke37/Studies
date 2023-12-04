package aboutAbstract;

import aboutAbstract.General;
import aboutAbstract.SystemDev;

public class UseDivisions {

    public static void main(String[] args) {

        General emp01 = new General();
        SystemDev emp02 = new SystemDev();

        emp01.greeting();
        emp02.greeting();
        emp02.programming();
    }

}
//抽象、具象クラスを作っただけだとなぜか×が出ていたけど、
//実際にこのクラスでコンソールまでしたらうまくいった
//importしなくても実際の結果が出たのはなぜ？
