package com.bing.lan.switchMatch

/**
 * Created by backend.
 */
object Main {


  def main(args: Array[String]): Unit = {
    tran('+')
    tran('-')
    tran('9')
    tran1('9')


    val PP: Int = 4
    var PPP: Int = tran1('9')


    println(PPP)

  }


  def tran(ch: Char): Int = {
    var sign: Int = 4

    ch match {
      case '+' => sign = 1
      case '-' => sign = -1
      case _ =>
        println("------- " + _)
        sign = 0
    }

    println(sign)
    sign


  }

  val ppo: Int = 5
  val Chh: Int = 5

  def tran1(ch: Char): Int = {
    var sign: Int = 4

    ch match {
      case _ if Character.isDigit(ch) =>
        sign = Character.digit(ch, 10)
        println("------1- ")
      case '+' =>
        sign = 1
        println("------2- ")
      case '-' =>
        sign = -1
        println("------3- ")
      case Chh =>
        println("------- " + Chh)
        sign = 0
      case `ppo` =>
      case ppo =>

    }

    println(sign)
    sign
  }



}
