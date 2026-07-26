public class Lasagna {
 public int expectedMinutesInOven(){
    int expectedMins = 40;
     return expectedMins;
}
public int remainingMinutesInOven(int ovenTime){
    int exp = new Lasagna().expectedMinutesInOven();
    int remainder= exp - ovenTime;
    return remainder;
}
public int preparationTimeInMinutes(int nLayers){
    int preptime = nLayers *2;
    return preptime;
}
public int totalTimeInMinutes(int nLayers, int ovenTime){
    int prep = new Lasagna().preparationTimeInMinutes(nLayers);
    int total= prep + ovenTime;
    return total;
}
}
