package Capsule;

public class GetterSetterSample {

    public static void main(String[] args) {
        
        EmployeeCap emp01 = new EmployeeCap();
        //emp01.employeeName = "タカ";　
        //↑　privateは自クラス（EmployeeCapクラス）でしか操作できないから、このままでは無理。だからsetter,getterをかませる。
        emp01.setEmployeeName("タカ");
        String empName = emp01.getEmployeeName();
        
        System.out.println(empName);
    }

}
