public class ExperimentalRemoteControlCar implements RemoteControlCar {
public int driven=0;
    
    public void drive() {
    driven=driven+20;
    }

    public int getDistanceTravelled() {
    return driven;
    }
}
