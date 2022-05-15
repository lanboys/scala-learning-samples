package com.bing.lan.clazz

/**
 * Created by backend.
 */
private class Dog {


  private var privateAge: Int = 19

  def age(): Int = {
    privateAge
  }

  def age_=(newValue: Int): Unit = {
    privateAge = newValue
  }


}
