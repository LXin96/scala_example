package chapter05

object Test02_FuncitonParameter {
  // 1 可变参数
  def f1(str:String*):Unit = {
    println(str)
  }

  def f2(str: String, str1:String*): Unit = {
    println(str)
  }
  def main(args: Array[String]): Unit = {
    f1("string","str","strd")
  }

  //2、如果可变参数列表存在多个参数，那么可变参数一般放置在最后


}
