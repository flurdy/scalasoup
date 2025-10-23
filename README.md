# ScalaSoup

A simple Scala wrapper around JSoup

* https://jsoup.org/
* https://github.com/flurdy/scalasoup

### Usage

* Expose a GitHub Personal Token (classic) that has GitHub Packages read permission as `GITHUB_TOKEN`.

   ```
   resolvers += "GitHub Flurdy packages" at "https://maven.pkg.github.com/flurdy/_"

   credentials += Credentials(
      "GitHub Package Registry",
      "maven.pkg.github.com",
      "_",
      System.getenv("GITHUB_TOKEN")
   )

   libraryDependencies += "com.flurdy" %% "scalasoup" % "0.1.2" % Test
   ```

License: MIT

---
