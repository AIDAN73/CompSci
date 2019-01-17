class DiceGame {

    static int D4roll;
    static int D6roll;
    static int D20roll;
    static int D4total;
    static int D6total;
    static int D20total;
    static int D4average;
    static int D6average;
    static int D20average;
    static int rollnumber=0;

public static void main(String[] args) {

        
        for(int i=1; i<=20; i++) {
            rollnumber++;
            D4roll = getD4();                   //calculate random numbers
            D6roll = getD6();
            D20roll = getD20();
            D4total=D4total+D4roll;             //add up sum of all rolls
            D6total=D6total+D6roll;
            D20total=D20total+D20roll;
            D4average=D4total/rollnumber;
            
            System.out.print(rollnumber);                //print out roll number and values
            reportNumbers();
        }

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
        
        System.out.println("\tRoll:\tD4:"+D4roll +"\tD6:"+D6roll+"\tD20:"+D20roll);
        System.out.println("\tTotal:\tD4:"+D4total+"\tD6:"+D6total+"\tD20:"+D20total);
        System.out.println("    ");
    }



}