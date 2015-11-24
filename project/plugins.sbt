logLevel := Level.Warn
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.3.3")

resolvers += Classpaths.sbtPluginReleases
addSbtPlugin("org.scoverage" % "sbt-coveralls" % "1.0.0")