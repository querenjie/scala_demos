package demo.array

import Array._
object ArrayDemo {
  val method1 = () =>{
    var myMatrix = ofDim[Int](3,3)
    //build a matrix
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        myMatrix(i)(j) = j
      }
    }
    //print two dimensional array
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        print(" " + myMatrix(i)(j))
      }
      println()
    }

  }

  private def concatArray(arr1: Array[Float], arr2: Array[Float]): Array[Float] = {
    return concat(arr1, arr2)
  }

  private val showArray = (arr: Array[Float]) => {
    for (x <- arr) {
      print(x + " ")
    }
    println()
  }

  def main(args: Array[String]): Unit = {
    var myList = Array(1.9, 2.9, 3.4, 3.5)
    for (x <- myList) println(x)
    var total = 0.0
    for (i <- 0 to (myList.length - 1)) total += myList(i)
    println("Total is: " + total)
    var max = myList(0)
    for (i <- 0 to (myList.length - 1)) {
      if (max < myList(i)) max = myList(i)
    }
    println("Max is: " + max)
    method1()
    var myArray1: Array[Float] = Array(1.1f, 2.2f, 3.3f, 4.4f)
    var myArray2: Array[Float] = Array(5.5f, 6.6f, 7.7f, 8.8f)
    var myArray3 = concatArray(myArray1, myArray2)
    showArray(myArray3)
  }
}
