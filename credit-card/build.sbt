
// The simplest possible sbt build file is just one line:

scalaVersion := "2.13.3"
name := "credit-card"
organization := "macwinux"
version := "1.0"
libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2"
triggeredMessage := Watched.clearWhenTriggered