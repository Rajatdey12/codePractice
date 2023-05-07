package se8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class StreamFunctions {

    public static void main(String[] args) {

        //STREAM OF COLLECTION
        Collection<String> data = Arrays.asList("a","1","c","2");

        List<Integer> intList = Arrays.asList(1,2,3,5,6);

        System.out.println(data == null || data.isEmpty() ? Stream.empty() : data);

        //STREAM OF ARRAY
        Stream<Integer> intDataInArray = Stream.of(1,2,3,5,4);
        System.out.println(intDataInArray.count());

        //STREAM BUILDER APPROACH
        Stream<String> streamBuilder =
                Stream.<String>builder().add("a").add("b").add("c").build();
        System.out.println(streamBuilder.findFirst());


        //STREAM GENERATED
        Stream<String> streamGenerated =
                Stream.generate(() -> "el1").limit(10);
        System.out.println(streamGenerated.count());
        streamGenerated.forEach(e -> {
            System.out.println(e);
        });

        //ORDER OF EXECUTION OF STREAM
        Long newData = data.stream().map(el -> {
            return el.toLowerCase(Locale.ROOT);
        }).skip(3).count();


        intList.stream().map(e -> {
            System.out.println(e);
            return e;
        });
    }


}
