package performance

import com.intuit.karate.gatling.PreDef._
import io.gatling.core.Predef._
import scala.concurrent.duration._
import scala.language.postfixOps

class UserSimulation extends Simulation{
  val GetSingleUser = scenario("Get Booking").exec(karateFeature("classpath:features/getBooking/getBooking.feature"))

  setUp(
    GetSingleUser.inject(rampUsers(200).during(Duration(10,SECONDS)))
  )
}