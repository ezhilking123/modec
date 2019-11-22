package com.ilink.home.av.exercise

object TuplesTst {
  
  def main(arg : Array[String]){
    
    var t1=new Tuple2(1,"Ezhil")
    
    println(t1._2)
    
    var t2=new Tuple3(1,"Ezhil", Console)
    
    
    val list = List(1,3,5,7,9,11,4,23)
    
    val (t3,t4) = list.partition(p => p<=8)
    
    t3.sorted.foreach(println)
    println("--------------------")
    t4.foreach(println)    
    
    
     val t5 = list.partition(p => p<=8)
     
     println(t5._1)
     println(t5._2)
     
     val t6 = list.partition(p => p<=8)
     
  }
}