/**
 * Created by Mariano on 29/04/2017.
 */
public class Tools {

    public static boolean less(Comparable a, Comparable b){
        return a.compareTo(b) < 0;
    }

    public static void exchange(Comparable[]a, int i, int j){
        Comparable aux = a[i];
        a[i]=a[j];
        a[j]=aux;
    }

    public static boolean isSorted(Comparable[] a){
        for (int i = 0; i< a.length;i++){
            if(less(a[i],a[i-1])) return  false;
        }
        return true;
    }



}
