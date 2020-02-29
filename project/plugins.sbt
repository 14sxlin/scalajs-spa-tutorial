// repository for Typesafe plugins
resolvers += "Typesafe Releases" at "https://repo.typesafe.com/typesafe/releases/"
resolvers += "jfrog" at "https://dl.bintray.com/playframework/sbt-plugin-releases/"
resolvers += Resolver.url("bintray" ,url("https://dl.bintray.com/sbt/sbt-plugin-releases/"))(Resolver.ivyStylePatterns)

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.32")

addSbtPlugin("com.typesafe.sbt" % "sbt-less" % "1.1.2")

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.3.3")

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.8.1")

addSbtPlugin("com.vmunier" % "sbt-web-scalajs" % "1.0.11-0.6")
//0.6 的话要加后缀 1.0.8-0.6
//
addSbtPlugin("com.typesafe.sbt" % "sbt-digest" % "1.1.3")

addSbtPlugin("com.typesafe.sbt" % "sbt-gzip" % "1.0.2")

addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "1.0.0")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.10.0-RC1")
