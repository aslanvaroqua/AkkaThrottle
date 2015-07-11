name := """akkathrottle"""

version := "1.0"

scalaVersion := "2.10.2"

libraryDependencies ++= Seq(
  "com.typesafe.akka" % "akka-contrib_2.10" % "2.3.12",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test",
  "junit" % "junit" % "4.12" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test",
  "org.reactivemongo" %% "reactivemongo" % "0.11.1",
  "org.slf4j" % "slf4j-api" % "1.7.2")

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")


fork in run := true
