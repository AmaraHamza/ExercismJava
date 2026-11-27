public class Lasagna {
    int expectedMinutesInOven = 40;
    public int expectedMinutesInOven(){
        return expectedMinutesInOven;
    }
    public int remainingMinutesInOven(int minutesInOven){
        return expectedMinutesInOven() - minutesInOven;
    }
    public int preparationTimeInMinutes(int numberOfLayers){
        return numberOfLayers * 2;
    }
    public int totalTimeInMinutes(int numberOfLayers, int minutesInOven){
        return preparationTimeInMinutes(numberOfLayers) + minutesInOven;
    }
}
