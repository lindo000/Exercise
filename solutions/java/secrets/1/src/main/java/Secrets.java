public class Secrets {
    public static int shiftBack(int value, int amount) {
    
    int shift= value >>> amount;
        return shift;
        }

    public static int setBits(int value, int mask) {
    int set = value | mask;
        return set;
    }

    public static int flipBits(int value, int mask) {
int flip = value ^ mask;
    return flip;
    }

    public static int clearBits(int value, int mask) {
        mask= ~mask;
        int clear = value & mask;
        //value= ~value;
    return clear;
    }
}