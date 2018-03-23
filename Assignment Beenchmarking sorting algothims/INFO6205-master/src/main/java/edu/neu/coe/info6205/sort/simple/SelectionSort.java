package edu.neu.coe.info6205.sort.simple;

import static edu.neu.coe.info6205.sort.simple.Helper.less;
import static edu.neu.coe.info6205.sort.simple.Helper.swap;

public class SelectionSort<X extends Comparable<X>> implements Sort<X> {

    @Override
    public void sort(X[] xs, int from , int to) {
        
        for (int i = 0; i < xs.length; i++) {
            int min=i;
            for (int j = i+1; j < xs.length; j++) {
                if(less(xs[j], xs[min])){
                     swap(xs, j, min);
                }
               
            }
            
        }
        // TODO implement selection sort
    }
    
//    public static void sort(Comparable[] a)
// { // Sort a[] into increasing order.
// int N = a.length; // array length
// for (int i = 0; i < N; i++)
// { // Exchange a[i] with smallest entry in a[i+1...N).
// int min = i; // index of minimal entr.
// for (int j = i+1; j < N; j++)
// if (less(a[j], a[min])) min = j;
// exch(a, i, min);
// }
// }
}
