package com.ilink.home.av.exercise

object MethodTst  {
  
  case class Address(doorNo : String="10", streetName: String="Godhavari St")
  
  def main(arg : Array[String]){
   
     val reportParameters = Map ("aa" -> "Arul", "ss" -> "Sankar") 
      
     val obj=new Address()
    
    
    
    
  }
  
  
 // override def enrich(reportParameters: Map[String, Any])(implicit sparkSession: SparkSession): (Map[String, Dataset[_]], StatContainer) = {
 
  
  def enrich(reportParameters: Map[String, Any], secondParameter:Int)(implicit address: Address) : List[String] = {
     return null
  }
  
    
  def enrich(reportParameters: Map[String, Any])(implicit sparkSession: Address): (Map[String, String]) = {    
    val mapList = Map( "f" -> "1", "s"-> "2" )
    return mapList
  }
  
  
}


abstract class OverrideTst{
  def enrich()
 }