package com.aslan.models

/**
 * This is the UserMetrics case class. Each worker will take one of these and
 * add it's number to it. The last worker completes it.
 */
case class Information(
          _id:String,
          someInformationOne:Option[Int] = None,
          someInformationTwo:Option[Int] = None,
          someInformationThree:Option[Int] = None,
          someInformationFour:Option[Int] = None
                        )



