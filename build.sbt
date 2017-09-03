lazy val commonSettings = Seq(
  organization := "com.feynmanliang",
  version := "0.1.0",
  scalaVersion := "2.12.3"
)

val catsVersion = "1.0.0-MF"
lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "cats-logo",
    libraryDependencies ++= Seq(
      "org.typelevel" %% "cats-core" % catsVersion,
      "org.typelevel" %% "cats-laws" % catsVersion,
      "org.typelevel" %% "cats-free" % catsVersion
    )
  )

