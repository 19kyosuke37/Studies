package Lesson4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {

    public static void main(String[] args) {

        //現在日時の取得と表示
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        //日付のフォーマッター これを指定することで上や、下のコンソールより見やすい結果が出力される
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/mm/dd");
        String str =dateTime.format(formatter);
        System.out.println(str);

        //現在日時から一週間後を表示
        LocalDateTime nextWeek = dateTime.plusWeeks(1);//←上で取得した現在日時の変数dateTimeに".plusWeeks"メソッドで
        System.out.println(nextWeek); //、一週間をプラスしている。

    }

}
