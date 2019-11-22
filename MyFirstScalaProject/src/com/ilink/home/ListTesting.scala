package com.ilink.home

object ListTesting {
  
  def main(arg : Array[String]){
  
    
    var list = (1 to 50).toList
    
    
    
  //  println(list)
    
    
    println(list.filter(p => p%2==0).map(p=> p*2).reduce((a,b) => a + b))
    
    
    list.filter(_ %2==0).map(_ *2).reduce(_ + _)
    
    
    println(list.filter(_ %2==0).map(_ *2).reduce(_ + _))
    
  }
  
  
}