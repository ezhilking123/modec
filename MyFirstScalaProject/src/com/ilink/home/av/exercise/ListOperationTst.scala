package com.ilink.home.av.exercise

object ListOperationTst {

  def main(arg: Array[String]) {

    val list = List(1, 2, 3, 7, 12, 32, 1, 45, 1)

    //.filter($"timestamp".between($"onTimestamp", $"offTimestamp"))

    val list1 = list.filter(p => p > 1 && p < 10).map(p => p.toString()).reduce(_ + _)

    println(list1)

    val mapViewCols = Seq("trip_id", "timestamp", "lat", "lon", "speed", "speed_limit", "speed_status", "speed_status_sub_type",
      "speed_segment_duration", "speed_segment_id", "comm_status", "comm_segment_id", "mileage")

    println(mapViewCols)
    
  }
  
}