package Ss7_Abstract_Class_Interface.Thuc_hanh.animal_interface_edible;
public class Chicken extends Animal implements Edible{

    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }


    public String howToEat() {
        return "could be fried";

    }
}
