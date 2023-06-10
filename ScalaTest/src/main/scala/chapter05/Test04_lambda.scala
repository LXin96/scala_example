package chapter05

object Test04_lambda {

  def f(func:String=>Unit): Unit = {
     func("sss")
  }
   // 匿名函数的简化原则
   // （1） 参数的类型可以省略，会根据形参进行自动推导

  f((name) =>{
     println(name)
   })

  // (2) 类型省略后，发现只有一个参数，则圆括号可以省略，其他情况，没有从那火速和参数超过1的原用不能省略圆括号
  f(name=>{
    println(name)
  })

  // (3)  匿名函数如果只有一行，则打括号也可以省略
  f(name => println(name))

  //(4) 如果参数只出现一次，则参数省略且后面的参数可以用_代替
  f(println(_))

  //(5) 如果可以推断出，当前传入的println是一个函数体，而不是调用语句，则可以直接省略下划线
  f(println)

}
