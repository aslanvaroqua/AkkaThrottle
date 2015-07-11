package com.aslan
import akka.actor.ActorSystem
import akka.actor.Props
import com.aslan.actors.MasterActor
import com.aslan.models.Start

/// This is a start point. 
object AkkaProject extends App {
  val system = ActorSystem("actorSystem")
  // default Actor constructor
  val master = system.actorOf(Props[MasterActor])
  // START MASTER WORKER
  master ! Start

}