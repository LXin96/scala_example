package chapter02

import chapter01.Student

import scala.collection.generic.BitOperations

object Test_Varaible {
  def main(array: Array[String]):Unit = {
    var a:Int = 10;
    // (1) 声明变量时候，类型可以省略，编译器自动推导，即类型推倒
    var a1 = 10;
    val a2 = 23;

    // (2)确定类型后，就不能修改，说明Scala是强数据类型
    // a1 = "String"

    //(3) 变量声明时，必须要有初始值
    // var a3 :Int
    var bob = new Student("bob", 23)

    // 底层是assic码
    var c: Char = '2'

    var isTrue:Boolean = true


  }
}
