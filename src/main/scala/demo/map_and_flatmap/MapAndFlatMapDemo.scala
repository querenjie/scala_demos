package demo.map_and_flatmap

object MapAndFlatMapDemo {
  def main(args: Array[String]): Unit = {
    /**--------map对传入的每一个元素进行映射，返回一个处理后的结果(begin)-----------------**/
    //完整版
    val arr1 = Array(1,2,3,4,5).map(x=>2* x)
    arr1.foreach(x => print(x + "\t"))
    println()
    //简写版
    Array(1,2,3,4,5).map(2* _).foreach(x => print(x + "\t"))
    println()
    //foreach对传入的每一个元素都进行处理，但是没有返回值
    (1 to 9 ).map("@"*_).foreach(println(_))
    //filter:对传入的每一个元素都进行条件判断，如果对元素返回true，则保留该元素，否则过滤掉该元素
    val rdd1 = (1 to 20 ).filter(_%2==0)
    rdd1.foreach(x=>{val y=x+"\t";print(y)})
    println()
  }
}