package com.bing.lan.caseClass

/**
 * Created by backend.
 */
// 看字节码
case class Day(year: Int, var month: Int) {


  var age: Int = 3
  var age1: Int = _

  def this(age1: Int, age12: Int, age123: Int) {
    this(age1, age12)
    println(age12.toString)
    age = age123
  }


}

object Day {
//  def apply(year: Int, month: Int): Day = {
//    println("=========")
//    new Day(year, month+9)
//  }

  implicit def int2Fraction(n: Int) = {
    println("伴生")

  }

}
