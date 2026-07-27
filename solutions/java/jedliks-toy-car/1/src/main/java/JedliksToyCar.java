public class JedliksToyCar {
    public int meters;
    public int display;
    public int battery = 100;
    public String empty = "Battery empty";
    public String distanceDisplay="";
    public String batteryDisplay= "";
    
    public static JedliksToyCar buy() {
        JedliksToyCar JedliksToyCar= new JedliksToyCar();
        return JedliksToyCar;
    }

    public String distanceDisplay() {
    distanceDisplay=("Driven " + meters + " meters");
        return distanceDisplay;
    }

    public String batteryDisplay() {
 if(battery!=0){
           batteryDisplay=("Battery at " + battery  + "%");}
        else{
            batteryDisplay= empty;
        }
        return batteryDisplay;
    }

    public void drive() {
    if (battery!=0){
    battery = battery -1;
    meters = meters +20;}
    else {
        batteryDisplay= empty;
        distanceDisplay= empty;
    }
    }
}
