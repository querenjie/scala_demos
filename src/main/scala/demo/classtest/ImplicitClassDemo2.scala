package demo.classtest

object ImplicitClassDemo2 {
  implicit class IntTimes(x: Int) {
    def times[B](f1: =>B) {
      def loop(current: Int): Unit ={
        if(current > 0){
          f1
          loop(current - 1)
        }
      }
      loop(x)
    }

  }

  def main(args: Array[String]): Unit = {
    5 times println("hello")
  }
}
