class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class
 class Warrior extends Fighter{  
    
    
    boolean isVulnerable() {
        return false;
    }
    int getDamagePoints(Fighter fighter) {
        int dmg=0;
        if(fighter.isVulnerable()){
            dmg=10;
        }else{
            dmg=6;
        }
        return dmg;
    }
    
    public String toString(){
        return "Fighter is a Warrior";
    }
    
    
}
// TODO: define the Wizard class
 class Wizard  extends Fighter{ 
    public boolean preparedSpell= false;
    
    boolean isVulnerable() {
        boolean isVulnerable= (preparedSpell)? false:true;
        return isVulnerable;
    }
    
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
    
    public String toString(){
        return "Fighter is a Wizard";
    }
    
}