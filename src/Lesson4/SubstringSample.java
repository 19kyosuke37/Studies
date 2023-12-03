package Lesson4;

//★必要なimportがある時は　Ctrl+Shift+O で勝手にいれてくれる、また同じショートカットで不要なimportは消してくれる

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SubstringSample {

    public static void main(String[] args) {
        // ここら辺はjava標準ライブラリだから、何か便利なものないかなって時には調べて使ってみる
        String str = "ナカジマシズカ";
        String sub = str.substring(1, 5);
        System.out.println(sub);

        String rep = str.replaceAll("ナカジマ", "タカハシ");
        System.out.println(str);
        System.out.println(rep);
        
        
        

// ★コレクションについて（List,Set,Map)
//　●リスト
        // list 配列のと違いはデータが可変長である。
        ArrayList<String> listName = new ArrayList<String>();//<>←これをジェネリクスという、これで型を指定する。参照型に限る。
        listName.add("アリゾナ");
        listName.add("デンバー");
        listName.add("オクラホマ");
        listName.add("マイアミ");
        
        //指定したデータを取得する
        String place = listName.get(0);
        System.out.println(place);
        
        //要素数を数えます
        int listCount = listName.size();
        System.out.println(listCount);
        
        //要素を削除します
        listName.remove(1);
        
        for(String state : listName) {
            System.out.println(state);
        }
//●　ハッシュマップ  キーと値が二つ一組の要素（key,value)　　putメソッドで要素格納、getメソッドで要素を取得
//★キーの重複は許されない。最初にラスもブックも"G"にしていたから、うまく表示されなかった        
        HashMap<String,String> hm = new HashMap<String,String>();//←これも認識として、HasuMapクラスのインスタンスをnewしている
        //今回だと、keyがバスケのポジション、valueが選手名               //だから、　
        hm.put("G", "Westbrook");                          //hm.put　はhmっていうインスタンスが.putというメソッドを呼び出している
        hm.put("SF", "Booker");
        hm.put("F", "Bridges");
        hm.put("C", "Ayton");
        
        String member = hm.get("G");
        System.out.println(member);
        
        int size = hm.size();
        System.out.println(size);
        
        //下のfor文を実行すると、表示される順番が自分が書いた順番をバラバラになるが、順序の指定がHashMapにはないからしかたない
        for (String key : hm.keySet()) {
            System.out.println(key +":" + hm.get(key));
            
        }
//●　ハッシュセット　重複がない値の集合
        HashSet<String> set = new HashSet<String>();
        
        set.add("アリゾナ");
        set.add("ニューヨーク");
        set.add("テキサス");
        set.add("カリフォルニア");
        set.add("ハワイ");
        
        for(String str1 :set) {
            System.out.println(str1);
        }
        
        //セットに含まれているか
        if(set.contains("フロリダ")) {
            System.out.println("フロリダにいったことがある");
        }else {
            System.out.println("フロリダにはいったことがない");
        }
        
        if(set.contains("アリゾナ")) {
            System.out.println("アリゾナに行ったことがある");
        }else {
            System.out.println("アリゾナに行ったことがない");
        }
        
        //項目削除
        set.remove("テキサス");
        
        
    }

}
