package homework_15;

// code by Olga Kharina
/* Напишите три класса, описывающие какие-то сущности вокруг Вас.

Не забудьте использовать абстракцию.

Например, опишите студента, преподавателя и, допустим, врача.

Вы можете выбрать свои сущности для описания. */

public class Gadget {
    public String type;
    public String producer;
    public int price;


    public Gadget(String gadgetType) {

        type = gadgetType;
    }
    // Конструктор по умолчанию.
    public Gadget() {
    }

    public Gadget(String gadgetType, String producer) {
        type = gadgetType;
        this.producer = producer;

    }

    public Gadget(String type, String producer, int price) {
        this(type, producer);

       this.type = type;
       this.producer = producer;
       this.price = price;
    }


    public void call() {
        System.out.println("My main function is calling to your contacts.....");
    }

    public void takePhoto() {
        System.out.println("Let's take a photo!");
    }

    public void clean() {
        System.out.println("I'm cleaning dust from the floor.");
    }

    public void websurfing() { System.out.println("Let's go to the Internet and find something interesting to watch!");
    }

    public void introduce() {
        System.out.printf("Gadget: %s, Producer: %s, Price: %d\n", this.type, producer, price);
    }

}


