public class JedliksToyCar {
    private int drivenDistance = 0;
    private int battery = 100;
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven "+drivenDistance+" meters";
    }

    public String batteryDisplay() {
        if (battery == 0) return "Battery empty";
        return "Battery at "+battery+"%";
    }

    public void drive() {
        if (battery > 0){
            drivenDistance += 20;
            battery -= 1;
        }
    }
}
