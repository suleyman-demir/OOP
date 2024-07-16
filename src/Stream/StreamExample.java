package Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamExample {
    public static void main(String[] args) {
        List<String> isimler = Arrays.asList("Ali", "Zeynep", "Ahmet", "Ayşe", "Beril", "Faruk", "Asel","Halil","Fatih","Süleyman","Ali","");

        List<List<String>> isimler2 =Arrays.asList(
          Arrays.asList("Rıfkı","Suat"),
          Arrays.asList("Ferhan","Tutku")
        );


        List<String> namesStartWithA =isimler.stream()
                .filter(isim -> isim.startsWith("A"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        namesStartWithA.forEach(System.out::println);
        System.out.println("Bu Sorgu Bitti----------------------- ");

        List<String> namesFinishedWithL = isimler.stream()
                .filter(isim1 -> isim1.endsWith("l"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        namesFinishedWithL.forEach(System.out::println);
        System.out.println("Bu Sorgu Bitti----------------------- ");

        isimler.stream()
                .filter(isim2 -> isim2.length()>5)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("Bu Sorgu Bitti----------------------- ");

        isimler.stream()
                .map(String::length)                                        //MAP
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("Bu Sorgu Bitti----------------------- ");




        isimler.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("Bu Sorgu Bitti----------------------- ");                           //SIRALA


        isimler.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);      //TEKRAR EDENİ SİL
        System.out.println("Bu Sorgu Bitti----------------------- ");

        isimler.stream().limit(4).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("Bu Sorgu Bitti----------------------- ");                                           //LİMİT


        isimler
                .stream()
                .skip(4)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("Bu Sorgu Bitti------------------------ ");                      //ATLADIK SKİP


        isimler.stream().reduce((eleman1,eleman2 )->eleman1 +" "+eleman2 )
                .stream()
                .collect(Collectors.toList())                                           //REDUCE
                .forEach(System.out::println);
        System.out.println("Bu Sorgu Bitti----------------------- ");


        Map<Integer,List<String>> gruplama = isimler
                .stream()
                .collect(Collectors.groupingBy(String::length));

        gruplama.forEach((uzunluk ,isimListesi) ->
        System.out.println("Uzunluk : "+uzunluk+" "+"İsimler : "+isimListesi));
        System.out.println("Bu Sorgu Bitti----------------------- ");




        isimler.parallelStream()
                .filter(eleman -> eleman.startsWith("A"))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("Bu Sorgu Bitti----------------------- ");



        isimler.stream()
                .filter(eleman -> eleman.startsWith("S"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("Bu Sorgu Bitti----------------------- ");


        isimler2.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("Bu Sorgu Bitti----------------------- ");


       boolean listedeAliVarMi= isimler.stream()
               .anyMatch(eleman -> eleman.equals("Ali"));
        System.out.println(listedeAliVarMi);

        System.out.println("Bu Sorgu Bitti----------------------- ");


        boolean listedeBosVarMi= isimler.stream()
                .allMatch(eleman -> eleman.equals(""));
        System.out.println(listedeBosVarMi);

        System.out.println("Bu Sorgu Bitti----------------------- ");

        boolean listedeVarMi =isimler.stream()
                .noneMatch(eleman ->eleman.equals("Şükrü"));
        System.out.println(listedeVarMi);

        System.out.println("Bu Sorgu Bitti----------------------- ");

        System.out.println(isimler.stream().findFirst());

        System.out.println("Bu Sorgu Bitti----------------------- ");

        System.out.println(isimler.stream().findAny());

        System.out.println("Bu Sorgu Bitti----------------------- ");

        Stream<Double> rastgeleSayi =Stream.generate(Math::random).limit(5);
        rastgeleSayi.forEach(System.out::println);

        System.out.println("Bu Sorgu Bitti----------------------- ");

        Stream<Integer> ardisikSayilar = Stream.iterate(3, n -> n+3).limit(5);
        ardisikSayilar.forEach(System.out::println);

        System.out.println("Bu Sorgu Bitti----------------------- ");





















    }
}
