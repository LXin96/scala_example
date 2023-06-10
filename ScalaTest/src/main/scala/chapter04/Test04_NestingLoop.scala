package chapter04

object Test04_NestingLoop {

  // 1。
  for(i<- 1 to 3){
    for(j <- 1 to 3){
       println(i + ", " + j)
    }
  }

  for(i <- 1 to 4; j<- 1 to 4){
     println(i + "," +j )
  }

  for{
    i <- 1 to 10
    j = 10 - i
  }{
    println("oooo")
  }

  val value: IndexedSeq[Int] = for (i <- 1 to 10) yield i

}
