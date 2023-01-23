name := """scalasoup"""
organization  := "com.flurdy"
description := "A Scala wrapper of JSoup HTML testing"

scalaVersion := "2.13.6"

version := "0.1.2"
versionScheme := Some("semver-spec")

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
homepage := Some(url("https://github.com/flurdy/scalasoup"))
publishMavenStyle := true
pomIncludeRepository := { _ => false }

publishTo := Some("GitHub Flurdy Apache Maven Packages" at "https://maven.pkg.github.com/flurdy/scalasoup")
credentials += Credentials(
  "GitHub Package Registry",
  "maven.pkg.github.com",
  "flurdy",
  System.getenv("GITHUB_TOKEN")
)

libraryDependencies += "org.jsoup" % "jsoup" % "1.12.2"
