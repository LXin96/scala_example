package chapter05

object Test05_TwoFunciton
{
  def main(args: Array[String]): Unit = {
    val function1: (Int, Int) => Int = (a: Int, b: Int) => a + b
    val function2: (Int, Int) => Int = (a: Int, b: Int) => a - b
    twoFunciton(function1)
    twoFunciton(function2)
  }

  def twoFunciton(func: (Int, Int) => Int): Unit = {
      println(func(1, 2))
  }
}
