package ss7_abstract_interface.thuc_hanh.animal;

public class Chicken extends Animals implements Edibler{
    @Override
    public String makeSound() {
        return "Chicken:cục tác";
    }

    @Override
    public String howtoeat() {
        return "could be fried";
    }
}
