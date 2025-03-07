package sttp.tapir.sbt

import sbt._

trait OpenapiCodegenKeys {
  lazy val openapiSwaggerFile = settingKey[File]("The swagger file with the api definitions.")
  lazy val openapiPackage = settingKey[String]("The name for the generated package.")
  lazy val openapiObject = settingKey[String]("The name for the generated object.")

  lazy val generateTapirDefinitions = taskKey[Unit]("The task that generates tapir definitions based on the input swagger file.")
}

object OpenapiCodegenKeys extends OpenapiCodegenKeys
