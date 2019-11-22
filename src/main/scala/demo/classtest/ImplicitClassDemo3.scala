package main.scala.demo.classtest

object ImplicitClassDemo3 {
  //定义一个隐式转换的方法，能够把double类型转换成为int类型
  implicit def double2Int(a: Double) = {
    println("invoke double2Int with parameter a = " + a)
    a.toInt
  }

  implicit def int2Double(a: Int) = {
    println("invoke int2Double with parameter a = " + a)
    a.toDouble
  }

  //定义3个方法
  def sum1(x:Int, y:Int) = x + y
  def sum2(x:Int, y:Double) = x + y
  def sum3(x:Double, y:Double) = x + y

  def main(args: Array[String]): Unit = {
    println(sum1(1,2.0))  //这个会涉及到自定义的隐式转换
    println(sum2(1,2))  //这个不会涉及到自定义的隐式转换，可能Int可以自动转Double是scala的内定规则
    println(sum3(1,2))  //这个不会涉及到自定义的隐式转换，可能Int可以自动转Double是scala的内定规则
  }
}
