package Task_1;

public abstract class Schoolkid {
    protected String fullName;
    protected int age;
    protected String gender;
    protected String className;


    public Schoolkid(String fullName, int age, String gender, String className) {
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.className = className;
    }


    public abstract String[] getAllMethodsResult();
}
