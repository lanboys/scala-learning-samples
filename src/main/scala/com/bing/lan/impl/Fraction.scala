package com.bing.lan.impl

/**
 * Created by backend.
 */

class Fraction(val num: Int, val den: Int) {

  def *(other: Fraction) = {
    println("----1----")
    val fraction = new Fraction(this.num * other.num, this.den * other.den)
    println("----2----")
    fraction
  }

  def +(other: Fraction) = {
    println("----3----")
    val fraction = new Fraction(this.num * other.num, this.den * other.den)
    println("----4----")
    fraction
  }


}

object Fraction {

  implicit def int2Fraction(n: Int) = {
    println("伴生")
    new Fraction(n, 1)
  }

}
