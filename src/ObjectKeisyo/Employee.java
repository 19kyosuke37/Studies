package ObjectKeisyo;

public class Employee {
    private int employeeId;
    private String employeeName;
    private String divisionName;
    private int vitality;
    
    public Employee() {
    }
    
    //コンストラクタの引数として代入したもの（employeeName)とか、をフィールドのemployeeNameに代入している。
    //で、メソッドが違えば、同じ名前の変数があっても問題ないから、
    //フィールド変数とコンストラクタメソッドに引数に呈されている変数の”employeeName”は別物。（だからコンストラクタの引数の変数をnameに変えてるけど問題なし）
    //それで、一応どっちのことかわからなくなるから、フィールドの変数には慣習的にthis.をつける
    public Employee(int employeeId,String employeeName/*仮にnameにしてもok,*/,String divisionName, int vitality) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.divisionName = divisionName;
        this.vitality = vitality;
    }
    
    //二個目の引数ありコンストラクタ。オーバーロードがあるっていうことを示すために、引数にemployeeNmaeのも用意しただけ。
    public Employee(String employeeName) {
    this.employeeName = employeeName;
    }
    //この下からgetter.setter
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }
    //この下からメソッド
    public void intro() {
        vitality = vitality - 10;
        System.out.println("私は" + employeeName);
        System.out.println("私の部署は" +divisionName);
    }
    //メソッドもオーバーロードするから引数あり、なしのgreetingがある
    public void greeting() {
        vitality = vitality - 10;
        System.out.println("おはようございます");
    }
    
    public void greeting(String divisionName) {
        vitality = vitality - 10;
        System.out.println(divisionName+"の皆さん、おはようございます");
    }
    
    public void show(){
        vitality = vitality-10;
        System.out.println("残りの体力は"+vitality+"です。");
    }

}
