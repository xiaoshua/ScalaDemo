import _root_.sbt.Keys._

name := "ScalaDemo"

version := "1.0"

scalaVersion := "2.10.5"


libraryDependencies ++= {
  Seq(
    "org.specs2"          %%  "specs2-core"   % "2.3.11" % "test"
  )
}