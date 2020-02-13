package com.neuedu.test;

/**
 * Created by MacheNike on 2020/2/13.
 */
public class Test2 {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        for(int i=1; i<=n; i++){
            System.out.print(fibonacci(i)+" ");
        }
    }
    public static int fibonacci(int num){
        if(num<=2){
            return 1;
        }
        else{
            return fibonacci(num-1)+fibonacci(num-2);
        }
    }
}
