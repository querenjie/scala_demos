package demo.forif

object ForIfDemo {
  def evenGT5(v:Vector[Int]):Vector[Int] = {
    var result = Vector[Int]()
    for {
      n <- v
      if n > 5
      if n % 2 == 0
    }
    result = result :+ n
    result
  }

  def yielding(v: Vector[Int]):Vector[Int] = {
    val result = for {
      n <- v
      if n < 10
      if n % 2 != 0
    } yield n
    return result
  }

  def main(args: Array[String]): Unit = {
    val v = Vector(1,2,3,5,6,7,8,10,13,14,17)
    val newV = evenGT5(v)
    newV.foreach(n => print(String.valueOf(n) + "\t"))
    println()
    val newV2 = yielding(v)
    newV2.foreach(n => print(String.valueOf(n) + "\t"))
  }
}
