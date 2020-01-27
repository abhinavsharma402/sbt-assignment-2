name := "project-sample"
version := "1.0.0"
scalaVersion := "2.12.6"

import sbt._
import Keys._

object MyBuild extends Build{
  
  lazy val root = project.in(file(".")).aggregates(welcome-impl,utils)

  lazy val welcome-impl = project
      .settings(libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.0" % "test" ).dependsOn(utils)

  lazy val utils = project



}

