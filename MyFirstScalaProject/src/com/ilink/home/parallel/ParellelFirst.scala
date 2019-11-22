package com.ilink.home.parallel

object ParellelFirst extends App {
  
  // Parallel collection program
  
  def fib(value: Int) :Int = if(value < 2) 1 else fib(value-1) + fib(value-2)
  
  //for(i <- 1 to 100)  println(i)
  
//  for(i <- 300 to 15 by -1 )
  
  /*for(i <- (80 to 15 by -1).par )
    println(i+"        --  "+fib(i))
    */
  var i=0
  for(j <- (0 to 100)) {
   
     i += j
    println(j +" - "+ i)
   
  }
  
  println(i)
    
}