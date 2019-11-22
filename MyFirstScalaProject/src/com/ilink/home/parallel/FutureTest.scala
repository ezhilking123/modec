package com.ilink.home.parallel

import scala.concurrent.Future  // this is like the create the separate thread to execute the program parallel \\ asynchronous call to execute the code
import scala.concurrent.ExecutionContext.Implicits.global

object FutureTest extends App {
  
  println("First")
  
  Future{
    println("Inside the Future")
  }
  
  Thread.sleep(10)
  
  println("last")
  
  //readLine()
}

//https://www.youtube.com/watch?v=auQrWAKa3GA&list=PLv-b3Nt-er7A3jf41VRNgmNDVeIIuT0Kv&index=4