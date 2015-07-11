package com.aslan.actors

import akka.actor.Actor
import com.aslan.models.{StepFour, Information}

/**
 * Actor that completes some act.
 */
class StepThreeActor extends Actor {

  def receive = {
    case account:Information => {
          /// COUNT PINS HERE
          val number:Int = 1
          sender ! StepFour(Information(account._id, account.someInformationOne, account.someInformationTwo, account.someInformationThree, Some(number)))
        }

    }

}