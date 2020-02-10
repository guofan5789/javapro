package com.neuedu.test;

/**
 * Created by MacheNike on 2020/2/3.
 */
public class MyTest {
    public static void main(String[] args){
        /*long a=5;
        long b=6;
        long  c=a-b;
        System.out.println(c);
        Person p1= new Person();
        p1.age=10;
        p1.no=1;
        System.out.println(p1.age);*/
        /*
        int year=1990;
        if(year%4==0&&year!=100){
            System.out.println("为闰年");
        }else if(year%400==0){
            System.out.println("为闰年");
        }else{
            System.out.println("不是闰年");
        }
        */
        /*
        int sum=0;
        for(int i=1;i<=100;i++){
            sum=sum+i;
        }
        System.out.println(sum);
        */
        /*



        int sum=0;

        for(int i=2;i<=100;i++){
            boolean flag=true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                sum=sum +i;
            }
        }
        System.out.println(sum);
        */
        /*
        Person p2 =new Person();
        int c =p2.add(3,4);
        System.out.println(c);
        int d=Person.ad(5,-5);
        System.out.println(d);
        */

        /*int [] array=new int [5];
        array[0]=1;
        array[1]=4;
        array[2]=6;
        array[3]=8;
        array[4]=10;
        */
        /*
        int [] a={1,4,6,8,10,33};

        for(int i=0;i<=a.length;i++){
            System.out.println(a[i]);
        }

        for(int b: a){
            System.out.println(b);
        }
        */
        /*
        int [] array={1,2,3,4};
        for(int i=1;i<=array.length; i++){
            for(int j=1;j<=array.length;j++){
                for(int k=1;k<=array.length;k++){
                    if(i!=j&&i!=k&&j!=k){
                        System.out.println(100*i+10*j+k);
                    }
                }
            }
        }
        */

        /*

        int [] array=new int [100];
        int sum=0;
        for(int i=1;i<=array.length;i++){
            if(i%2==0){
                sum +=i;
            }
        }
        System.out.println(sum);
        */

        /*

        int sum=0;
        for(int i=100;i<1000;i++){
            int a=i/100;
            int b=(i%100)/10;
            int c=i%10;
            if(a*a*a+b*b*b+c*c*c==i){
                System.out.println(i);
            }
        }

        */
        int x=600;
        int y=300;
        int max=1;
        int min=max(x,y);
        for(int i=1;i<=x&&i<=y;i++){
            if(x%i==0&&y%i==0){
                max=i;
            }
        }
        for(int i=min;i<=x*y;i++){
            if(i%x==0&&i%y==0){
                min=i;
                break;
            }
        }
        System.out.println(max);
        System.out.println(min);






    }
    public static int max(int a,int b){
        return (a>b)?a:b;
    }
}
