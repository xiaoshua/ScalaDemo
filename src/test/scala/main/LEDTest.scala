package main

import org.specs2.mutable.Specification


class LEDTest extends Specification with LED {

  "led test" should {

    "fool test" in {
      1 mustEqual(1)
    }

    "10 test" in {
      num2led(10) mustEqual("    _ \n"+
                            "  || |\n"+
                            "  ||_|\n") //
    }

    "987 test" in {
        num2led(987) mustEqual(
          " _  _  _ \n" +
          "|_||_|  |\n" +
          " _||_|  |\n")
    }
  }

}
