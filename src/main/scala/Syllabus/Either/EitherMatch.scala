package Syllabus.Either

object EitherMatch extends App{
  def multiply(a:Int,b:Int)={
    if(a==0 || b==0){
      Left("It is not Multiple by 0 ")
    }
    else Right(a*b)
  }
println(multiply(1,2))
  println(multiply(0,10))
  println(multiply(10,0))

  multiply(2, 0) match {
    case Left(value) =>println( "It is  0")
    case Right(a) => println(a)
  }

}
