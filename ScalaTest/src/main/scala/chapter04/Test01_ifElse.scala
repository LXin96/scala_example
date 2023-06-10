package chapter04

import scala.io.StdIn

object Test01_ifElse {
  def main(args: Array[String]): Unit = {
     println("请输入你的年龄")
     val age:Int = StdIn.readInt()
    if(age > 0){
       println("age 大于 0")
    }else{
       println("age 小于 0")
    }

    var res = if(age > 0) "大于0" else "小于0"
    println(res)

  }

}
