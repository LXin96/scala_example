package chapter07

object Test01_Array {
  def main(args: Array[String]): Unit = {
    val res = new Array[Int](5)

    var res2 = Array(1,2,3,4,5)
    //  不可变数据 增加元素
    res2.:+(6) // 在后面添加

    res2.+:(8) // 在前面添加

    res.sorted(Ordering.Int.reverse) //反向排序

  }
}
