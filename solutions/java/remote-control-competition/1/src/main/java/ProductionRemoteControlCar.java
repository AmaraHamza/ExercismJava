class ProductionRemoteControlCar implements RemoteControlCar, 
    Comparable<ProductionRemoteControlCar> {
    int driveUnits = 10;
    int distanceTr = 0;
    int numberOfVictories = 0;
    public void drive() {
        distanceTr += driveUnits;
    }

    public int getDistanceTravelled() {
        return this.distanceTr;
    }

    public int getNumberOfVictories(){
        return this.numberOfVictories;
    }

    public void setNumberOfVictories(int nb){
        this.numberOfVictories = nb;
    }
    @Override
	public int compareTo(ProductionRemoteControlCar pCar) {
		return Integer.compare(pCar.getNumberOfVictories(), this.numberOfVictories);
	}
}