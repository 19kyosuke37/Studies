package nyuSyutsuRyoku;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NyuSyutsuRyoku {

    public static void main(String[] args) {
        try {
            
            //標準入力（キーボード）から読み込む操作をするオブジェクトを生成
            BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
            
            //キーボード入力を促すメッセージ
            System.out.println("何か文字を入力して下さい=>");
            
            //1行分取得
            String str = key.readLine();
            
            //入力された文字列を表示
            System.out.println("入力された文字列は「"+ str + "」です。");
            
        }catch(IOException e){
            e.printStackTrace();
        }
            
        
    }
   
}
