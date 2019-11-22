package com.ilink.home.dao

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf
import java.sql.{Connection, DriverManager, ResultSet}
import org.apache.spark.rdd.JdbcRDD
import org.apache.spark.SparkConf
import com.ilink.home.util.DBConnProp
import com.ilink.home.util.DBConnProp

object SQLRdd extends DBConnProp {
  
    val column="companycode"
    var query="select id, address, basecurr, companycode from company order by "+ column +"  limit ?, ?"
   
  
    def main(args : Array[String]) {
      
    
    Class.forName("com.mysql.jdbc.Driver").newInstance()
    
    
    val conf= new SparkConf().setAppName("JdbcRdd").setMaster("local[2]").set("spark.executor.memory", "2g")
    val sc = new SparkContext(conf)
  
    val myRDD=new JdbcRDD(sc, () => DriverManager.getConnection(dbUrl,u_name,p_word), 
        query,
        3,6,1, r => "ID : "+ r.getString("id") + " - Company Code : " + r.getString("companycode") )
    
    myRDD.foreach(println)
    
    println(myRDD.count())
    
    
  //  myRDD.saveAsTextFile("D:\\files1")
  }
  
}