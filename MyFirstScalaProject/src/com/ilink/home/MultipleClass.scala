package com.ilink.home

  class A{
  
  }

  trait AA extends A {
    def m1() : String = "AA class string"
  }

  trait  BB   {
   // def m1() : String = "BB class string"
  }
  
object MultipleClass extends AA with BB {
  
}

