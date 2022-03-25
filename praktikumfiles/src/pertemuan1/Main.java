package pertemuan1;

import pertemuan1.model.Mouse;

public class Main {
    public static void main(String[] args) {
        // Making object of Mouse by using primary constructor
        Mouse logitech = new Mouse("Logitech", 146, 6, "White");

        // Making object of Mouse by using primary constructor
        Mouse apple = new Mouse();

        // Set value to object of Mouse using setter methods
        apple.setBrand("Apple");
        apple.setWeight(100);
        apple.setColor("White");
        apple.setTotalButton(1);

        // Print object of Mouse using getter methods
        System.out.println("Brand: " + logitech.getBrand());
        System.out.println("Weight: " + logitech.getWeight());
        System.out.println("Color: " + logitech.getColor());
        System.out.println("Total Button: " + logitech.getTotalButton());
    }
}
