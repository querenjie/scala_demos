package demo.fileoper

import scala.io.Source

object FileReaderDemo {
  def main(args: Array[String]): Unit = {
    val filePath = "D:\\idea_workspace\\scala-examples\\Demos\\test.txt"
    println("以下打印的是文件中的内容：")
    Source.fromFile(filePath).foreach{
      print
    }
  }
}
