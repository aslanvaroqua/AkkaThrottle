package com.aslan.actors

import akka.actor.Actor
import com.aslan.models.{Information, StepThree}
/**
 * Actor that completes some act.
 */
class StepTwoActor extends Actor {

  def receive = {
    case account:Information => {
        //COUNT PINS HERE
        val number:Int = 1
        sender ! StepThree(Information(account._id, account.someInformationTwo, Some(number)))
    }
  }
}