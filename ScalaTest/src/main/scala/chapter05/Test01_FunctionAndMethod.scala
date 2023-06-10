package chapter05

object Test01_FunctionAndMethod {
  def main(args: Array[String]): Unit = {
//    def sayhi(name: String):Unit = {
//        println(name + " say hi")
//    }
     sayhi("alice")
  }

  def sayhi(name: String): Unit = {
    println(name + " say Hi")
  }


}
