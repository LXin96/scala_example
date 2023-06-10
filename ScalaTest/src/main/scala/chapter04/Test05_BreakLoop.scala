package chapter04

import scala.util.control.Breaks

object Test05_BreakLoop {

  def main(args: Array[String]): Unit = {
    Breaks.breakable(
      for (i <- 1 to 10) {
        if (i == 3)
          Breaks.break()
        println(i)
      }
    )
  }




}
