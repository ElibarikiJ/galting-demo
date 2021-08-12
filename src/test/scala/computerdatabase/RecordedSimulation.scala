package computerdatabase

import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.http.Predef._
import io.gatling.http.protocol.HttpProtocolBuilder

class RecordedSimulation extends Simulation {

	val httpProtocol: HttpProtocolBuilder = http
		.baseUrl("https://api.lsf.bluefindigital.co.tz")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-GB,en;q=0.9,en-US;q=0.8,sw;q=0.7")
		.originHeader("https://sharepoint-lsf.web.app")
		.userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.101 Safari/537.36")

	val headers_0 = Map(
		"Access-Control-Request-Headers" -> "authorization,content-type",
		"Access-Control-Request-Method" -> "POST",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "cross-site")

	val headers_1 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Content-Type" -> "application/json",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "cross-site",
		"authorization" -> "Bearer",
		"sec-ch-ua" -> """ Not;A Brand";v="99", "Google Chrome";v="91", "Chromium";v="91""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_2 = Map(
		"Access-Control-Request-Headers" -> "authorization",
		"Access-Control-Request-Method" -> "GET",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "cross-site")

	val headers_5 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "cross-site",
		"authorization" -> "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwczpcL1wvYXBpLmxzZi5ibHVlZmluZGlnaXRhbC5jby50elwvYXBpXC9sb2dpbiIsImlhdCI6MTYyODEzNTExMCwiZXhwIjoxNjI4MTM4NzEwLCJuYmYiOjE2MjgxMzUxMTAsImp0aSI6ImZiT01zRHk0YnhZRHBnTWsiLCJzdWIiOjIsInBydiI6IjIzYmQ1Yzg5NDlmNjAwYWRiMzllNzAxYzQwMDg3MmRiN2E1OTc2ZjcifQ.uVSO0pRGUyTSjj__ts9ItioNr1dq49DLmm9C5LTUtPI",
		"sec-ch-ua" -> """ Not;A Brand";v="99", "Google Chrome";v="91", "Chromium";v="91""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_6 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Content-Type" -> "application/json",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "cross-site",
		"authorization" -> "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwczpcL1wvYXBpLmxzZi5ibHVlZmluZGlnaXRhbC5jby50elwvYXBpXC9sb2dpbiIsImlhdCI6MTYyODEzNTExMCwiZXhwIjoxNjI4MTM4NzEwLCJuYmYiOjE2MjgxMzUxMTAsImp0aSI6ImZiT01zRHk0YnhZRHBnTWsiLCJzdWIiOjIsInBydiI6IjIzYmQ1Yzg5NDlmNjAwYWRiMzllNzAxYzQwMDg3MmRiN2E1OTc2ZjcifQ.uVSO0pRGUyTSjj__ts9ItioNr1dq49DLmm9C5LTUtPI",
		"sec-ch-ua" -> """ Not;A Brand";v="99", "Google Chrome";v="91", "Chromium";v="91""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_32 = Map(
		"Access-Control-Request-Headers" -> "authorization,content-type",
		"Access-Control-Request-Method" -> "PUT",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "cross-site")

	val headers_38 = Map(
		"Access-Control-Request-Headers" -> "authorization",
		"Access-Control-Request-Method" -> "DELETE",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "cross-site")

	val headers_39 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "cross-site",
		"authorization" -> "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwczpcL1wvYXBpLmxzZi5ibHVlZmluZGlnaXRhbC5jby50elwvYXBpXC9yZWZyZXNoIiwiaWF0IjoxNjI4MTM1MTEwLCJleHAiOjE2MjgxMzg4MzEsIm5iZiI6MTYyODEzNTIzMSwianRpIjoiQmpiN0FkVTJ3aTgzVFNESyIsInN1YiI6MiwicHJ2IjoiMjNiZDVjODk0OWY2MDBhZGIzOWU3MDFjNDAwODcyZGI3YTU5NzZmNyJ9.75rAqZcKuB-NqYG73cy-45hSqsrU6gtm4DyyvR31A2Y",
		"sec-ch-ua" -> """ Not;A Brand";v="99", "Google Chrome";v="91", "Chromium";v="91""",
		"sec-ch-ua-mobile" -> "?0")



	val scn: ScenarioBuilder = scenario("RecordedSimulation")
		.exec(http("request_0")
			.options("/api/login")
			.headers(headers_0)
			.resources(http("request_1")
			.post("/api/login")
			.headers(headers_1)
			.body(RawFileBody("computerdatabase/recordedsimulation/0001_request.json")),
            http("request_2")
			.options("/api/dashboard")
			.headers(headers_2),
            http("request_3")
			.options("/api/inheritance/reports")
			.headers(headers_0),
            http("request_4")
			.options("/api/legal-case/status/report")
			.headers(headers_0),
            http("request_5")
			.get("/api/dashboard")
			.headers(headers_5),
            http("request_6")
			.post("/api/inheritance/reports")
			.headers(headers_6)
			.body(RawFileBody("computerdatabase/recordedsimulation/0006_request.json")),
            http("request_7")
			.post("/api/legal-case/status/report")
			.headers(headers_6)
			.body(RawFileBody("computerdatabase/recordedsimulation/0007_request.json"))))
		.pause(7)
		.exec(http("request_8")
			.options("/api/filter/regions")
			.headers(headers_2)
			.resources(http("request_9")
			.options("/api/filter/regions")
			.headers(headers_2),
            http("request_10")
			.options("/api/reports/paralegal-units")
			.headers(headers_0),
            http("request_11")
			.get("/api/filter/regions")
			.headers(headers_5),
            http("request_12")
			.get("/api/filter/regions")
			.headers(headers_5),
            http("request_13")
			.post("/api/reports/paralegal-units")
			.headers(headers_6)
			.body(RawFileBody("computerdatabase/recordedsimulation/0013_request.json"))))
		.pause(31)
		.exec(http("request_14")
			.options("/api/paralegal-units")
			.headers(headers_2)
			.resources(http("request_15")
			.options("/api/districts")
			.headers(headers_2),
            http("request_16")
			.options("/api/regions")
			.headers(headers_2),
            http("request_17")
			.options("/api/districts")
			.headers(headers_2),
            http("request_18")
			.options("/api/zones")
			.headers(headers_2),
            http("request_19")
			.options("/api/regions")
			.headers(headers_2),
            http("request_20")
			.get("/api/districts")
			.headers(headers_5),
            http("request_21")
			.get("/api/paralegal-units")
			.headers(headers_5),
            http("request_22")
			.get("/api/regions")
			.headers(headers_5),
            http("request_23")
			.get("/api/zones")
			.headers(headers_5),
            http("request_24")
			.get("/api/districts")
			.headers(headers_5),
            http("request_25")
			.get("/api/regions")
			.headers(headers_5)))
		.pause(9)
		.exec(http("request_26")
			.options("/api/paralegal-units")
			.headers(headers_2)
			.resources(http("request_27")
			.get("/api/paralegal-units")
			.headers(headers_5)))
		.pause(22)
		.exec(http("request_28")
			.options("/api/region")
			.headers(headers_0)
			.resources(http("request_29")
			.post("/api/region")
			.headers(headers_6)
			.body(RawFileBody("computerdatabase/recordedsimulation/0029_request.json")),
            http("request_30")
			.options("/api/regions")
			.headers(headers_2),
            http("request_31")
			.get("/api/regions")
			.headers(headers_5)))
		.pause(25)
		.exec(http("request_32")
			.options("/api/region/45")
			.headers(headers_32)
			.resources(http("request_33")
			.put("/api/region/45")
			.headers(headers_6)
			.body(RawFileBody("computerdatabase/recordedsimulation/0033_request.json")),
            http("request_34")
			.options("/api/regions")
			.headers(headers_2),
            http("request_35")
			.get("/api/regions")
			.headers(headers_5)))
		.pause(9)
		.exec(http("request_36")
			.options("/api/refresh")
			.headers(headers_0)
			.resources(http("request_37")
			.post("/api/refresh")
			.headers(headers_6)))
		.pause(1)
		.exec(http("request_38")
			.options("/api/region/45")
			.headers(headers_38)
			.resources(http("request_39")
			.delete("/api/region/45")
			.headers(headers_39),
            http("request_40")
			.options("/api/regions")
			.headers(headers_2),
            http("request_41")
			.get("/api/regions")
			.headers(headers_39)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}