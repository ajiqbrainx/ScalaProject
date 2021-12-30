package Dec29

object EitherUsingMatch extends App{
def multiplication(x:Int,y:Int):Either[String,Int]={
  if(x==0 || y==0){
    Left("Zero is mulitple with some number is 0")
  }
  else Right(x*y)
}

  println(multiplication(2,4))
  println(multiplication(2,0))
  println(multiplication(0,4))


  //Either using the Match case
val x=multiplication(3,4)
  x match {
    case Right(r)=>println(r)
    case Left(l)=>println(l)
  }

}

