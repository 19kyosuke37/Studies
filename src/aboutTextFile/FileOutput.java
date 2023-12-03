package aboutTextFile;

//実行することでプロジェクト下部にテキストファイルが生成されている
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class FileOutput {

    public static void main(String[] args) {
        try {
            //ファイルを追記モードで開く 第二引数がtrueだと追記モードで、すでにあるファイルの末尾に追加orファイルが存在しなければ新規作成
            //                             falseだと書き込みモードですでにあるファイルを上書きしてしまう
            OutputStream os = new FileOutputStream("test.txt",true);
            
            //書き込み操作を行うオブジェクトを生成する
            OutputStreamWriter writer = new OutputStreamWriter(os);
            
            //ファイルへ追記する
            writer.write("ファイルへ書き込みます。\n");
            
            //ファイルを閉じる
            writer.close();
            os.close();
            
            
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e) {
            e.printStackTrace();
        }
        
    }

}
