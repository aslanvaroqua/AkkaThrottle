import sbt._
import sbt.Keys._

object akkathrottleBuild extends Build {

  lazy val akkathrottle = Project(
    id = "akkathrottle",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "akkathrottle",
      organization := "com.aslan",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.11.6"
      // add other settings here
    )
  )
}
