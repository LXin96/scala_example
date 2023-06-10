package chapter05

object Test06_HighFunction {
  def main(args: Array[String]): Unit = {
     def f(str:String, sint:Int):Unit ={
       println(str + "..." + sint)
     }
    // 1、函数作为值进行传递 但是 f1 和 f 对象的函数的地址是不一样的
    var f1 = f _

    // 2、函数作为参数进行传递

  }
}
