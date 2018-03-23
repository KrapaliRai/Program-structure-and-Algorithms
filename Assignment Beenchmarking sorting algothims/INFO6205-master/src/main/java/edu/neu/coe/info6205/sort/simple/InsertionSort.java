package edu.neu.coe.info6205.sort.simple;

import static edu.neu.coe.info6205.sort.simple.Helper.*;

public class InsertionSort<X extends Comparable<X>> implements Sort<X> {
    @Override
    public void sort(X[] xs, int from, int to) {
        // TODO implement insertionSort
        for (int i = 0; i < xs.length; i++) {
            for (int j = i; j >0; j--) {
                if(less(xs[j],xs[j-1]))
                swap(xs, j, j-1);
                
            }
            
        }
    }
    
//    public static void sort(Comparable[] a)
// { // Sort a[] into increasing order.
// int N = a.length;
// for (int i = 1; i < N; i++)
// { // Insert a[i] among a[i-1], a[i-2], a[i-3]... ..
// for (int j = i; j > 0 && less(a[j], a[j-1]); j--)
// exch(a, j, j-1);
// }
// }
}
