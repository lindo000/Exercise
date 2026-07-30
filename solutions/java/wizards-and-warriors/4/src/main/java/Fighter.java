class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}


 class Warrior extends Fighter{  
    
    @Override
    boolean isVulnerable() {
        return false;
    }
     @Override
    int getDamagePoints(Fighter fighter) {
        int dmg=0;
        if(fighter.isVulnerable()){
            dmg=10;
        }else{
            dmg=6;
        }
        return dmg;
    }
@Override
    public String toString(){
        return "Fighter is a Warrior";
    }
    
    
}

 class Wizard  extends Fighter{ 
    public boolean preparedSpell= false;
    
     @Override
    boolean isVulnerable() {
        boolean isVulnerable= (preparedSpell)? false:true;
        return isVulnerable;
    }
    @Override
    int getDamagePoints(Fighter fighter) {
        int dmg=0;
        if(preparedSpell==true){
            dmg=12;
        }else{
            dmg=3;
        }
        return dmg;
    }
    
    void prepareSpell(){
        preparedSpell= true;
    }
    @Override
    public String toString(){
        return "Fighter is a Wizard";
    }
    
}