package Syllabus.Try

object TryCatch extends App {
  try {
    val u = 10 / 5
  } catch {
    case x: ArithmeticException => x.printStackTrace()
    case x: NullPointerException => x.getMessage
    case x: Exception => x.printStackTrace()

  }

}
