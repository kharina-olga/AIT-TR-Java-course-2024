package OldPackages.lesson_02.code.methods;

public class Repka {

    public static void main(String[]args){

       opa();

    } // end of main
    public static void opa(){

        System.out.println("*** на сцену выходит Дед ***\n" +
                "Посадил дед репку и выросла репка большая-большая. Тянет-потянет дед репку, а вытянуть не может.\n" +
                "И позвал дед бабку.\n" +
                "*** Дед уходит со сцены ***\n");
        oma();

    }
    public static void oma(){
        System.out.println("*** на сцену выходит Бабка ***\n"+
                "И стали они вместе с бабкой репку тянуть, да не вытянули. И позвала бабка внучку.\n" +
                "*** Бабка уходит со сцены ***\n");
        enkelin();
    }

    public static void enkelin(){
        System.out.println("*** на сцену выходит Внучка ***\n"+
                "И стали они вместе с внучкой репку тянуть, да не вытянули. И позвала внучка Жучку\n" +
                "*** Внучка уходит со сцены ***\n");
        hund();

    }
    public static void hund(){
        System.out.println("*** на сцену выходит Жучка ***\n"+
            "И стали они вместе с Жучкой репку тянуть, да не вытянули. И позвала Жучка Мурку\n" +
            "*** Жучка уходит со сцены ***\n");
        katze();

    }
    public static void katze(){
        System.out.println("*** на сцену выходит Мурка ***\n"+
                "И стали они вместе с Муркой репку тянуть, да не вытянули. И позвала Мурка мышку\n" +
                "*** Мурка уходит со сцены ***\n");
        maus();

    }
    public static void maus(){
        System.out.println("*** на сцену выходит мышка ***\n"+
                "И стали они вместе с мышкой репку тянуть, и вытянули. \n" +
                "*** мышка уходит со сцены ***\n");
        happyend();
    }
    public static void happyend(){
        System.out.println("*** все герои на сцене ужинают репкой ***");
    }

} //end of class
