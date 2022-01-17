package Jan10

object RunnableAndThread extends App {

  class ThreadEx extends Thread {
    override def run(): Unit = {
      Thread.sleep(100)
      println("Thread =>"+Thread.currentThread().getName)
    }
  }

  class RunnableEx extends Runnable {
    override def run(): Unit = {
      println(Thread.currentThread().getName)
    }
  }

  val thread = new Thread(new ThreadEx, "Thread1")
  thread.start()

  val runnable = new Thread(new RunnableEx,"Runnable1")
  runnable.start()
  Thread.sleep(100)

val multi = for(i<- 1 to 5){
  val thread1=new Thread(new ThreadEx())
  thread1.setName(i.toString)
  thread1.start()
}

}
