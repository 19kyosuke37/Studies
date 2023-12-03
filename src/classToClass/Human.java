package classToClass;
public class Human {
    
    public  String name;
    public  int age;
    public  Company company;
    
    public void introduce() {
        System.out.println("私の名前は"+name+"です。"+age+"歳です。"+company.name+ "に勤めています");
    }
}