package com.bing.lan.impl

import com.bing.lan.impl.Conversions._
//import com.bing.lan.impl.Conversions
//import com.bing.lan.impl
import com.bing.lan.impl.Fraction._

/**
 * 隐式转换
 */
object Main {

  //  implicit def int2Fraction(n: Int) = {
  //    println("作用域")
  //    new Fraction(n, 1)
  //  }

  def main(args: Array[String]): Unit = {

    val value = new Fraction(4, 5) * 3
    val value2 = 4 * new Fraction(4, 5)

    // 隐式参数
    println(Prama.sum(10)) //20
  }


  implicit var num: Int = 10 //定义一个Int类型的隐式参数
  implicit val num1: Int = 102 //定义一个Int类型的隐式参数

}