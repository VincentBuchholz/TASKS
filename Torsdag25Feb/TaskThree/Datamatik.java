class Datamatik{
    public static void main(String [] args){
        Teacher teacher = new Teacher("Jesper",54,false);

        Student me = new Student("Vincent",21,false,1);
        Student studyBuddy = new Student("Leo",25,false,1);

        System.out.println(teacher.getName());
        System.out.println(me.getName() + " team: " + me.getDatamatikerTeam());
        System.out.println(studyBuddy.getName() + " team: " + studyBuddy.getDatamatikerTeam());

    }
}