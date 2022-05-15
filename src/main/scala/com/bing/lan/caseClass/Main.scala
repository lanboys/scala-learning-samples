package com.bing.lan.caseClass

/**
 * Created by backend.
 */
object Main {

  def main(args: Array[String]): Unit = {

    val day: Day = Day(12, 12)
    println(day)

    println("---------1")
    val day2 = Day.apply(1212, 121212)
    println(day2)

    println("---------2")
    val day1 = new Day(12, 12, 22)
  }


}
