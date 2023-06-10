package chapter04

import scala.language.postfixOps

object Test03_LoopGuard {
  def main(args: Array[String]): Unit = {
     for(i <- 1 to 10 if i % 2 ==0){
        println(i)
     }

    // 循环步长
    for(i<-1 to 10 by 2){
      println(i)
    }
    println("-----------------------")
    //反转遍历
    for (i <- 1 to 10 by 2 reverse) {
      println(i)
    }
  }
}
