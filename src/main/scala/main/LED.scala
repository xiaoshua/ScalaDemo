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
      val iDigit = strDigit.toInt - 48
      for (j <- 0 to 2) {
        for (i <- iDigit * 3 to iDigit * 3 + 2) {
          tmpList(j) += ledBase(j).charAt(i).toString()
        }
      }
    }

    var result = ""
    for (line <- tmpList) {
      result += line + "\n"
    }
    result
  }

  def main(args: Array[String]) {
    print(num2led(987))
  }
}
