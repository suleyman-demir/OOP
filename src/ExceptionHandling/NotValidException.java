package ExceptionHandling;


    public class NotValidException extends RuntimeException {
        public NotValidException(String mesaj) {
            super(mesaj);
        }
    }

