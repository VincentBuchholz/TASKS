package CphBusiness;

import java.util.Arrays;

public class Dog {
    private Owner owner;
    private String name;
    private boolean isHungry;
    private Dog[] offSpring;
    private Dog[] newOffSpring;
    private static int counter;

    public Dog(String name, boolean isHungry){
        this.name = name;
        this.isHungry = isHungry;
        this.offSpring = new Dog[3];
        this.counter = 0;

    }

    public void setOwner(Owner owner){
        this.owner = owner;
    }

    public Owner getOwner(){
       return this.owner;
    }

    public void setOffSpring(Dog dog){

        if (counter < offSpring.length) {
            offSpring[counter] = dog;
            counter++;
        } else {
           newOffSpring = Arrays.copyOf(offSpring,counter);
        }
    }

    public Dog[] getOffSpring() {
        if (counter < offSpring.length) {
            return offSpring;
        } else {
            return newOffSpring;
        }
    }

    public String feedDog(){
        String feed = "";
        if(this.isHungry == true){
            feed = this.name + " has been fed.";
            this.isHungry = false;
        } else {
            feed = this.name + " isn't hungry.";
        }
        return feed;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
