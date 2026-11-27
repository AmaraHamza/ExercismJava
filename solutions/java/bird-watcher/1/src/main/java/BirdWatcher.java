
class BirdWatcher {
    private final int[] birdsPerDay;
    private static int[] lastWeekBirdsPerDay = { 0, 2, 5, 3, 7, 8, 4 };

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay;
    }

    public static int[] getLastWeek() {
        return lastWeekBirdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] = getToday() + 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int count : birdsPerDay){
            if ( count == 0 )
                return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int countForFirstDays = 0;
        numberOfDays = (numberOfDays > birdsPerDay.length) ? birdsPerDay.length : numberOfDays;
        for (int i=0; i < numberOfDays; i++){
            countForFirstDays = countForFirstDays + birdsPerDay[i];
        }
        return countForFirstDays;
    }

    public int getBusyDays() {
        int countBusyDays = 0;
        for (int count : birdsPerDay){
            if (count > 4)
                countBusyDays++;
        }
        return countBusyDays;
    }
}
