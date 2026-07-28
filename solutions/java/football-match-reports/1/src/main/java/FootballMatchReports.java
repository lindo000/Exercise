public class FootballMatchReports {    
    public static String onField(int shirtNum) {

        String onF="";
        
        switch (shirtNum){
            case 1: onF= "goalie";
                break;
            case 2: onF="left back";
                break;
            case 3 , 4: onF="center back";
                break;
            case 5: onF= "right back";
                break;
            case 6, 7, 8: onF="midfielder";
                break;
            case 9: onF= "left wing";
                break;
            case 10:onF=  "striker";
                break;
            case 11:onF= "right wing";
                break;
                default :
                onF="invalid";
                break;
            
        }
        return onF;
    }
}
