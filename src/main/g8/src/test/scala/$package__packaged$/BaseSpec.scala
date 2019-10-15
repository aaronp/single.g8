package $package;format="lower,package"$
package $name;format="lower,word"$

import java.nio.file.{Files, Path, Paths}

import org.scalatest.{BeforeAndAfterAll, Matchers, WordSpec}

abstract class BaseSpec extends WordSpec with Matchers with BeforeAndAfterAll
