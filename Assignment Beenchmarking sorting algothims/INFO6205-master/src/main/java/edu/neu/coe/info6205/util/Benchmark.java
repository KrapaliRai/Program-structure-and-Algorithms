package edu.neu.coe.info6205.util;

import edu.neu.coe.info6205.sort.simple.InsertionSort;
import edu.neu.coe.info6205.sort.simple.SelectionSort;
import edu.neu.coe.info6205.sort.simple.Sort;
import java.util.Arrays;
import java.util.Random; 

import java.util.function.Function;

public class Benchmark<T> {

   public Benchmark(Function<T, Void> f) {
       this.f = f;
   }

   public double run(T t, int n) {
         // TODO
         int totalRunTime=0;
         double meanRunTime=0.0;
         for(int m=0;m<n;m++){
       long initialTime = System.nanoTime();
       f.apply(t);
       
       long timeTaken = System.nanoTime()-initialTime;
       totalRunTime+=timeTaken;
       meanRunTime=totalRunTime/n;
   }
         return meanRunTime;
   }
   

   private final Function<T, Void> f;// return type of function f is void.

   public static void main(String[] args) {
       int m = 100; // This is the number of repetitions: sufficient to give a good mean value of timing
       int n = 1000;
       
       
       Integer[] array = new Integer[n];
       Random r= new Random();
       
       
//       // Random array
        for(int i=0;i<n;i++){    // TODO populate the array with real random data
        int randomNumber = r.nextInt(100);
        array[i]=randomNumber;
        }
//       
//       //sorted array
//       for(int i=0;i<n;i++){
//           array[i]=i;
//       }

//       // reverse sorted array
//       int count=0;
//       for(int i=n;i>0;i--){
//           array[count] =i;
//           count++;
//       }
       
       //checking array
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
      

//partially sorted array
       
       
       // TODO You need to apply doubling to n
       benchmarkSort(array, n, "SelectionSort", new SelectionSort<>(), m);
       benchmarkSort(array, n, "InsertionSort", new InsertionSort<>(), m);
   }

   private static void benchmarkSort(Integer[] xs, Integer n, String name, Sort<Integer> sorter, int m) {
       
       Function<Integer, Void> sortFunction = (x) -> {
           Integer[] temp = Arrays.copyOf(xs,xs.length);
           sorter.sort(temp, 0, x);
           return null;
       };
       
       
       Benchmark<Integer> bm = new Benchmark<>(sortFunction);
       double x = bm.run(n, m);
       //System.out.println(name + ": " + x + " nanoseconds for n=" + n);
       double milis = x/Math.pow(10, 6);// calculating time in miliseconds.
              System.out.println(name + ": " + milis + " milliseconds for n=" + n);
              //System.out.println();

       
   }
}