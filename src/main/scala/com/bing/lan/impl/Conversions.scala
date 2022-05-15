package com.bing.lan.impl

/**
 * Created by backend.
 */
object Conversions {


  implicit def int2Fraction(n: Int) = {
    println("导包")
    new Fraction(n, 1)
  }

  import java.io.File

//  不能作为顶级类 所以放这里 放包对象就很合适
  implicit class RichFile(val from: File) extends AnyVal {

    def read(): Int = {
      println("read file name: " + from.getName)
      90
    }

    def read2(): Int = {
      println("read2 file name: " + from.getName)
      90
    }

  }

  object RichFile {

    implicit def javaFile2RichFile(from: File): RichFile = {
      println("伴生")
      new RichFile(from)
    }

  }
}
