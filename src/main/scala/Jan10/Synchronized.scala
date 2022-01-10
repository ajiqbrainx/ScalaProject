package Jan10

object Synchronized extends App {
  val runnable: Runnable = () =>{
    for(i<- 1 to 5){
      println(s"[${Thread.currentThread().getName}]$i + 5 =${i + 5} ")
      Thread.sleep(100)
    }
  }
  new Thread(runnable,"Ajith1").start()
  new Thread(runnable,"Ashok2").start()

}
