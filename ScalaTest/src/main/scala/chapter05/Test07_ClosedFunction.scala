package chapter05

object Test07_ClosedFunction {

  // 闭包：如果一个函数，访问到了它的外部（局部变量）的值，那么这个函数和它所处的环境称为闭包'
  // 函数柯里化：把一个参数列表的多个参数，变成多个参数列表

  def func(i:Int):String=>(Char=>Boolean)={
    def f1(s:String):Char=>Boolean={
      def f2(c:Char):Boolean={
        if(i==0 && s=="" && c =='0') false else true
      }
      f2
    }
    f1
  }


  def addcurring(x:Int)(y:Int):Int ={
    x+y
  }
}
