package Syllabus.Option

object OptionEx extends App {
  def check(a:Int,b:Int)={
    if(b==0){
      None
    }
    else Some(a/b)
  }

println(check(20,5))
}
