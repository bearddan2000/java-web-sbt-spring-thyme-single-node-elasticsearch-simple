lazy val root = (project in file("."))
  .settings(
  // Project name (artifact name in Maven)
  name := "(java-cli-sbt)",

  // orgnization name (e.g., the package name of the project)
  organization := "example",

  version := "1.0-SNAPSHOT",

  // project description
  description := "SpringBoot Project",

  // Do not append Scala versions to the generated artifacts
  crossPaths := false,

  // This forbids including Scala related libraries into the dependency
  autoScalaLibrary := false,

  libraryDependencies ++= Seq(
    "org.springframework.boot" % "spring-boot-starter-web" % "2.5.4",
    "org.springframework.boot" % "spring-boot-starter-thymeleaf" % "2.5.4",
    "org.springframework.boot"%"spring-boot-starter-data-elasticsearch"%"2.5.4",
    "org.projectlombok"%"lombok"%"1.18.8"
   ),

  mainClass := Some("example.Main")
)
