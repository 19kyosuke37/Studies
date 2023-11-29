
public class KakuchoFor {

    public static void main(String[] args) {
        int[] scores = {47,55,88,100,74};
        int sum =0;
        double average = 0.0;
        
     //↓for(データ型　変数名　：　利用する配列やコレクション名）   
        for(int i : scores) {
            sum = sum +i;
        }
        /*上とやっていることは同じ、for分の中がすっきりしている。
         * for(int i=0; i<scores.length;i++) {
            sum = sum+scores[i];
        }*/
        
        average = (double)sum/scores.length;
        
        System.out.println("合計点は"+sum+"点、平均点は"+average+"点です。");
    }

}
