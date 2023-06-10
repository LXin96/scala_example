package chapter05

object Test11_LazyScala {
  def main(args: Array[String]): Unit = {
     lazy val result:Int = sum(13,47)

    println("1. 函数调用")
    println("2. result = " + result)
    println("4. result = " + result)

  }
  def sum(i: Int, i1: Int):Int = {
    println("3. sum调用")
    i + i1
  }
}
