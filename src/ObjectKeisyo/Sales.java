package ObjectKeisyo;

public class Sales extends Employee {

    private String appointment;

    public Sales() {

    }

    public Sales(int employeeId,String employeedName,int vitality) {
        super.setEmployeeId(employeeId);
        super.setEmployeeName(employeedName);
        super.setDivisionName(employeedName);
        super.setDivisionName("営業部");
        super.setVitality(vitality);
        this.appointment = "未定";
    }

    public void report() {
        super.setVitality(super.getVitality()-10);
        System.out.println("今日は10件アポイントメントを取りました");

    }

    //オーバライド＝スーパークラスを再定義すること
    @Override //←こういったものをアノテーションという、コメントとかでは、エンジニアの統一的な注意喚起や表現のこと
    public void intro() {
        super.setVitality(getVitality()-10);
        System.out.println("私の名前は"+super.getEmployeeName());
        System.out.println("私の所属部署は"+super.getDivisionName());
        System.out.println("今日のアポイント先は"+appointment);
    }

    public void greeting() {
        super.setVitality(getVitality()-10);;
        System.out.println(super.getDivisionName() +"の皆さん、おはようございます");

    }


    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }
}
