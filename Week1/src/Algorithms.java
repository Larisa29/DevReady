import java.util.*;

import static java.lang.Math.*;

public class Algorithms {
    public static List<Double> GetMultiples(double num, int length) {
        List<Double> results = new ArrayList<>();

        for (int i = 1; i <= length; i++) {
            results.add(num * i);
        }

        for (double e : results) {
            System.out.println(e + " ");
        }

        return results;
    }

    public static double[] otherSides(int n) {
        // n, n*2=hypotenuse, (n*2*rad(3))/2 = medium length side
        double hypotenuse = 2 * n;
        double mediumLengthSide = n * sqrt(3);

        String result = String.format("smallerLengthSide: %d, Hypotenuse: %.2f and mediumLengthSide: %.2f%n", n, hypotenuse, mediumLengthSide);
        System.out.print(result);

        return new double[]{hypotenuse, mediumLengthSide};
    }

    public static int warOfNumbers(int[] numbers) {
        int even = 0, odd = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                even += number;
            } else {
                odd += number;
            }
        }
        System.out.println("War of numbers result: " + abs(even - odd));
        return abs(even - odd);
    }

    public static int letterCounter(char[][] arr, char c) {
        int counter = 0;
        for (char[] innerList : arr) {
            for (char letter : innerList) {
                if (letter == c) {
                    counter++;
                }
            }
        }
        System.out.println("Letter " + c + " occurs " + counter + " times.");
        return counter;
    }

    public static boolean isFactorial(int n, int current, int factorial) {
        if (n == factorial) {
            System.out.println(n + " is exactly the factorial of " + current);
            return true;
        }

        if (factorial > n) {
            System.out.println("no factorial");
            return false;
        }

        return isFactorial(n, current + 1, factorial * (current + 1));
    }

    //https://edabit.com/challenge/qSJ5hZfG52Nf2hXWS
    public static int largestGap(int[] numbers) {
        int maxGap = -1;
        Arrays.sort(numbers);

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] - numbers[i - 1] > maxGap) {
                maxGap = numbers[i] - numbers[i - 1];
            }
        }

        System.out.println("MaxGap: " + maxGap);

        return maxGap;
    }


    //https://edabit.com/challenge/NXTrfGBXTKg3Z9jkz
    public static boolean isPandigital(long num) {
        List<Integer> allDigits = new ArrayList<>();
        while (num > 0) {
            allDigits.add(0, (int) (num % 10));
            num /= 10;
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

        for (String s : outputArray) {
            System.out.println(s);
        }
        return outputArray;
    }

    //TO DO: array bidimensional ca parametru si intoarce un array unidimensional cu suma valorilor de pe fiecare linie
    //ex: [[1,2,3,4], [4,1,6,7,8], [4,5], [3,4,4,4,4,4,4,4,4]]
    public static int[] sumArray(char[][] arr) {
        int[] summ = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }

            summ[i] = sum;
        }
        return summ;
    }

    //metoda cu parametru cu array unidimensional si intoarce array bidimensional unde fiecare linie are
    // divizorii numarului din array-ul unidimensional

    // [9,8,2,4,20]
    // [
//            [1, 3, 9]
//            [1,2,4,8]
//            [1,2],
//            [1,2,4]
//            [1,2,4,5,10,20]
    // ]

    public static int[][] divizori(int[] input) {
        int initialCapacity = 3;
        int result[][] = new int[input.length][];
        for (int i = 0; i < input.length; i++) {
            int currentLine[] = new int[initialCapacity];
            int lastPosition = -1;
            for (int j = 1; j <= input[i]; j++) {
                if (input[i] % j == 0) {
                    lastPosition++;
                    if (lastPosition == currentLine.length) {
                        int aux[] = currentLine;
                        currentLine = new int[initialCapacity + lastPosition];
                        for (int x = 0; x < aux.length; x++) {
                            currentLine[x] = aux[x];
                        }
                    }
                    currentLine[lastPosition] = j;
                }
            }
            result[i] = currentLine;
        }
        return result;
    }
}
