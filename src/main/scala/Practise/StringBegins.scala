package Practise

object StringBegins extends App {
def string1(x:String): String ={
  if(x.startsWith("If"))x
    //StartsWith = In method is used to Start with particular you mentioned
  else "If"+x
}
  println(string1("Ifelse"))

  println(string1("If else"))

}
