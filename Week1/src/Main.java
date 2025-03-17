
import ParentsPackage.Car;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        for (int i = 0; i < args.length; i++) {
//            System.out.println(args[i]);
//        }
//
//        int i = 5;
//        for (; i > 0; i--) {
//            System.out.println("ok");
//        }
//
//        int j = 5;
//        while (j >= 0) {
//            System.out.println("ok");
//            j--;
//        }
//        System.out.println(j);
//
//        int x = Integer.parseInt(args[0]);
//        if (x < 10){
//            System.out.println("0-9");
//        } else if(x < 99){
//            System.out.println("10-99");
//        } else{
//            System.out.println("> 99");
//        }

        ///// problems
//        //1
//        System.out.println("-----------------------------1 ----------------------");
//        List<Double> multiples = Algorithms.GetMultiples(12,10);
//
//        //2
//        System.out.println("-----------------------------2 ----------------------");
//        Algorithms.otherSides(1);
//        Algorithms.otherSides(12);
//        Algorithms.otherSides(2);
//
//        //3
//        System.out.println("-----------------------------3 ----------------------");
//        Algorithms.warOfNumbers(new int []{2,8,7,5});
//        Algorithms.warOfNumbers(new int []{12, 90, 75});
//        Algorithms.warOfNumbers(new int []{5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243});
//
//        //4
//        System.out.println("-----------------------------4 ----------------------");
//        int[][] f;
//        char[][] letterMatrix = {
//                {'D', 'E', 'Y', 'H', 'A', 'D'},
//                {'C', 'B', 'Z', 'Y', 'J', 'K'},
//                {'D', 'B', 'C', 'A', 'M', 'N'},
//                {'F', 'G', 'G', 'R', 'S', 'R'},
//                {'V', 'X', 'H', 'A', 'S', 'S'}
//        };
//        Algorithms.letterCounter(letterMatrix, 'D') ;
//
//        //5
//        System.out.println("-----------------------------5 ----------------------");
//        Algorithms.isFactorial(24,1,1); //mereu 1 si 1 pt ultimele 2 args
//        Algorithms.isFactorial(120,1,1);
//
//        //6
//        System.out.println("-----------------------------6 ----------------------");
//        int[] numbers = new int[] {4,1,6,9,3};
//        Algorithms.largestGap(numbers);
//        numbers = new int[] {9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5};
//        Algorithms.largestGap(numbers);
//
//        numbers = new int[] {14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7};
//        Algorithms.largestGap(numbers);
//
//        numbers = new int[] {13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9};
//        Algorithms.largestGap(numbers);
//
//        //7
//        System.out.println("-----------------------------7 ----------------------");
//        Algorithms.isPandigital(981407235);
//
//        //8
//        System.out.println("-----------------------------8 ----------------------");
//        String[] input = {"abc", "ab10c", "a10bc", "bcd", "test one"};
//        Algorithms.numInStr(input);
//
//        //9
//        int arr[][] = new int[][]{{1,2,3,4},{1,2,3,4}};

        //10
        int num[] = new int[]{9, 8, 2, 4, 20};
        //num = new int[3];
        int[][] result = Algorithms.divizori(num);
        System.out.println(Arrays.deepToString(result));


        //car
        Car car = new Car(1000, "volvo", "pink");
        System.out.println(car.color);

        Car skoda = new Car(3400);
        System.out.println(skoda.color);

        Car logan = new Car();
        System.out.println(skoda.color);

    }
}