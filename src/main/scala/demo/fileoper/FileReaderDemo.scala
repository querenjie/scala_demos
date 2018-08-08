package demo.fileoper

import scala.io.Source

object FileReaderDemo {
  def main(args: Array[String]): Unit = {
    println("Following is content read:")
    Source.fromFile("test.txt").foreach{
      print
    }
  }
}
