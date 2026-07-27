
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        int[] getLastWeek = new int[]{0,2, 5, 3, 7, 8, 4};
        return getLastWeek;
    }

    public int getToday() {
        //int []birdsPerDay = new BirdWatcher(birdsPerDay);
        int size= birdsPerDay.length;
        int today= birdsPerDay[size-1];
        return today;
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1] =  birdsPerDay[birdsPerDay.length-1]+1;
    }

    public boolean hasDayWithoutBirds() {
    boolean bird= false ;
    for(int birds: birdsPerDay){
        if(birds!=0){ 
            continue;
            }else{
            bird=true;
            break;
            }
        }return bird;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count=0;
        if(numberOfDays >= birdsPerDay.length){
            numberOfDays= birdsPerDay.length; }
   
        for (int i=0; i< numberOfDays; i++){
        count= count+ birdsPerDay[i];
    }
        return count;
    }

    public int getBusyDays() {
        int days=0;
       
        for(int birds: birdsPerDay){
        if (birds < 5){
            continue;
            }else{
            days= days + 1;
            }
    }return days;
}}
