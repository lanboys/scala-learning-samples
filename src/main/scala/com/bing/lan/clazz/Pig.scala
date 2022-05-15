package com.bing.lan.clazz

import scala.beans.BeanProperty

/**
 * Created by backend.
 */
class Pig {

  @BeanProperty var age: Int = 19

  println(age.toString) // 类似于主构造方法里面的代码

  def this(age1: Int, age12: Int) {
    this()
    println(age12.toString)
    age = age1
  }

  println("---------") // 类似于主构造方法里面的代码

}
