package day42_Exceptions;

import day39_Recap.shapeTask.Rectangle;

import java.util.NoSuchElementException;

public class ThrowKeyword2 {

    public static void main(String[] args) {

     throw new NoSuchElementException("No such Element");
      //  throw new InterruptedException(); //unchecked exception

       // System.out.println("hello world");

     //   throw new Rectangle(5,7); // not throwable(exception)

    }
}
