package com.bing.lan.clazz


/**
 * Created by backend.
 */
object Main {

  def main(args: Array[String]): Unit = {
    val cat = new Cat()
    cat.age
    cat.age = 9
    cat.age_=(9)


    val dog = new Dog()
    dog.age()
    dog.age_=(9)

    val pig = new Pig(12, 11)
    pig.age
    pig.age_=(9)
    pig.getAge
    pig.setAge(4)


  }


  private var value = 0

  def increment(): Unit = {
    value += 1;
  }

  def current = value

  def current1: Int = {
    value
  }

  def current2(): Int = {
    value
  }
}