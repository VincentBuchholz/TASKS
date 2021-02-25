public class Teacher {
    private String name;
    private int age;
    private boolean isFemale;

    Teacher(String tmpName, int tmpAge, boolean tmpIsFemale){
        this.name = tmpName;
        this.age = tmpAge;
        this.isFemale = tmpIsFemale;
    }

    public String getName() {
        return name;
    }
}