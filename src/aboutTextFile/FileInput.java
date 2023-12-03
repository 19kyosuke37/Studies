package aboutTextFile;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileInput {

    public static void main(String[] args) {
        /*try~catchは例外処理
         * コード内にある try および catch というブロックは総称して 例外処理 と言います。
         * 例外処理を入れているのは、ファイルがない( FileNotFoundException )場合やファイルへ正常に書き込めないトラブル( IOException )の場合でも,
         * プログラムが止まらないようにするためです。
           このようなトラブルが try ブロック内の処理で発生した場合、try に書かれた処理が中止され catch に書かれた処理が実行されます。
           try および FileNotFoundException と IOException に対する catch を記述しないとコンパイルエラーになります。
         */
        try {
            // ファイルを読み込みモードで開く
            InputStream is = new FileInputStream("test.txt");

            // ファイルから読み込む操作をするオブジェクトを生成する こことは特殊な書き方はだけど、おまじないだと思え
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));

            // 1行分だけ取得
            String str = reader.readLine();

            // strが空っぽでなければ中身を表示して
            // さらに次の行の内容を取得
            while(str != null) {
                System.out.println(str);
                str = reader.readLine();
            }

            // ファイルを閉じる(readerとisの使用をやめる）
            reader.close();
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }  
    }
}