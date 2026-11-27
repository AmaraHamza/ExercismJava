public class ExperimentalRemoteControlCar implements RemoteControlCar {
    int driveUnits = 20;
    int distanceTr = 0;
    public void drive() {
        distanceTr += driveUnits;
    }

    public int getDistanceTravelled() {
        return this.distanceTr;
    }
}