 package homework_15;

import lesson_15.Cat;

public class MainGadget {
    public static void main(String[] args) {

        Gadget gadget = new Gadget();

        String gadgetType = gadget.type;

        int price = gadget.price;

        System.out.println("****************************** \n");

        Gadget gadget1 = new Gadget("iPhone", "Apple", 1000);

        gadget1.introduce();
        gadget1.call();
        gadget1.takePhoto();

        System.out.println("****************************** \n");

        Gadget gadget2 = new Gadget("Robot Vacuum Cleaner", "iClebo", 300);
        gadget2.introduce();
        gadget2.clean();

        System.out.println("****************************** \n");

        Gadget gadget3 = new Gadget("Macbook", "Apple", 1800);
        gadget3.introduce();
        gadget3.websurfing();
    }
}
