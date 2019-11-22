package com.ilink.home



object Second {
  
  def main(arg : Array[String]){
    
    println(subStr("ezhilarasan selvaraj",3,10))
    
    println("Total Count : "+ "Hello".count(p=> p =='l'))
    println("HelloEzhilarasan".count(_ =='l'))
    
    var variable= "Ezhilarasan"
    
    var subStrValue=subStr("ezhil",1,4)
    
    
   
    
  }

  def subStr(value:String, start: Int, end: Int) : String = value.substring(start, end)
  
  
  

}