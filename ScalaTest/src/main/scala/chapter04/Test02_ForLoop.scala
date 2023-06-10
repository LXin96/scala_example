package chapter04

object Test02_ForLoop {
  def main(args: Array[String]): Unit = {
     // 1 范围遍历
     for(i <- 1 to 10){
        println(i + ". hello word")
     }

    // 不包含range 边界
    for(i <- Range(1,10)){
       println(i + ". hello word")
    }

    for(i<- 1 until 10){
      println(i+" . hello word")
    }

    // 集合遍历
    for(i <- Array(12,34,53)){
       println(i)
    }








  }
}
