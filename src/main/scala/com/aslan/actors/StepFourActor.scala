package com.aslan.actors

import akka.actor.{Props, ActorSystem, Actor}
import com.aslan.models.{Information, Complete}

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global


/**
 * Actor that completes some act.
 */
class StepFourActor extends Actor {

  def receive = {
    case account:Information => {
      val number:Int = 1
      sender ! Complete(Information(account._id, account.someInformationOne, account.someInformationTwo, account.someInformationThree, account.someInformationFour, Some(number)))

    }
  }
}