package test;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeSum {


        public static boolean isPrime(int i) {
            IntPredicate isDivisible = index -> i % index == 0;
            return i > 1 && IntStream.range(2, i).noneMatch(isDivisible);
        }

        public static void main(String[] args)
        {

            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 20,23);
            // Prime number
            System.out.println(numbers.stream()
                    .filter(PrimeSum::isPrime)
//                    .reduce(0, Integer::sum)
                    .collect(Collectors.toList()));
        }

}
