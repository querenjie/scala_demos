package main.scala.demo.zip

object ZipDemo {
  def main(args: Array[String]): Unit = {
    val result = List(1, 2, 3).zip(List("a", "b", "c"));
    println(result)
  }
}
