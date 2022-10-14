fun main (args: Array<String>) {
    val amount: Float = 50000F
    val commission: Float
    if (amount >= 4666.666666667 ) {
        commission = (amount * 0.0075).toFloat()
    } else {
commission = 35F
    }
    println("Комиссия за перевод равна: " + commission + " рублей")


}