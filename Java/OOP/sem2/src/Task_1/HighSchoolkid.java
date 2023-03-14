package Task_1;

public class HighSchoolkid extends Schoolkid {
    public HighSchoolkid(String fullName, int age, String gender, String className) {
        super(fullName, age, gender, className);
    }

    public String[] getAllMethodsResult(){
        return new String[]{
                getStudy(),
                getPlay(),
                getLove()
        };
    }

    @Override
    public String toString() {
        return "HighSchoolkid{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", className='" + className + '\'' +
                '}';
    }

    public String getStudy(){
        return "Я должен учиться";
    }

    public String getPlay(){
        return "Я бросаю курить";
    }

    public String getLove(){
        return "Я ищу любовь";
    }
}
