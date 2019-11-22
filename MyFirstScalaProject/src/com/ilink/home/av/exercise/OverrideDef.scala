package com.ilink.home.av.exercise

object OverrideDef extends Base {
  
  def main(arg : Array[String]){
    
    println(dis("a"))
  }
  
  //override must be declared when we are going to override from base class methods
    override def dis(implicit value: String){
  
    println("Msg from Base class Override method : "+ value)
  }
  
  
}



class Base{
  
  def dis(implicit value: String){
   
    println("display the msg from Base method : ")
  }
}