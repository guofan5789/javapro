package com.neuedu.test;

/**
 * Created by MacheNike on 2020/2/11.
 */
public class array1 {
    /*
    public static void main(String[] args) {
        int [][] array=new int[][]{{1,2,3},{4,5,6},{7,8,9,10},{11,12,13,14,15,16}};
        System.out.println(array[0][0]);
    }
    */
    public static void main(String[] args) {
        int i=3;
        switch (i){
            case 1:
                System.out.println("周一");
                break;
            case 2:
                System.out.println("周二");
                break;
            case 3:
                System.out.println("周三");
                break;
            case 4:
                System.out.println("周四");
                break;
            case 5:
                System.out.println("周五");
                break;
            case 6:
                System.out.println("周六");
                break;
            case 0:
                System.out.println("周日");
                break;
            default:
                System.out.println("错误");
                break;
        }
    }
}
