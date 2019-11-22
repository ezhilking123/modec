package com.ilink.home.av.exercise

object Common {
  
  def main(arg : Array[String]){
    
    
      val a:Option[String] = Some("iLink Systems")
      val b:Option[Int] = None 
      
      println("a.getOrElse(0): " + a.getOrElse(0) )
      println("b.getOrElse(10): " + b.getOrElse(10) )
      
      
      val lamFunction= (a: String, b:String) => (a+b).take(4).takeRight(2)
      
      println(lamFunction("ezhil","king"))
      
      
      
       val reportParameters = Map ("aa" -> "Arul", "ss" -> "Sankar") 
      
       val reportType = reportParameters.getOrElse("aa", Nil).toString
       val reportType1 = reportParameters.getOrElse("rrr", Nil).toString
       
       println("-- > "+reportType +" : "+ reportType1)
      
      
  }
}