package object01;

public class Employee {
    public String employeeName;
    public String divisionName;
    public int vitality;
    
    public Employee() {
    }
    
    //コンストラクタの引数として代入したもの（employeeName)とか、をフィールドのemployeeNameに代入している。
    //で、メソッドが違えば、同じ名前の変数があっても問題ないから、
    //フィールド変数とコンストラクタメソッドに引数に呈されている変数の”employeeName”は別物。（だからコンストラクタの引数の変数をnameに変えてるけど問題なし）
    //それで、一応どっちのことかわからなくなるから、フィールドの変数には慣習的にthis.をつける
    public Employee(String employeeName/*仮にnameにしてもok,*/,String divisionName, int vitality) {
        this.employeeName = employeeName;
        this.divisionName = divisionName;
        this.vitality = vitality;
    }
    //二個目の引数ありコンストラクタ。オーバーロードがあるっていうことを示すために、引数にemployeeNmaeのも用意しただけ。
    public Employee(String employeeName) {
    this.employeeName = employeeName;
    }
    
    public void intro() {
        vitality = vitality - 10;
        System.out.println("私は" + employeeName);
        System.out.println("私の部署は" +divisionName);
    }
    
    public void show(){
        vitality = vitality-10;
        System.out.println("残りの体力は"+vitality+"です。");
    }

}
