package com.ilink.home.av.exercise

import scala.util.{Try,Success,Failure}

object ImplicitUse {
  
  class Address(streetName:String)
  
  
  def main(arg : Array[String]){
    
    implicit val addressObject=new Address("godhavariStreet")
    
    implicit val name="iLinkSystem"
    
    def getStr(implicit fName:String, sName:String, add: Address) {
      println("Value of getStr() method : "+fName+"-"+sName+"-"+add)
    }
    
    getStr
   
    
    getStr("a","b",addressObject)
    
    
    
    val value:String = "Ezhilarasan"
    println(value.take(3))
    
    val x = toInt("1")
     val x1 = toInt("foo")
     val x2 = toInt("1").getOrElse(0)
     
     // Success
   val y = divideXByY(1, 1).getOrElse(0)
    
    // Failure
   val y1 = divideXByY(1, 0).getOrElse(0)
    
  }
  
  
  def toInt(s: String): Option[Int] = {
    try {
        Some(Integer.parseInt(s.trim))
    } catch {
        case e: Exception => None
    }
}
  
  def divideXByY(x: Int, y: Int): Try[Int] = {
    Try(x / y)
}
  
}