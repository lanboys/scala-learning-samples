package com.bing.lan.impl

/**
 * Created by backend.
 */
object Prama {


  def sum(a: Int)(implicit num: Int): Int = { //隐式参数放入到普通函数中
    a + num
  }

}
