package chapter05

object Test03_simplify {
  def main(args: Array[String]): Unit = {
    var fu = (name: String) => {
      println(name)
    }
    fu("hhhhh")

    // 定义一个函数，将函数作为参数输入
    def test(func:String => Unit): Unit = {
        func("套娃")
    }

    test(fu)
  }

}
