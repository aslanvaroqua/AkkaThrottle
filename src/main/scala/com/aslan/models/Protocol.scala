package com.aslan.models

/**
 * These are messages that contain steps and allow the process to go
 * from master to actor back to master and back down the line.
 */
case object Start
case class StepOne(information:Information)
case class StepTwo(information:Information)
case class StepThree(information:Information)
case class StepFour(information:Information)
case class Complete(information:Information)

