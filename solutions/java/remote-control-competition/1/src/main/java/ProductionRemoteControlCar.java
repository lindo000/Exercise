class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar>{
public int driven=0;
public int vic= 0;
    public void drive() {
      driven=driven+10;
    }

    public int getDistanceTravelled() {
    return driven;
    }

    public int getNumberOfVictories() {
       return vic;
    }

    public void setNumberOfVictories(int numberOfVictories) {
       vic =  numberOfVictories;
    }
    public int compareTo(ProductionRemoteControlCar p2){
        return Integer.compare( p2.getNumberOfVictories(), this.getNumberOfVictories());
    }
    
}
