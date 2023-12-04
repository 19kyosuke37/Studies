package ObjectKeisyo;

public class UseSales {

    public static void main(String[] args) {
        
        Sales sales01 = new Sales(10,"高橋",200);
        
        //サブクラスのフィールドに値をセット
        sales01.setAppointment("intelligent　wave");
        
        //スーパークラスのメソッド
        sales01.intro();
        
        sales01.greeting();
        
        //サブクラスの独自のメソッド
        sales01.report();
        
        //オーバーライドしたgreeting
        sales01.greeting();
        
        sales01.show();

    }

}
