public class EnumStudy {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        Gender gender0 = Gender.MALE;
        Gender gender1 = Gender.FEMALE;
        System.out.println(gender0);
        System.out.println(gender1);

        Days days0 = Days.MONDAY;
        Days days1 = Days.TUESDAY;
        Days days2 = Days.WEDNESDAY;
        Days days3 = Days.THURSGDAY;
        Days days4 = Days.FRIDAY;
        Days days5 = Days.SUTURDAY;
        Days days6 = Days.SUNDAY;
        System.out.println(days0);
        System.out.println(days1);
        System.out.println(days2);
        System.out.println(days3);
        System.out.println(days4);
        System.out.println(days5);
        System.out.println(days6);


    }
    public static enum Gender{
        MALE,//←","なところも大事。";"ではない！
        FEMALE
    }
    public static enum Days{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSGDAY,
        FRIDAY,
        SUTURDAY,
        SUNDAY

    }



}
