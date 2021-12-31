package Dec31


  class Cricketer(val age:Int,val name:String)

  object Main extends App{

    val cricketer=new Cricketer(12,"dhoni")

    val cricketer1=new Cricketer(12,"virat")

    val cricketer2=new Cricketer(12,"dhoni")

    println(cricketer.equals(cricketer2))

    println(cricketer.eq(cricketer2))

    println(cricketer==cricketer2)

  }

