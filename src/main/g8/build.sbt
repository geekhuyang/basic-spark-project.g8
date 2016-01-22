name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.10.4"


libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.1" % "test",
  "org.scalacheck" %% "scalacheck" % "1.10.0" % "test",
  "org.apache.spark" %% "spark-core" % "1.4.1" % "provided",
  "org.apache.spark" %% "spark-streaming" % "1.3.1" % "provided",
  "org.apache.spark" %% "spark-sql" % "1.3.1" % "provided",
  "org.apache.spark" %% "spark-hive" % "1.3.1" % "provided",
  "org.apache.spark" %% "spark-mllib" % "1.3.1" % "provided",
  "org.apache.spark" %% "spark-graphx" % "1.3.1" % "provided",
  "org.apache.hadoop" % "hadoop-client" % "2.5.2" % "provided",
  "com.github.scopt" % "scopt_2.10" % "3.3.0"
)


initialCommands := "import $organization$.$name;format="lower,word"$._"

