package com.bing.lan.impl

import java.io.File
import com.bing.lan.impl.Conversions.RichFile
//import com.bing.lan.impl.Conversions.RichFile._


/**
 * Created by backend.
 */
object MainFile {

  def main(args: Array[String]): Unit = {

    new RichFile(new File("eee")).read

    val a: Int = new File("xxx").read

    val b: Int = new File("xxx").read2

  }

}
