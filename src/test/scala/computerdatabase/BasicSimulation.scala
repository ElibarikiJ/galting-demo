package computerdatabase

import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.http.Predef._
import io.gatling.http.protocol.HttpProtocolBuilder

import scala.concurrent.duration._

class BasicSimulation extends Simulation {

  val httpProtocol: HttpProtocolBuilder = http
    .baseUrl("http://computer-database.gatling.io") // Here is the root for all relative URLs
    .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8") // Here are the common headers
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.8; rv:16.0) Gecko/20100101 Firefox/16.0")

  val scn: ScenarioBuilder = scenario("Scenario Name") // A scenario is a chain of requests and pauses
    .exec(http("Visit Home Page")
      .get("/"))
    .pause(7) // Note that Gatling has recorder real time pauses
    .exec(http("View filter using macbook")
      .get("/computers?f=macbook"))
    .pause(2)
    .exec(http("View computer item by id=6")
      .get("/computers/6"))
    .pause(3)
    .exec(http("Return Home Page")
      .get("/"))
    .pause(2)
    .exec(http("View item 1 in computer list")
      .get("/computers?p=1"))
    .pause(2.milliseconds)
    .exec(http("View item 3 in computer list")
      .get("/computers?p=2"))
    .pause(6.milliseconds)
    .exec(http("re")
      .get("/computers?p=3"))
    .pause(7.milliseconds)
    .exec(http("request_8")
      .get("/computers?p=4"))
    .pause(5)
    .exec(http("request_9")
      .get("/computers/new"))
    .pause(1)
    .exec(http("request_10") // Here's an example of a POST request
      .post("/computers")
      .formParam("""name""", """Beautiful Computer""") // Note the triple double quotes: used in Scala for protecting a whole chain of characters (no need for backslash)
      .formParam("""introduced""", """2012-05-30""")
      .formParam("""discontinued""", """""")
      .formParam("""company""", """37"""))
0
  setUp(scn.inject(atOnceUsers(200)).protocols(httpProtocol))
}
