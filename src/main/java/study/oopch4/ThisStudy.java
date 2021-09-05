package study.oopch4;

public class ThisStudy {
    String name;
    int age;

    public ThisStudy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public ThisStudy() {
//        this.age = 11; 올수 없다. 
        this("Lee", 12);
//        this.age = 11; 올수 있다.
    }
}
