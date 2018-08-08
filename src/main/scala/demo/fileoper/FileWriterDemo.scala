package demo.fileoper

import java.io.{File, PrintWriter}

/**
  * 写文件的例子
  */
object FileWriterDemo {
  def main(args: Array[String]): Unit = {
    val writer = new PrintWriter(new File("test.txt"))
    writer.write("Hello Scala")
    writer.close()
  }

}
