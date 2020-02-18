package com.neuedu.pojo;

/**
 * Created by Neuedu on 2020/2/18.
 */
public class Student2 {
    private Integer id;
    private String name;
    private Integer age;
    private Integer gender;
    static {
        // 这个部分叫做静态代码块
        // 该代码块中的代码 会在类加载器对该类进行加载的时候 运行
        // 因为对类进行加载的动作只会执行一次 所以静态代码块只有第一次主动使用类的时候会执行一次
        System.out.println("student静态代码块");
    }
    {
        System.out.println("构造代码块");
    }
    public Student2() {
        System.out.println("构造方法");
    }

    public Student2(String name, Integer age, Integer gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Student2(Integer id, String name, Integer age, Integer gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
