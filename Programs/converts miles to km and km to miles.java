import java.util.Scanner;

 

// Java example - converts miles to km and km to miles

public class DistanceConverter {

    public static void main(String[] args) {

        System.out.print("Enter distance in miles:");

        Scanner s = new Scanner(System.in);

 

        double distanceInMiles = s.nextDouble();

 

        System.out.println(distanceInMiles + " miles = " + milesTokm(distanceInMiles) + " km");

 

        System.out.print("Enter distance in km:");

        double distanceInKm = s.nextDouble();

 

        System.out.println(distanceInKm + " km = " + kmTomiles(distanceInKm) + " miles");

        s.close();

 

    }

 

    private static double milesTokm(double distanceInMiles) {

        return distanceInMiles * 1.60934;

    }

 

    private static double kmTomiles(double distanceInKm) {

        return distanceInKm * 0.621371;

    }

}
