package chapter03

object Test_operator {
  def main(args: Array[String]): Unit = {
    var result:Double = 10.0 / 3
    println(result.formatted("%.2f"))
  }
  //scala 中 == 其实是调用了java的equals方法
  // eq 是比较引用地址 是否相等
}
