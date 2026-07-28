class NeedForSpeed {
    public static int speed;
    public static int batteryDrain;
    public int battery= 100;
    public int trackbat;
    public int CarDistance;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed= speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        boolean deadbat= (battery< batteryDrain) ? true:false;
        return deadbat;
    }

    public int distanceDriven() {
        int distanceDriven=CarDistance;
        return distanceDriven;
    }

    public void drive() {
        if (batteryDrained()){
            CarDistance=CarDistance;
            battery=battery;
        }else{
          CarDistance += speed;
          trackbat= battery-batteryDrain;
          battery=trackbat;
      
        }
    }

    public static NeedForSpeed nitro() {
    NeedForSpeed nitro= new NeedForSpeed(50,4);
     return  nitro;
    }}

class RaceTrack {
    public static int distance;
    
    RaceTrack(int distance) {
    this.distance=distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
    boolean canFinish;
    double temp= Math.round(RaceTrack.distance /car.speed);
        
        if(RaceTrack.distance %car.speed !=0){
              canFinish= temp * car.batteryDrain < 100 ? true:false;
        }else{
             canFinish= temp * car.batteryDrain <= 100 ? true:false;
        }
            
   
        
    return canFinish;
    }
}
