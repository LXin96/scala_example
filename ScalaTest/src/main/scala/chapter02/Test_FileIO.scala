package chapter02

import java.io.{File, PrintWriter}
import scala.io.Source

object Test_FileIO {
  def main(args: Array[String]): Unit = {
     //1、从文件中读取数据
    Source.fromFile("./Test_Identifier.scala").foreach(print)

    // 2
    val writer = new PrintWriter(new File(""));
    writer.write("ssss")
    writer.close()
  }
}
