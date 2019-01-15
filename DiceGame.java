class DiceGame {

    static int D4;
    static int D6;
    static int D20;


public static void main(String[] args) {

        getD4();
        getD6();
        getD20();
        reportNumbers();

    }

    public static void getD4() {

        int D4 = (int) (Math.random()*4)+1;
        System.out.println(D4);
    }

    public static void getD6() {

        int D6 = (int) (Math.random()*6)+1;
        System.out.println(D4);
    }

    public static void getD20() {

        int D20 = (int) (Math.random()*20)+1;
        System.out.println(D20);
    }

    public static void reportNumbers() {
        
        System.out.println("\tD4:"+D4 +"\tD6:"+D6+"\tD20:"+D20);
    }



}