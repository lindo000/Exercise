public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
 public int expectedMinutesInOven(){
    int expectedMins = 40;
     return expectedMins;
}
    // TODO: define the 'remainingMinutesInOven()' method
public int remainingMinutesInOven(int ovenTime){
    int remainder= 40 - ovenTime;
    return remainder;
}
    // TODO: define the 'preparationTimeInMinutes()' method
public int preparationTimeInMinutes(int nLayers){
    int preptime = nLayers *2;
    return preptime;
}
    // TODO: define the 'totalTimeInMinutes()' method
public int totalTimeInMinutes(int nLayers, int ovenTime){
    int prep = new Lasagna().preparationTimeInMinutes(nLayers);
    int total= prep + ovenTime;
    return total;
}
}
