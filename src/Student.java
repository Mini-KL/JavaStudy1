public class Student {
    private int id;
    private String name;
    private String age;

    static {
        System.out.println("Student 类代码块");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
    public static void show(){
        System.out.println("11");
    }
    public static void main(String[] args) {
        Student.show();
        Student stu = new Student();
        Student stu1=new Student();
        stu.show();
    }
}
