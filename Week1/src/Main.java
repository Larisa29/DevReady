import java.util.List;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        int i = 5;
        for (; i > 0; i--) {
            System.out.println("Ddd");
        }

        int j = 5;
        while (j >= 0) {
            System.out.println("eee");
            j--;
        }
        System.out.println(j);

        int x = Integer.parseInt(args[0]);
        if (x < 10){
            System.out.println("0-9");
        } else if(x < 99){
            System.out.println("10-99");
        } else{
            System.out.println("> 99");
        }

        ///// problems
        //1
        List<Double> multiples = Algorithms.GetMultiples(12,10);

        //2
        //3
        //4
        //5
    }
}