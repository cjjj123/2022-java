package com.example.reflection.reflection02;

import lombok.Data;

/**
 * 测试多种反射获取
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/12/16
 * Time:15:33
 */
public class TestRe {

    public static void main(String[] args) throws Exception {

        Person person = new Student();
        System.out.println("这个人是：" + person.name);

        // 第一种
        Class c1 = Student.class;
        System.out.println(c1.hashCode());

        // 第二种
        Class c2 = Class.forName("com.example.reflection.reflection02.Student");
        System.out.println(c2.hashCode());

        // 第三种
        Class c3 = person.getClass();
        System.out.println(c3.hashCode());

        // 获取父类
        Class superclass = c1.getSuperclass();
        System.out.println(superclass);
    }

}

@Data
class Person{
    public String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
}

class Student extends Person{
    public Student() {
        this.name = "学生";
    }
}

class Teacher extends Person{
    public Teacher() {
        this.name = "老师";
    }
}
