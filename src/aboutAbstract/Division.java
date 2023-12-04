package aboutAbstract;
//抽象クラスはスーパークラス側ではメソッドの詳細は記述せず、サブクラス側で実際の処理内容を記述する
//抽象クラスを直接インスタンス化することもできない。つまり具象クラスのオーバーライドが必須になる
public abstract class Division {
    // フィールドの定義
    private String employeeName; // 社員名

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    // 抽象メソッドgreetingの定義
    public abstract void greeting();
}



