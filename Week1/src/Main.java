import java.util.List;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        int i = 5;
        for (; i > 0; i--) {
            System.out.println("ok");
        }

        int j = 5;
        while (j >= 0) {
            System.out.println("ok");
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
        System.out.println("-----------------------------1 ----------------------");
        List<Double> multiples = Algorithms.GetMultiples(12,10);

        //2
        System.out.println("-----------------------------2 ----------------------");
        Algorithms.otherSides(1);
        Algorithms.otherSides(12);
        Algorithms.otherSides(2);

        //3
        System.out.println("-----------------------------3 ----------------------");
        Algorithms.warOfNumbers(new int []{2,8,7,5});
        Algorithms.warOfNumbers(new int []{12, 90, 75});
        Algorithms.warOfNumbers(new int []{5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243});

        //4
        System.out.println("-----------------------------4 ----------------------");
        char[][] letterMatrix = {
                {'D', 'E', 'Y', 'H', 'A', 'D'},
                {'C', 'B', 'Z', 'Y', 'J', 'K'},
                {'D', 'B', 'C', 'A', 'M', 'N'},
                {'F', 'G', 'G', 'R', 'S', 'R'},
                {'V', 'X', 'H', 'A', 'S', 'S'}
        };
        Algorithms.letterCounter(letterMatrix, 'D') ;

        //5
        System.out.println("-----------------------------5 ----------------------");
        Algorithms.isFactorial(24,1,1); //mereu 1 si 1 pt ultimele 2 args
        Algorithms.isFactorial(120,1,1);
    }
}