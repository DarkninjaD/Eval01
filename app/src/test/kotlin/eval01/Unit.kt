package eval01

import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertEquals

import eval01.DODUnit
import org.junit.jupiter.api.Disabled

class `DOD Unit does` () {

  var testingUnit = DODUnit("TestingUnit")

  @Test fun `- Exist`() {
    assertNotNull(testingUnit, "Should Exist")
  }

  @Test fun `- have defualt amount of accounts LOA -`() {
    val defaultAmountOfAccounts: Int = 3
    assertEquals(expected = defaultAmountOfAccounts, actual = testingUnit.accounts.size)
  }

  @Test fun `O&M` () {
    assert(testingUnit.accounts.containsKey("O&M"))
  }

  @Test fun `MILPERS` () {
    assert(testingUnit.accounts.containsKey("MILPERS"))
  }

  @Test fun `RDT&E` () {
    assert(testingUnit.accounts.containsKey("RDT&E"))
  }

  @Test
  @Disabled
  fun `- has a way to set limit per account`(){

  }
}