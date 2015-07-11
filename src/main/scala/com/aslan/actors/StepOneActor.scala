package com.aslan.actors

import akka.actor.Actor
import com.aslan.models.{Information, StepTwo}

/**
 * Actor that completes some act.
 */
class StepOneActor extends Actor {

  def receive = {
    case account:Information => {
          val number:Int = 1
          sender ! StepTwo(Information(account._id, Some(number)))
    }
  }
}