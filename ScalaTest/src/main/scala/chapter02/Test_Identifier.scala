package chapter02

object Test_Identifier {
  def main(args: Array[String]): Unit = {
    // 1 以字母或者下划线开头 后接字母、数字、下划线
    var hello:String = ""
    var hello123:String = "11"

    //以操作符开头 且只包含操作符
    var +/+ = "222"
    println(+/+)

    // 反引号包括任何字符
    var `if` = "eee"
    println(`if`)

    //
    println("4"*3)

    println(s"${`if`}的具体结果和${+/+}一样")

    val sql ="""
      |select * from
      |student
      |where id = 10
      |and age > 100
      |""".stripMargin
    println(sql)

  }
}
