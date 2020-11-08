package shy.zhishi5;

public class Student {
    private String name;
    private int age;
    private School school;

//    Spring默认无参构造
    public Student() {
        System.out.println("无参");
    }

//    有参
    public Student(String name, int age, School school) {
        System.out.println("有参");
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public Student(String name, String age) {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }


}
