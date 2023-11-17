package eval01

class DODUnit(val name: String) {
  var accounts = mutableMapOf<String, Loa>()
  var limits = mutableMapOf<String, Int>()
  var currentbalance = mutableMapOf<String, Int>()

  fun addAccount(account :Loa, setlimit : Int) {
    accounts.put(account.name, account)
    limits.put(account.name, setlimit)
    currentbalance.put(account.name, setlimit)
  }
}