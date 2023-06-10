package chapter05

object Test08_ControlAbstraction {
  // 1、 传值抽象
  def f1(a:Int):Int={
    println("调用f1")
    12
  }
  // 2、传名抽象，传递的不再是具体的值，而是代码块 那么下面的a就是代码块 调用几次a 那么就会调用几次f1
  // =>Int 代表 传递的是输入为int代码块
//  调用f1
//  a: 12
//  调用f1
//  a: 12
  def f2(a: =>Int):Unit={
    println("a: " + a)
    println("a: " + a)
  }

  def main(args: Array[String]): Unit = {
     f2(f1(1))
  }

}
