package main.scala.demo.exceptiontest

import scala.util.{Failure, Success, Try}

object ExceptionDemo2 {
  def divideBy(x:Int, y:Int): Try[Int] = {
    Try(x / y)
  }


  def main(args: Array[String]): Unit = {
    divideBy(2,0) match {
      case Success(i) => println(s"Success, value is: $i")
      case Failure(s) => println(s"Failed, message is: $s")
    }

    println(divideBy(1,0).getOrElse(0))   //如果出错就给出默认值0
    println(divideBy(1,1).getOrElse(0))   //如果出错就给出默认值0

    val result = (50 to 55).zip(0 to 5).map(pair=>divideBy(pair._1, pair._2).getOrElse(0))
    println(result)

    for (i <- 1 until 10 reverse; if i % 2 == 0) {
      println(i)
    }
  }
}
