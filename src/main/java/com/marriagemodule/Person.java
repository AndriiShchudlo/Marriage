package main.java.com.marriagemodule;


public class Person {
    private String name;
    private Sex sex;
    private int age;
    private boolean married;

    private Person loveHalf;

    public Person(){}

    public Person(String name, Sex sex, int age, boolean married) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.married = married;
       }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public Person getLoveHalf() {
        return loveHalf;
    }

    public void setLoveHalf(Person loveHalf) {
        this.loveHalf = loveHalf;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", married=" + married +
                '}';
    }
}
