package classToClass;
public class Identity {
    public static void main(String[] args) {

        Company a = new Company();
        a.name = "a";

        Human kyo = new Human();
        kyo.company = a;
        kyo.name = "kyo";
        kyo.age = 26;

        kyo.introduce();
    }

}
