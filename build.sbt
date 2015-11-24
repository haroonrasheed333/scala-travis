import _root_.sbtassembly.AssemblyPlugin.autoImport._

name := "scala-travis"

version := "1.0"

scalaVersion := "2.11.7"

assemblyJarName in assembly := "ScalaTravis.jar"

organization := "org.haroon"

libraryDependencies ++= Seq(
  "org.apache.spark" 	% 	"spark-core_2.10"       % "1.5.1"	        % "provided",
  "org.apache.spark"  % 	"spark-mllib_2.10"      % "1.5.1"	        % "provided",
  "org.scalatest" 	  %%	"scalatest" 		        %	"3.0.0-SNAP5"	  % "test",
  "org.scalaz"		    %%	"scalaz-core"		        %	"7.2.0-M2",
  "com.typesafe"      %   "config"                % "1.3.0"
)

resolvers ++= Seq(
  "Akka Repository"         at "http://repo.akka.io/releases/",
  "Sonatype OSS Snapshots"  at "http://oss.sonatype.org/content/repositories/snapshots/",
  "Typesafe Releases"       at "http://repo.typesafe.com/typesafe/releases/"
)


