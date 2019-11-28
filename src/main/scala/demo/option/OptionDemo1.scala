package main.scala.demo.option

/**
  * Scala Option(选项)类型用来表示一个值是可选的（有值或无值)。
  * Option[T] 是一个类型为 T 的可选值的容器： 如果值存在， Option[T] 就是一个 Some[T] ，如果不存在， Option[T] 就是对象 None 。
  */
object OptionDemo1 {
  def main(args: Array[String]): Unit = {
    val myMap: Map[String, String] = Map("key1"->"value")
    val value1: Option[String] = myMap.get("key1")
    val value2: Option[String] = myMap.get("key2")
    println("myMap.get(\"key1\")=" + value1+"\tvalue1.get="+value1.get)
    println("myMap.get(\"key2\")="+ value2)
    if (value2 == None) {
      println("value2 no value")
    }
  }
}
