import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "todo-list"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    jdbc,
    "postgresql" % "postgresql" % "9.1-901.jdbc4",
    anorm
  )


  val main = play.Project(appName, appVersion, appDependencies).settings(
  )

}
