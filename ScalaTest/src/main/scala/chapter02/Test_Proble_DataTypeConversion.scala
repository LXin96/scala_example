package chapter02

object Test_Proble_DataTypeConversion {

  /**
   * Int类型，占据4个字节 32位
   * 原码： 0000 0000 0000 0000 0000 0000 1000 0010
   * 补码： 0000 0000 0000 0000 0000 0000 1000 0010
   *
   * toByte强转后 截取最后一个字节
   * 得到补码 1000 0010
   * 对应原码 （有符号位 符号位不变） 1111 1110 那么这个就是-126
   *
   * @param args
   */
  def main(args: Array[String]): Unit = {
     var a:Int=128
     var b:Byte = a.toByte
     println(b)
  }

}
