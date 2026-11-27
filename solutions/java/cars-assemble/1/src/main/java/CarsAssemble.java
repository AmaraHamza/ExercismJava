public class CarsAssemble {
    private final int nbCarProducedInHour = 221;
    public double productionRatePerHour(int speed) {
        if (0 < speed && speed <= 4){
            return speed * nbCarProducedInHour;
        } else if (4 < speed && speed <= 8){
            return speed * nbCarProducedInHour * 0.9;
        } else if (speed == 9){
            return speed * nbCarProducedInHour * 0.8;
        } else if (speed == 10){
            return speed * nbCarProducedInHour * 0.77;
        } else return speed * nbCarProducedInHour;
    }

    public int workingItemsPerMinute(int speed) {
        return (int)productionRatePerHour(speed)/60;
    }
}
