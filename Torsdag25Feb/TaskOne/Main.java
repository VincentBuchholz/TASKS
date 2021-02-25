class Main{

	
	static void printEmptlyLine(){
		System.out.println();
	}

	static void printString(String s){
        System.out.println(s);
    }
	
	 static void ageName(String name, int age){
        System.out.println("My name is " + name + ", I am " + age + " years old");
    }

	public static void main(String [] args){
		printEmptlyLine();
		printString("taskOne");
		ageName("Vincent", 21);
	}
}