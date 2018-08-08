package demo.list

object ListDemo {
  def main(args: Array[String]): Unit = {
    var mul1 = List.tabulate( 4 , 5 )( _ - _ )
    println( "mul1 : " + mul1  )
    var mul2 = List.tabulate( 4 , 5 )( _ + _ )
    println( "mul2 : " + mul2  )
    var mul3 = List.tabulate( 4 , 5 )( _ * _ )
    println( "mul3 : " + mul3  )
  }
}
