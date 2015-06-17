package main

import scala.collection.mutable
import scala.collection.mutable._

/**
 * Created by Administrator on 2015/6/16.
 */
object LED2 {
  val ledBase = Array(
    " _     _  _     _  _  _  _  _ ",
    "|  | | _| _||_||_ |_   ||_||_|",
    "|_| ||_  _|  | _||_|  ||_| _|"
  )
  val ledBaseMap = new HashMap[Integer, List[String]]()
  ledBaseMap.put(1, List("   ", "  |", "  |"))
  ledBaseMap.put(0, List(" _ ", "|  |", "|_|"))
  ledBaseMap.put(2, List(" _ ", " _|", "|_ "))
  ledBaseMap.put(3, List(" _ ", " _|", " _|"))
  ledBaseMap.put(4, List("   ", "|_|", "  |"))
  ledBaseMap.put(5, List(" _ ", "|_ ", " _|"))
  ledBaseMap.put(6, List(" _ ", "|_", "|_|"))
  ledBaseMap.put(7, List(" _ ", "  |", "  |"))
  ledBaseMap.put(8, List(" _ ", "|_|", "|_|"))
  ledBaseMap.put(9, List(" _ ", "|_|", " _|"))
  def num2led(num: Int): String = {
    val tmpList = new Array[String](3)
    for (i <- 0 to 2) {
      tmpList(i) = ""
    }
    for (strDigit <- ("" + num).toCharArray) {
      val iDigit = strDigit.toInt - 48
      val getV = ledBaseMap.get(iDigit).getOrElse(List(" _ ", "|  |", "|_|"))
      for (j <- 0 to 2) {
        tmpList(j) += getV(j)
      }
    }
    tmpList.map( line=>line+"\n").reduce(_+_)
  }
  def main(args: Array[String]) {
    print(num2led(987))
  }
}
