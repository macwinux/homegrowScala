scalaVersion := "2.12.11"
name := "collection"
organization := "macwinux"
version := "1.0"
triggeredMessage := Watched.clearWhenTriggered
initialCommands in console := "import homegrown.collections._"
addCommandAlias("testc", ";clean;coverage;test;coverageReport")
libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "3.0.5" % "test",
    "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2"
)