class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int distanceDriv;
    private int battery;
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.distanceDriv = 0;
        this.battery = 100;
    }
    
    public int getSpeed() {
		return speed;
	}
    
    public boolean batteryDrained() {
        if (battery < batteryDrain) return true;
        return false;
    }

    public int distanceDriven() {
        return this.distanceDriv;
    }

    public void drive() {
        if (batteryDrained()) return;
        this.distanceDriv += speed;
        this.battery -= this.batteryDrain;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        int speed = car.getSpeed();
        for (int i = 0; i < distance; i+=speed){
            if (car.batteryDrained()) return false;
        	car.drive();
        }
        return true;
    }
}
