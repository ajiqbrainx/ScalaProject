package Dec29

object EitherExample extends App{

  def either1(S:String):Either[String,String]={
    if(S.nonEmpty){
      Right(S)
    }
    else Left("The String Is not there")
  }
println(either1("Ajith"))
  println(either1(""))

}
