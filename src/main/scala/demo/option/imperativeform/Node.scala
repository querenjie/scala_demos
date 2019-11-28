package main.scala.demo.option.imperativeform

/**
  * 用命令式的编程方式实现二叉树的左右子树交换
  * 与函数式编程的思想相比不同的是：命令式编程允许原来的变量内容被改变，在本例子中即原来的树结构被改变。
  *          1
  *        /   \
  *       2     3
  *      / \   / \
  *     4   5 6   7
  * 左右子树交换后：
  *          1
  *        /   \
  *       3     2
  *      / \   / \
  *     7   6 5   4
  *
  * @param value
  * @param left
  * @param right
  */
class Node(var value:Int, var left:Option[Node], var right:Option[Node])  //此处只是声明一个class

/**
  * 在伴生对象中用到class类型的Node
  * 伴生对象中可以定义main方法，但class中不行。
  */
object Node {
  /**
    * 递归方式交换左右子树
    * @param root
    */
  def invertTree(root: Option[Node]):Unit = {
    if (root isDefined) {
      val left = root.get.left
      val right = root.get.right
      root.get.left = right
      root.get.right = left
    }
    if (root.get.left isDefined) {
      invertTree(root.get.left)
      invertTree(root.get.right)
    }
  }

  /**
    * 先根遍历方式打印树
    * @param root
    */
  def traverse(root: Option[Node]): Unit = {
    if (root isDefined) {
      print(root.get.value+"\t")
      traverse(root.get.left)
      traverse(root.get.right)
    }
  }

  def main(args: Array[String]): Unit = {
    val node4 = new Node(4, None, None)
    val node5 = new Node(5, None, None)
    val node6 = new Node(6, None, None)
    val node7 = new Node(7, None, None)
    val node2 = new Node(2, Some(node4), Some(node5))   //如果变量类型是Option，给它赋值时需要用Some
    val node3 = new Node(3, Some(node6), Some(node7))
    val node1 = new Node(1, Some(node2), Some(node3))

    println("before invert(先根遍历):")
    traverse(Some(node1))
    println()

    invertTree(Some(node1))

    println("after invert(先根遍历):")
    traverse(Some(node1))
    println()
  }

}
