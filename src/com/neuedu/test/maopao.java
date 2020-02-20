package com.neuedu.test;

/**
 * Created by MacheNike on 2020/2/20.
 */
public class maopao {
    public static void main(String[] args) {
        int [] a={3,2,1};
        for(int i=0;i<a.length-1;i++){
            for (int j=0;j<a.length-i-1;j++){
                if(a[i]>a[i+1]){
                    int temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
        }
        for(int b: a){
            System.out.println(b);
        }
    }



}
