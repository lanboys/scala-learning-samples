package com.bing.lan

//包可以包含类、对象和特质，但不能包含函数或变量的定义 很不幸，这是Java虚
//拟机的局限性 把工具函数或常量添加到包而不是某个Utils 对象，这是更加合理的做法
//包对象的出现正是为了解决这个局限性
package object pkg {


  private var privateAge: Int = 19

  def age(): Int = {
    privateAge
  }

  def age_=(newValue: Int): Unit = {
    privateAge = newValue
  }

}


package pkg {


  class Pdkg {

  }
}

