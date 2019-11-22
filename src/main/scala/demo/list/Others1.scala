package demo.list

object Others1 {
  def main(args: Array[String]): Unit = {
    /*
    reduceLeft：从左侧元素开始，进行reduce操作，
    及先对元素1和元素2进行处理，将结果与元素3进行处理，以此类推，
    即为reduce
     */
    val a = (1 to 4).reduceLeft(_*_)        //等同于1*2*3*4
    println("a=" + a)
  }
}
