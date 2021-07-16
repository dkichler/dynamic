name := "dynamic"
organization := "com.github.reugn"

scalaVersion := "2.13.6"
crossScalaVersions := Seq("2.11.12", "2.12.8", scalaVersion.value)

libraryDependencies ++= Seq(
    "org.scala-lang" % "scala-reflect" % scalaVersion.value,
    "com.softwaremill.quicklens" %% "quicklens" % "1.7.4",
    "org.scalatest" %% "scalatest" % "3.2.9" % Test
)

scalacOptions := Seq(
    "-target:11",
    "-unchecked",
    "-deprecation",
    "-feature",
    "-encoding", "utf8",
)

licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))
