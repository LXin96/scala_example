package chapter02

import scala.io.StdIn

object Test_Stdln {
  def main(args: Array[String]): Unit = {
    println("输入大名：")
    val str = StdIn.readLine()
    println("输入年龄")
    val i = StdIn.readInt()
    println(s"欢迎 ${str} 来到")
  }
}
