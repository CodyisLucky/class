public class MinutesToYearsDaysCalculator {
    // write your code here
    public static void printYearsAndDays(long minutes){
        if(minutes >= 0){
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;
            long remDays = days - (years * 365);

            System.out.println(minutes + " min = " + years + " y and " + remDays + " d");
        }
        else{
            System.out.println("Invalid Value");
        }

    }
}