public class CurrentTime {
    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("Author: JealousGx");
        System.out.println("*********************");
        ////Total milliseconds since 1970 GMT
        long totalMilliSecs = System.currentTimeMillis();
        ////Total seconds since 1970
        long totalSeconds = totalMilliSecs / 1000;
        ///Current seconds
        long currentSecs = totalSeconds % 60;
        ////Total minutes
        long totalMins = totalSeconds / 60;
        ////Current minutes
        long currentMins = totalMins % 60;
        ///Total hours
        long totalHours = totalMins / 60;
        ////Current hours
        long currentHours = (totalHours % 24) + 5;
        ///Printing the current time
        currentHours = (currentHours > 12) ? currentHours -= 12 : currentHours;
        System.out.println("Current time: " + currentHours + ":" + currentMins + ":" + currentSecs + " PST");
    }
}
