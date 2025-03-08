import java.util.*;

import static java.lang.Math.*;

public class Algorithms {
    public static List<Double> GetMultiples(double num, int length){
        List<Double> results = new ArrayList<>();

        for(int i=1; i<=length; i++){
            results.add(num*i);
        }

        for (double e: results){
            System.out.println(e +" ");
        }

        return results;
    }

    public static double[] otherSides(int n) {
        // n, n*2=hypotenuse, (n*2*rad(3))/2 = medium length side
        double hypotenuse = 2*n;
        double mediumLengthSide = n * sqrt(3);

        String result = String.format("smallerLengthSide: %d, Hypotenuse: %.2f and mediumLengthSide: %.2f%n", n, hypotenuse,mediumLengthSide);
        System.out.print(result);

        return new double[]{hypotenuse, mediumLengthSide};
    }

    public static int warOfNumbers(int[]numbers){
        int even=0, odd=0;
        for (int number:numbers){
            if(number%2 == 0){
                even+=number;
            }
            else{
                odd+=number;
            }
        }
        System.out.println("War of numbers result: " + abs(even-odd));
        return abs(even-odd);
    }

    public static int letterCounter(char[][] arr, char c) {
        int counter = 0;
        for (char[] innerList: arr){
            for (char letter: innerList){
                if (letter == c){
                    counter++;
                }
            }
        }
        System.out.println("Letter " + c + " occurs "+ counter + " times.");
        return counter;
    }

    public static boolean isFactorial(int n, int current, int factorial) {
        if (n == factorial){
            System.out.println(n + " is exactly the factorial of " + current);
            return true;
        }

        if (factorial > n){
            System.out.println("no factorial");
            return false;
        }

        return isFactorial(n, current+1, factorial * (current+1));
    }

    //https://edabit.com/challenge/qSJ5hZfG52Nf2hXWS
    public static int largestGap(int[] numbers) {
        int maxGap = -1;
        Arrays.sort(numbers);

        for (int i=1; i<numbers.length; i++){
            if (numbers[i] - numbers[i-1] > maxGap){
                maxGap = numbers[i] - numbers[i-1];
            }
        }

        System.out.println("MaxGap: " + maxGap);

        return maxGap;
    }


    //https://edabit.com/challenge/NXTrfGBXTKg3Z9jkz
    public static boolean isPandigital(long num) {
        List<Integer> allDigits = new ArrayList<>();
        while (num > 0){
            allDigits.add(0, (int) (num%10));
            num/=10;
        }

        Set<Integer> setDigits = new HashSet<>(allDigits);
        for (int i = 0; i <= 9; i++) {
            if (!setDigits.contains(i)) {
                System.out.println("FALSE");
                return false;
            }
        }
        System.out.println("TRUE");
        return true;
    }

    //https://edabit.com/challenge/eCPim4XcssdZdvs32
    public static String[] numInStr(String[] arr) {
        List<String> result = new ArrayList<>();

        for (String str : arr) {
            if (str.matches(".*\\d.*")) {
                result.add(str);
            }
        }

        String[] outputArray = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            outputArray[i] = result.get(i);
        }

        for (String s: outputArray){
            System.out.println(s);
        }
        return outputArray;
    }
}
