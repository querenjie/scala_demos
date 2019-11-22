package demo.exceptiontest

import java.io.{FileNotFoundException, FileReader, IOException}

object ExceptionDemo {
  def main(args: Array[String]) {
    try {
      val f = new FileReader("input.txt") //此处没有这个文件，即将触发异常。
    } catch {
      case ex: FileNotFoundException => {
        println("Missing file exception")
      }
      case ex: IOException => {
        println("IO Exception")
      }
    } finally {
      println("Exiting finally...")
    }

  }
}
