package Syllabus.PatternCaseClass

abstract class CompanyCode

case class ScalaCode(scala: String, php: String, developer: String) extends CompanyCode

case class JavaCode(java: String, reactJs: String, developer: String) extends CompanyCode

case class PythonCode(python: String, angular: String, developer: String) extends CompanyCode


object Main1 extends App{

  def codeCheck(a:CompanyCode): Unit ={
   a match {
     case ScalaCode(scala, php, _) => println(s"Your code is $scala and your using $php & Your Developer name is")
     case JavaCode(java, reactJs, developer) => println(s"Your code is $java and your using $reactJs & Your Developer name is $developer")
     case PythonCode(python, angular,developer) =>  println(s"Your code is $python and your using $angular & Your Developer name is $developer")
   }
  }

  codeCheck(ScalaCode("Scala","Php","Aji"))
  codeCheck(JavaCode("Java","React","Ashok"))
  codeCheck(PythonCode("Python","anugular","Abi"))

}