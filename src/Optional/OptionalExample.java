package Optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional <String> optionalGirdi = Optional.of("Hello");

        System.out.println(optionalGirdi.get());


        String normalGirdi=null;



        Optional<String> optionalGirdi2 = Optional.ofNullable("");

        optionalGirdi2=Optional.ofNullable("test edildiii");



        Optional<String> optionalGirdi3 = Optional.ofNullable(normalGirdi);
normalGirdi.length();
optionalGirdi.orElse("").length();


        Optional<String> optionalGirdi4 = Optional.empty();



        String bosGirdi=optionalGirdi4.orElseGet(()-> "Lambda DEfault döner");
        System.out.println("sonn"+bosGirdi);


        Optional<String> filtrelenmis = optionalGirdi2.filter(deger -> deger.startsWith("t"));
        filtrelenmis.ifPresent(System.out::println);



        Optional <String> optionalGirdi5 =  metodum("e3423");

        if (optionalGirdi5.isPresent()) {
            System.out.println(optionalGirdi5.get());
        }

        optionalGirdi5.ifPresent((item)->{
            System.out.println(item);
        });

        String[] result = new String[1];
        optionalGirdi5.ifPresent((item)->{
            System.out.println(item);
            result[0] = item;
        });






    }

    public static Optional<String> metodum( String parametrem){
        if(parametrem.length()>5){
            return Optional.of(parametrem);
        }else {
            return Optional.empty();
        }





    }
}
