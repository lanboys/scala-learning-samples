package com.bing.lan.obj

/**
 * Created by backend.
 */
//class Accounts {
//
//  var lastNumber = 0
//  println("初始化1")
//
//  def add1() = {
//    lastNumber += 3
//    println("add 1")
//    lastNumber
//    Accounts.add()
//  }
//}

private object Accounts {

  var lastNumber = 0
  println("初始化2")

  def add() = {
    lastNumber += 1
    println("add 2")
    lastNumber
  }
}

