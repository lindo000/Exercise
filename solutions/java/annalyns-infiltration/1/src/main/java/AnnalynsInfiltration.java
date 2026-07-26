class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        boolean Bool;
        if(knightIsAwake){
            Bool = false;
        } else{
            Bool = true;
        }return Bool;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean     prisonerIsAwake) {
        boolean spy;
    if(!knightIsAwake && !archerIsAwake && !prisonerIsAwake){
        spy= false;
    }else{
        spy= true;
    }return spy;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean signal;
        if(prisonerIsAwake){
        signal=(!archerIsAwake) ? true:false;}
        else{signal=false;
            }
       
        return signal;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        boolean free;
      if(petDogIsPresent){
          free=(!archerIsAwake) ? true:false;
      }else{
          free=(prisonerIsAwake && !knightIsAwake && !archerIsAwake) ? true:false;
          
      }
        return free;
    }
}
