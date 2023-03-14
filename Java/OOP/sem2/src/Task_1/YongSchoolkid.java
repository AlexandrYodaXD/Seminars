package Task_1;

public class YongSchoolkid extends Schoolkid{
    public YongSchoolkid(String fullName, int age, String gender, String className) {
        super(fullName, age, gender, className);
    }

    @Override
    public String[] getAllMethodsResult(){
        return new String[]{
                getStudy(),
                getPlay(),
                getSmoke()
        };
    }

    @Override
    public String toString() {
        return "YongSchoolkid{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", className='" + className + '\'' +
                '}';
    }

    public String getStudy(){
        return "Я ненавижу учиться";
    }

    public String getPlay(){
        return "Я играю в Minecraft";
    }

    public String getSmoke(){
        return "Я начинаю курить";
    }
}
