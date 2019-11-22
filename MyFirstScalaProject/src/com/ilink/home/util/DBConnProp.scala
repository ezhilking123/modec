package com.ilink.home.util

import java.sql.{ Connection,DriverManager}

abstract class DBConnProp {
  
  
    val dbUrl: String = "jdbc:mysql://localhost:3306/ilinksystem?useSSL=false"
    val u_name: String ="root"
    val p_word: String ="admin123"
     
    val conn= () => DriverManager.getConnection(dbUrl,u_name,p_word)
 
    
}