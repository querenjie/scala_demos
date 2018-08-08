package demo.regex

import scala.util.matching.Regex

object RegexDemo {
  val findAll = (pattern: Regex, str: String) => {
    println((pattern findAllIn str).mkString(","))
  }

  val replaceFirst = (originalPattern: Regex, replacement: String, originalContent: String) => {
    println("orginal content:" + originalContent)
    var newContent = originalPattern replaceFirstIn(originalContent, replacement)
    println("new content is:" + newContent)
  }

  def main(args: Array[String]): Unit = {
    val pattern = new Regex("(S|s)cala")
    val str = "Scala is scalable and cool"

    findAll( pattern, str )
    println("---------------------------------------------------------------")

    val pattern2 = new Regex("abl[ae]\\d+")
    val str2 = "ablaw2 is able1 abla2 and cool"
    findAll( pattern2, str2 )

    println("---------------------------------------------------------------")
    replaceFirst(pattern, "Java", str)
  }
}
