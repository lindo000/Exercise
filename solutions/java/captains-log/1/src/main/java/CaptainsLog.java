import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        
    int randomPlanet= random.nextInt(10);
        return PLANET_CLASSES[randomPlanet];
    }

    String randomShipRegistryNumber() {
         
        int reg= random.nextInt(9000)+1000;
    String regpl="NCC-" + reg;
        return regpl;
    }

    double randomStardate() {
    
        double stardate=41000.0+ 1000.0*random.nextDouble();
        return stardate;
    }
}
