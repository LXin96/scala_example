package chapter01

class Student(name:String, age:Int) {
    def printInfo():Unit = {
       println(name + " " + age + " "+Student.school)
    }
}
object Student{
  var school:String = "ttt"

  def main(args:Array[String]):Unit ={
    val marry = new Student("marry", 12)
    val bob = new Student("bob", 14)
    marry.printInfo()
    bob.printInfo()
  }
}


