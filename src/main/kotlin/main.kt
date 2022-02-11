fun main(){
    val userAmount = 170000
    val userAmountForMonth = 76000
    val cardType = "Visa"

    val result  = calculateCommission(cardType, userAmountForMonth, userAmount)
    println("Комиссия составляет: $result")
}

fun calculateCommission(cardType:String = "Vk Pay",
                        amountForMonth:Int = 0,
                        amount:Int):Double{
    var commission = 0.0
    val minCommissionVisaWorld = 3500
    var result = 0.0

    if(cardType == "Mastercard" || cardType == "Maestro"){
        if (amountForMonth > 75000){
            commission = 0.6
            result = amount * commission
        }
    } else if (cardType == "Visa" || cardType == "Мир"){
        commission = 0.75

        if(amount * commission <= minCommissionVisaWorld) {
            result = minCommissionVisaWorld.toDouble()
        } else {
            result = amount * commission
        }
    }
    return result

}