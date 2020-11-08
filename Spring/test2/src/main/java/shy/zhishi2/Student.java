package shy.zhishi2;

public class Student {
    private String name;
    private int age;
    private School school;

    public void setName(String name) {
        System.out.println("name"+name);
        this.name = name;
    }

    public void setAge(int age) {
        System.out.println("age"+age);
        this.age = age;
    }

    public void setSchool(School school) {
        System.out.println(school);
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
