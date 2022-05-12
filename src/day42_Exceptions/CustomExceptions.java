package day42_Exceptions;

class FadyException extends RuntimeException {


    public FadyException() { // custom unchecked exception
        super("Time for a short break");

    }

    public FadyException(String message) {
        super(message);
    }

}

class NoBreakException extends Exception { //custom checked exception

}


public class CustomExceptions {

    public static void main(String[] args) {

      //  throw new FadyException("it is time for lunch break");
        try {
            throw new NoBreakException();
        } catch (NoBreakException e) {
            e.printStackTrace();
        }


        }

}


/*
1. in order to create Custom unchecked Exception: we should inherit from Runtime Exception class which is parent class of unchecked exceptions
 */