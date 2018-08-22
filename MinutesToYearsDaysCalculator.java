public class MinutesToYearsDaysCalculator {

    // Przelicz minuty na lata i dni

    public static void main(String[] args) {

    }

    public static void printYearsAndDays(long minutes){

        if(minutes<0)
            System.out.println("Invalid Value");

        else if(minutes<10)
            System.out.println(minutes+" min = 0 y and 0 d");

        else if(minutes<1440)
            System.out.println(minutes+" min = 00 y and 00 d");

        else if(minutes<525600) {
            long days=minutes/1440;
            System.out.println(minutes + " min = 00 y and "+days+" d");
        }

        else if(minutes>=525600){
            long years=minutes/525600;
            long newMinutes=minutes%525600;
            long newDays=newMinutes/1440;
            System.out.println(minutes + " min = "+years+" y and "+newDays+" d");
        }

    }
}
