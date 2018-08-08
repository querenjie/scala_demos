package demo.map

object MapDemo {
  def concat(map1:Map[String, String], map2:Map[String, String]): Unit = {
    // use two or more Maps with ++ as operator
    var colors = map1 ++ map2
    println( "colors1 ++ colors2 : " + colors )

    // use two maps with ++ as method
    colors = map1.++(map2)
    println( "colors1.++(colors2)) : " + colors )

  }

  val printKeyAndValue = (map: Map[Any, Any]) => {
    for (key <- map.keys) {
      println("key=" + key + "\tvalue=" + map(key))
    }
  }

  def main(args: Array[String]): Unit = {
    val colors:Map[Any, Any] = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")
    val nums:Map[Int, Int] = Map()
    println( "Keys in colors : " + colors.keys )
    println( "Values in colors : " + colors.values )
    println( "Check if colors is empty : " + colors.isEmpty )
    println( "Check if nums is empty : " + nums.isEmpty )
    println("-----------------------------------------------------------------------")
    val colors1 = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")
    val colors2 = Map("blue" -> "#0033FF", "yellow" -> "#FFFF00", "red" -> "#FF1111")
    concat(colors1, colors2)
    println("-----------------------------------------------------------------------")
    printKeyAndValue(colors)
  }
}
