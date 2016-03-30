name := "spark-ssh-shell"

organization := "com.iqiyi.uaa"

version := "1.0"

scalaVersion := "2.10.5"

scalacOptions ++= Vector("-unchecked", "-deprecation", "-Ywarn-all")

javacOptions ++= Vector("-encoding", "UTF-8")

retrieveManaged := true

libraryDependencies ++= {
  Seq(
    "org.clapper" %% "grizzled-slf4j" % "1.0.2",
    "org.slf4j" % "slf4j-simple" % "1.6.4",
    "org.bouncycastle" % "bcprov-jdk16" % "1.46",
    "org.apache.sshd" % "sshd-core" % "0.6.0",
        "org.apache.spark" %% "spark-core" % "1.6.0" % "provided",
        "org.apache.spark" %% "spark-catalyst" % "1.6.0" % "provided",
        "org.apache.spark" %% "spark-sql" % "1.6.0" % "provided",
        "org.apache.spark" %% "spark-hive" % "1.6.0" % "provided",
        "org.apache.spark" %% "spark-repl" % "1.6.0" % "provided",
        "org.apache.hadoop" % "hadoop-client" % "2.5.0-cdh5.2.0" % "provided"
  )
}
