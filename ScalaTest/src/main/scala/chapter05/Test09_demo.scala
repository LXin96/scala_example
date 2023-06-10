package chapter05

import java.util.concurrent.locks.Condition

object Test09_demo {

  def myWhile(condition: =>Boolean):(=>Unit)=>Unit={
     def doLoop(op: =>Unit):Unit = {
       if(condition){
          op
          myWhile(condition)(op)
       }
     }
    doLoop _
  }

}
