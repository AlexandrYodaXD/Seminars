package Task_1;

public class MiddleSchoolkid extends Schoolkid {
    public MiddleSchoolkid(String fullName, int age, String gender, String className) {
        super(fullName, age, gender, className);
    }

    public String[] getAllMethodsResult(){
        return new String[]{
                getStudy(),
                getPlay(),
                getHobby()
        };
    }

    @Override
    public String toString() {
        return "MiddleSchoolkid{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", className='" + className + '\'' +
                '}';
    }

    public String getStudy(){
        return "Я люблю учиться";
    }

    public String getPlay(){
        return "Я играю в игрушки";
    }

    public String getHobby(){
        return "Я хожу в продлёнку";
    }
}
