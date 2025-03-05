import java.util.ArrayList;
import java.util.List;

public class Algorithms {
    public static List<Double> GetMultiples(double num, int length){
        List<Double> results = new ArrayList<>();

        for(int i=1; i<=length; i++){
            results.add(num*i);
        }

        for (double e: results){
            System.out.print(e +" ");
        }

        return results;
    }
}
