package com.aslan.actors

import akka.actor.{Actor, Props, ActorSystem}
import akka.contrib.throttle.Throttler.SetTarget
import akka.contrib.throttle.Throttler.RateInt
import akka.contrib.throttle.TimerBasedThrottler
import com.aslan.models._
import scala.concurrent.duration._

/**
 * The master actor delegates work to it's children.
 */
class MasterActor extends Actor {
  val system = ActorSystem("actorSystem")
  var y = 0

  // ALL THE WORKERS -> EACH COMPLETES ONE TASK
  val stepOneActor = system.actorOf(Props[StepOneActor])
  val stepTwoActor = system.actorOf(Props[StepTwoActor])
  val stepThreeActor = system.actorOf(Props[StepThreeActor])
  val stepFourActor = system.actorOf(Props[StepFourActor])

  // The throttler for this example, setting the rate
  val throttler = system.actorOf(Props(classOf[TimerBasedThrottler],
    100 msgsPer 1.seconds))

  def receive = {
    case Start => {
     var x = 0
      // Set the target for the throttler
     throttler ! SetTarget(Some(stepOneActor))
      //
      while (x < 100000) {
        throttler ! Information(util.Random.nextInt().toString)
        x = x + 1
      }

    }

    case stepTwo:StepTwo => {
      println("Completed Step One")
      stepTwoActor ! stepTwo.information
    }

    case stepThree:StepThree => {
      println("Completed Step Two")
      stepThreeActor ! stepThree.information
    }

    case stepFour:StepFour => {
      println("Completed Step Three")
      stepFourActor ! stepFour.information
    }

    case complete:Complete => {
      println("complete")
    }
  }
}