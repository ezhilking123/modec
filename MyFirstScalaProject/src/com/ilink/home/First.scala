package com.ilink.home

object First {
 
  def  main(args: Array[String]){
    
    println(add(10,20))
    
    var subValue=sub(12,10)
    println("Substration Value of Two Numbers : "+subValue)
    
    
    var variableName: Int =10 
    variableName=variableName+10;
    val valValue: Int = 20
    //valValue=valValue+20  Reassignment is not possible in variable type is val and it is immutable data type.
    
     var MAX_RESULT_COLS = Option(40,20)
     println(MAX_RESULT_COLS)
    
  }
  
  def add(a:Int, b:Int) : Int = a+b
  
  def sub(a:Int, b:Int) : Int = a-b
  
  
  
}

/*
 * 
 * object Demo {
   def main(args: Array[String]) {
      val alice = new Person("Alice", 25)
      val bob = new Person("Bob", 32)
      val charlie = new Person("Charlie", 32)
   
      for (person <- List(alice, bob, charlie)) {
         person match {
            case Person("Alice", 25) => println("Hi Alice!")
            case Person("Bob", 32) => println("Hi Bob!")
            case Person(name, age) => println(
               "Age: " + age + " year, name: " + name + "?")
         }
      }
   }
   case class Person(name: String, age: Int)
}
 * */
 