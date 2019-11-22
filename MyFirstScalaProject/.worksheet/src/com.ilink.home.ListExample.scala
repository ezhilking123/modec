package com.ilink.home

object ListExample {
  
  case class Student( var stuId:Int = 10, var stuName:String = "Ezhil", var stuAge:Int =40){
  
  	def getMsg() = println("Msg from getMsg() method")
  	
  	//functionKeyWor functionName (argument) : functionReturnType { Code.. }
  	
  	def > (s2:Student) : Boolean = 	stuAge > s2.stuAge
  	
  	def >>> (s2:Student) = println(s2.stuName)
  	
  };import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(424); 
  
  var obj1= new Student(40);System.out.println("""obj1  : com.ilink.home.ListExample.Student = """ + $show(obj1 ));$skip(38); 
  
  var obj2= new Student(130,"Ram");System.out.println("""obj2  : com.ilink.home.ListExample.Student = """ + $show(obj2 ));$skip(28); 
  
  println(obj1.getMsg());$skip(16); val res$0 = 
  
 obj1 > obj2;System.out.println("""res0: Boolean = """ + $show(res$0));$skip(17); 
 
 obj1 >>> obj1;$skip(48); 
 
 println("End of the Class and mehtod test ");$skip(101); 
 
 val list= List(new Student(200,"Ezhilarasan Selvaraj"),2, "Just Stirng", 3.5, new Object(), null);System.out.println("""list  : List[Any] = """ + $show(list ));$skip(16); 
 println (list);$skip(18); val res$1 = 
 
 list.tail.head;System.out.println("""res1: Any = """ + $show(res$1))}
                              
                              
 //var justList= List(22,33,44,55,66,77,88,99,100)
 //justList drop 3 take 2
 
// justList.filter(p => p>50)
 

  
}
