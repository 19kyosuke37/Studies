package object01;

public class ObjectSample {

    public static void main(String[] args) {

        Employee emp01 = new Employee();

        emp01.employeeName = "タカハシ";
        emp01.divisionName = "マネージャー";
        emp01.vitality = 100;

        emp01.intro();
        emp01.show();

        Employee emp02 = new Employee();

        emp02.employeeName = "ナカジマ";
        emp02.divisionName = "情シス";
        emp02.vitality = 80;

        emp02.intro();
        emp02.show();
        
        Employee emp03 = new Employee("モリイズミ","看護師",50);
        emp03.intro();
        emp03.show();

        Employee emp04 = new Employee("ポリ");
        emp04.intro();
        
    }

}
