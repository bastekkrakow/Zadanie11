public class MyWater {

    private float largeBottle;
    private int mediuBottle;
    private int smallBottle;

    static float SMALL_LITRES = 0.5f;
    static float MEDIUM_LITRES = 1.0f;
    static float BIG_LITRES = 2.0f;


    public float getLargeBottle() {
        return largeBottle;
    }

    public int getMediuBottle() {
        return mediuBottle;
    }

    public int getSmallBottle() {
        return smallBottle;
    }

    void addLarge(int addL) {
        largeBottle += addL;
    }

    void addMedium(int addM) {
        mediuBottle += addM;
    }

    void addSmall(int addS) {
        smallBottle += addS;
    }


}
