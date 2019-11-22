package com.ilink.home

object ListExample {
  
  case class Student( var stuId:Int = 10, var stuName:String = "Ezhil", var stuAge:Int =40){
  
  	def getMsg() = println("Msg from getMsg() method")
  	
  	//functionKeyWor functionName (argument) : functionReturnType { Code.. }
  	
  	def > (s2:Student) : Boolean = 	stuAge > s2.stuAge
  	
  	def >>> (s2:Student) = println(s2.stuName)
  	
  }
  
  var obj1= new Student(40)
  
  var obj2= new Student(130,"Ram")
  
  println(obj1.getMsg())
  
 obj1 > obj2
 
 obj1 >>> obj1
 
 println("End of the Class and mehtod test ")
 
 val list= List(new Student(200,"Ezhilarasan Selvaraj"),2, "Just Stirng", 3.5, new Object(), null)
 println (list)
 
 list.tail.head
                              
                              
 //var justList= List(22,33,44,55,66,77,88,99,100)
 //justList drop 3 take 2
 
// justList.filter(p => p>50)
 

  
}