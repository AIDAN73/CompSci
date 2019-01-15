class  CruiseControl {

    static Boolean cruiseControlSet = false;

    static int speed = 0;

    static final int MAX_SPEED = 50;

    static int warningSpeed = 30;

    public static void main(String[] args) {

        toggleCruiseControl();
        accelerate();


    }

    public static void toggleCruiseControl() {

        cruiseControlSet = !cruiseControlSet;


        if( !cruiseControlSet ) {

            System.out.println("Cruise Control Disabled.");
            speed  =  0;
        }

        else {

            System.out.println("Cruise Control Enabled");   
        }
    }

    public static void accelerate() {

        if( cruiseControlSet && ( speed < MAX_SPEED )) {

            speed += 5;
            System.out.println("Accelerated 5mph");
            reportSpeed();
        }

        

        if( exceedsWarningThreshold() ) {

            alert( false );
        }
    }

    public static void decelerate() {
        if(cruiseControlSet && (speed >  0 )) {

            speed  -=  5;
            System.out.println( "Decelerated 5mph"  );

            reportSpeed();
        }

        

        if( exceedsWarningThreshold() ) {
            
            alert(true);
        }
    }

    public static void reportSpeed () {
        System.out.println("Current speed is:\t" + speed + "mph");
    }

    public static void alert( Boolean isDecelerating) {

        if( isDecelerating ) {
            System.out.println("Warning, current speed still exceeds warning threshold.");
        }
        else {
            System.out.println("Warning, current speed exceeds warning threshold.");
        }
        System.out.println("Your speed:\t\t" + speed + "mph/" + warningSpeed + "mph");
    }

    public static Boolean exceedsWarningThreshold() {

        if( speed > warningSpeed ) {    
            return true;
        }
        else {
            return false;
        }    
    }
}