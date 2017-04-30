/**
 * Created by Mariano on 29/04/2017.
 */
public class Selection {

    public static void sort(Comparable[]a){
        int N = a.length;
        for (int i = 0; i < N ; i++){
            int min = i;
            for(int j = i+1; j < N ; j++){
                if(Tools.less(a[j], a[min])){
                    min = j;
                }
            }
            Tools.exchange(a, i, min);
        }

    }

}
