ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.7"

lazy val root = (project in file("."))
  .settings(
    name := "Scala Projects"
  )

// https://mvnrepository.com/artifact/io.spray/spray-json
libraryDependencies += "io.spray" %% "spray-json" % "1.3.6"


