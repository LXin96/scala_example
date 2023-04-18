package chapter01

/**
 * object：关键字 声明一个单例对象（伴生对象）
 */
object HelloWord {
  /**
   * main方法：从外部可以直接调用执行的方法
   * def 方法名称(参数名称：参数类型)：返回值类型 ={
   *    方法体
   * }
   * Unit是空返回类型
   * @param args
   */
    def main(args: Array[String]):Unit = {
      println("hello word")
      System.out.print("hello form java")
    }
}
