package chapter06

import scala.beans.BeanProperty

object Test01_Class {

}

class Student {
   private var name:String = "alice"
   // 这个注解可以帮助生成 get和set方法
   @BeanProperty
   var age:Int = _    // 这个_在int这个对象的默认为 0
   var sex:String = _ //这个_在string这个对象的默认值为 null
}
