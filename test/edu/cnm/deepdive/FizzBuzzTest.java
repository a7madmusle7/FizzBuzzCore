package edu.cnm.deepdive;

import static edu.cnm.deepdive.FizzBuzz.BUZZ;
import static edu.cnm.deepdive.FizzBuzz.FIZZ;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

  static final String FIZZ_BUZZ = FIZZ+BUZZ;

 @Test
  void fizzBuzzValue(){
   String actual;

   actual  = FizzBuzz.fizzBuzzValue(3);
   assertEquals(FIZZ, actual);

 }

}
