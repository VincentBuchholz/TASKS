class Datamatik{
        public static void main(String [] args){
            Student [] students = new Student[10];
            students [0] = new Student("Vincent",21,false,1);
            students [1] = new Student("Helene",19,true,2);
            students [2] = new Student("Anna",18,true,1);
            students [3] = new Student("Sebastian",23,false,3);
            students [4] = new Student("Kassandra",17,true,1);
            students [5] = new Student("Thomas",21,false,1);
            students [6] = new Student("Jakob",20,false,1);
            students [7] = new Student("Alberte",18,true,2);
            students [8] = new Student("Helene",19,false,1);
            students [9] = new Student("Flemming",55,false,3);

            printName(1,students);
            printName(3,students);
            printName(5,students);
            getIndex("Helene",students);

        }

        public static void printName(int indexNumber, Student [] arr){
            System.out.println(arr[indexNumber].getName());
        }

        public static void getIndex(String name, Student[] arr){
            for (int i = 0; i < arr.length; i++){
                if(arr[i].getName().contentEquals(name)){
                    System.out.println(i);
                }
            }
        }
    }