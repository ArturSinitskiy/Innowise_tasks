public class Sun {
    private static Sun instance = null;

    private float diameterMillionKM = 1.39f;
    private int temperatureK = 5780;
    private float ageBillionYears = 4.57f;

    private Sun(){}

    public static Sun getInstance() {   //In Kotlin, I can use "object" instead of "getInstance()"
        if(instance == null) {
            instance = new Sun();
        }
        return instance;
    }

    public String getInfo(){
        return "Diameter (million km): " + diameterMillionKM + "\nTemperature (K): " +
                temperatureK + "\nAge (billion years): " + ageBillionYears;
    }
}
