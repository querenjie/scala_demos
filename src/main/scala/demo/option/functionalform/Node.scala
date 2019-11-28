package main.scala.demo.option.functionalform

/**
  * 用函数式的编程方式实现二叉树的左右子树交换
  * 与命令式编程的思想相比不同的是：函数式式编程不会改变原来的树结构，而是返回一棵新的树结构。
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
class Node(val value: Int, val left: Option[Node], val right: Option[Node])

object Node {
  /**
    * 递归方式交换左右子树
    * 在函数式编程中，原来的变量是不可变的，必须组装一棵新的树返回出来
    * @param root
    * @return       返回一棵新的树
    */
  def invertTree(root: Option[Node]): Option[Node] = {
    if (root isDefined) {
      return Some(new Node(root.get.value, invertTree(root.get.right), invertTree(root.get.left)))
    } else {
      None
    }
  }

  /**
    * 先根遍历方式打印树
    * @param root
    */
  def traverse(root: Option[Node]): Unit = {
    if (root isDefined) {
      print(root.get.value + "\t")
      if (root.get.left isDefined) {
        traverse(root.get.left)
      }
      if (root.get.right isDefined) {
        traverse((root.get.right))
      }
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

    val newTree = invertTree(Some(node1))

    println("after invert(先根遍历):")
    traverse(newTree)
    println()
  }
}