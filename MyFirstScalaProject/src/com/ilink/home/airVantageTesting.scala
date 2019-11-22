package com.ilink.home

import java.sql.Date
import java.util.Formatter.DateTime
import java.text.SimpleDateFormat

object airVantageTesting {
  
  
  case class Driver(id: Integer=10, name: String="",startTime: SimpleDateFormat)
  
  
  case class Book(id: String="10", name : String="Scala", author: String="ezh")
  
  // equals, hash code & toString
      
  def main(arg : Array[String]){
    
    val driverObject=Driver(10,"ezhil",new SimpleDateFormat("12/12/2019 10:12"))
    
    println(driverObject)
    
      val bookObj = Book("10")
      println(bookObj)
      
      
      val obj2=Book()
      val obj3=bookObj.copy("12");
      
      obj3  match {
        case bookObj => println("true")
        case _ => println("false")
      }
      
      
      
  }
  
  
  
}