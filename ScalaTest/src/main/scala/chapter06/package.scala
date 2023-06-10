package object chapter06 {
  // 定义当前包共享的属性和方法
  val commonValue = "ccccc"
  def  commMethod():Unit ={
    println("ssss")
  }

  /**
   * 1)和java一样，可以在顶部使用import导入，在这个文件中的所有类型都可以使用
   * 2）局部导入：什么时候使用，什么时候导入，在其作用域范围内都可以使用
   * 3）通配符导入：import java.util._
   * 4) 给类起别名：在导包的时候 import java.util.{ArrayList=>JL}
   * 5) 导入相同包的多个类:import java.util.{HashSet,ArrayList}
   * 6）屏蔽类：import java.util.{ArrayList=>_,_}
   * 7)scala默认导入分别是：
   *  import java.lang
   *  import scala._
   *  import scala.Predef_
   */



}
