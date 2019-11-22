package com.ilink.home.av.exercise

import org.apache.spark.sql._


object Loops {
  
  def main(arg : Array[String]){
    
    for (i <- 1 to 10)
      println(i)
      
    val list= Array(1, 2, 3, 4, 10)    
    for(j <- list) println (" - "+j)
    
    for(j <- list  if j!=4; if j<7 )
        println(j)
        
        
         // var a = 0;
      val numList = List(1,2,3,4,5,6,7,8,9,10);

      // for loop execution with a yield
      var retVal = for{ a <- numList if a != 3; if a < 8 } yield a+2

      // Now print returned values using another loop.
      for( a <- retVal){
         println( "Value of a: " + a );
      }
  }
  
  
    def enrich(reportParameters: Map[String, Any]) = {
  
   }
    
   def addInt( a:Int, b:Int ) : Int = {
      var sum:Int = 0
      sum = a + b
      return sum
   }
     
   
   def addInt1( a:Int, b:Int ) : Int = {
      var sum:Int = 0
      sum = a + b
      return sum
   }
      
   def addInt2( a:Int, b:Int ) {
      var sum:Int = 0
      sum = a + b
   } 
      
   def addInt4( a:Int, b:Int ) { a + b }

   val data= (a:Int, b:Int) => a+b


   //Unit is equvalent Void
   def printMe( ) : Unit = {
      println("Hello, Scala!")
   }
   
    def printMe1( )  = {
      println("Hello, Scala!")
   }

   
   
}