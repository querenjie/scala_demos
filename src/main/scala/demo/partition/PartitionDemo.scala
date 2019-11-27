package main.scala.demo.partition

object PartitionDemo {
  def main(args:Array[String]): Unit = {
    val result = List(1,2,3,4,5,6,7,8,9,10).partition(_%2==0);
    println(result)
  }
}
