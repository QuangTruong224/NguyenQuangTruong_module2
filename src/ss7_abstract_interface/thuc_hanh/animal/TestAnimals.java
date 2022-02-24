package ss7_abstract_interface.thuc_hanh.animal;

public class TestAnimals {
    public static void main(String[] args) {
        Animals[] animals=new Animals[2];
        animals[0]=new Tiger();
        animals[1]=new Chicken();
        for(Animals animals1 : animals) {
            System.out.println(animals1.makeSound());
            if (animals1 instanceof Chicken) {
                Edibler edibler = (Chicken) animals1;
                System.out.println(edibler.howtoeat());
            }
        }
        }
}
