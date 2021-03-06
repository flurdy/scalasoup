name := """scalasoup"""
organization  := "com.flurdy"
description := "A Scala wrapper of JSoup HTML testing"

scalaVersion := "2.13.1"

version := "0.1.1"

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

resolvers += Resolver.jcenterRepo

libraryDependencies += "org.jsoup" % "jsoup" % "1.12.2"
