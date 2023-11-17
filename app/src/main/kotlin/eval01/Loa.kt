package eval01

class Loa(val name : String, private var balance : Int = 1000000,) {


  fun getbalance() : Int {
    return balance
  }

  fun operate(unitsInput : Int, DODUnit : DODUnit) {
    balance =+ unitsInput
  }
}