import java.util.*;
import static java.lang.Double.parseDouble;

public class Main{
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        ArrayList<String> cities = new ArrayList<>();
        Map<String,Double> citiesAndTemps = new HashMap<>();
        makeCityList(cities);
        for(int i = 0; i < cities.size(); i++){
            addToMap(cities.get(i),getCityAvg(cities, i), citiesAndTemps);
        }
        System.out.println(citiesAndTemps);
    }
    static void makeCityList(ArrayList<String> a){
        System.out.println("What is the first city?");
        String userInputCity = input.nextLine();
        while(!(userInputCity.equals("END"))) {
            a.add(userInputCity);
            System.out.println("What is the next city?");
            userInputCity = input.nextLine();
        }
    }
    static double getCityAvg(ArrayList<String> a,int i){
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
        return ((temp1 + temp2 + temp3 + temp4 + temp5)/5);
    }
    static void addToMap(String a,Double b, Map<String,Double> c){
        c.put(a,b);
    }
}