public class Student {

    private String name;
    private int age;
    private boolean isFemale;
    private int datamatikerTeam;

    Student(String tmpName, int tmpAge, boolean tmpIsFemale, int tmpDatamatikerTeam){
        this.name = tmpName;
        this.age = tmpAge;
        this.isFemale = tmpIsFemale;
        this.datamatikerTeam = tmpDatamatikerTeam;
    }

    public String getName() {
        return name;
    }
    public int getDatamatikerTeam(){
        return datamatikerTeam;
    }
}