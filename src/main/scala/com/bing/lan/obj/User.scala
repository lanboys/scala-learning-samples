package com.bing.lan.obj

/**
 * Created by backend.
 */
object User extends Person {

  override def undo(): Unit = {

    println("undo...")
  }
}

abstract class Person {
  def undo()
}
