package com.neuedu.test;

/**
 * Created by MacheNike on 2020/2/3.
 */
public class dog {
    public int age;
    public char sex;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0||age>50){
            System.out.println("年龄输入错误");
        }else{
            this.age = age;
        }
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        if(sex=='男'||sex=='女') {
            this.sex = sex;
        }else{
            System.out.println("性别输入错误");
        }

    }

    public static void main(String[] args){
        dog erha= new dog();
        erha.setAge(10);
        int age=erha.getAge();
        System.out.println(age);
        erha.setSex('男');
        char sex=erha.getSex();
        System.out.println(sex);
    }


}
