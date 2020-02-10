package com.neuedu.test;

/**
 * Created by MacheNike on 2020/2/4.
 */
public class square {
    int c=1;
    public int square(int m,int n){
        int [] array=new int [n];
        for(int i=0;i<array.length;i++){
             c*=m;
        }
        return c;
    }
    public static void main(String[] args){
        square sq1=new square();
        int b=sq1.square(5,3);
        System.out.println(b);

    }
}
