import java.util.*;

import static java.lang.Double.parseDouble;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        Map<String,Integer> citiesAndTemps = new HashMap<>();
        System.out.println("What is the first city?");
        String userInputCity = input.nextLine();
        while(!(userInputCity.equals("END"))){
            addCity(cities, userInputCity);
            System.out.println("What is the next city?");
            userInputCity = input.nextLine();
        }
        for(int i = 0; i < cities.size(); i++) {
            addToMap(cities.get(i),getCityAvg(cities, i), citiesAndTemps);
        }
        System.out.println(citiesAndTemps);
    }
    static ArrayList addCity(ArrayList a,String city){
        a.add(city);
        return a;
    }
    static double getCityAvg(ArrayList a,int i){
        System.out.println("What is Monday's temperature for " + a.get(i) + "?");
        double temp1 = parseDouble(input.nextLine());
        System.out.println("What is Tuesday's temperature for " + a.get(i) + "?");
        double temp2 = parseDouble(input.nextLine());
        System.out.println("What is Wednesday's temperature for " + a.get(i) + "?");
        double temp3 = parseDouble(input.nextLine());
        System.out.println("What is Thursday's temperature for " + a.get(i) + "?");
        double temp4 = parseDouble(input.nextLine());
        System.out.println("What is Friday's temperature for " + a.get(i) + "?");
        double temp5 = parseDouble(input.nextLine());
        double avgTemp = (temp1 + temp2 + temp3 + temp4 + temp5)/5;
        return avgTemp;
    }
    static Map addToMap(String a,Double b, Map c){
        c.put(a,b);
        return c;
    }
}