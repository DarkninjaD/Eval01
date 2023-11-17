package eval01

import kotlin.test.Test
import kotlin.test.assertNotNull
import eval01.Loa
import org.junit.jupiter.api.Disabled

class `DOD Line of Accounting does` () {
  val LineOfAccount = Loa("TestAccount")

  @Test
  fun `Exist`() {
    assertNotNull(LineOfAccount, "Should Exist")
  }

  @Test
  @Disabled
  fun `have the ability perform deductions and additions`() {

  }
  @Test @Disabled fun `and can deduct corrtely`() {}
  @Test @Disabled fun `and can add corrtely`() {}

  @Test
  @Disabled
  fun `have an internal balance`(){

  }
  @Test @Disabled fun `That is private`(){}
  @Test @Disabled fun `With a getter`(){}


}