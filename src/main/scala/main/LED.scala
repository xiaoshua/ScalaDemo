package main

/**
 * Created by Administrator on 2015/6/16.
 */
trait LED {
  val ledBase = Array(
    " _     _  _     _  _  _  _  _ ",
    "| |  | _| _||_||_ |_   ||_||_|",
    "|_|  ||_  _|  | _||_|  ||_| _|"
  )

  def num2led(num: Int): String = {

    val tmpList = new Array[String](3)
    for (i <- 0 to 2) {
      tmpList(i) = ""
    }

    for (strDigit <- ("" + num).toCharArray) {
      val iDigit = strDigit.toInt
      for (j <- 0 to 2) {
        tmpList(j) += ledBase(j).substring(iDigit * 3, iDigit * 3 + 3)
      }
    }
    tmpList.map(line => line + "\n").reduce(_ + _)
  }

}
