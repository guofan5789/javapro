package com.neuedu.test;

/**
 * Created by MacheNike on 2020/2/3.
 */
public class Person {
    public Person(){

    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int age;
    public int no;
    public int add(int a,int b){
        int c=a+b;
        return c;
    }
    public static int ad(int a,int b){
        int c=a+b;
        return c;
    }
}
