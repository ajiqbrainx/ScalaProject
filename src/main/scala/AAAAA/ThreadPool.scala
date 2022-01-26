package AAAAA

import java.util.concurrent.Executors


//object Main {
//  def main(args:Array[String]):Unit = {
//    var runnerA= new Runnable {
//      override def run(): Unit = {
//        for(num <- 1 to 5) {
//          println("A")
//          Thread.sleep(100)
//        }
//      }
//    }
//    var runnerB = new Runnable {
//      override def run(): Unit = {
//        for(num <- 1 to 5) {
//          println("B")
//          Thread.sleep(100)
//        }
//      }
//    }


//    val pool = Executors.newFixedThreadPool(1)
//    pool.execute(runnerA)
//    pool.execute(runnerB)
//  }
//}
//