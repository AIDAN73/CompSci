class DiceGame {

    static int D4roll;
    static int D6roll;
    static int D20roll;


public static void main(String[] args) {

        D4roll = getD4();
        D6roll = getD6();
        D20roll = getD20();
        reportNumbers();

    }

    public static int getD4() {

        int D4 = (int) (Math.random()*4)+1;
        return D4;
    }

    public static int getD6() {

        int D6 = (int) (Math.random()*6)+1;
        return D6;
    }

    public static int getD20() {

        int D20 = (int) (Math.random()*20)+1;
        return D20;
    }

    public static void reportNumbers() {
        
        System.out.println("\tD4:"+D4roll +"\tD6:"+D6roll+"\tD20:"+D20roll);
    }



}