fun main() {
    // Характеристики животного
    val hasFur = true      // Есть ли у животного шерсть
    val numberOfLegs = 4   // Количество ног
    val canFly = false     // Способность летать

    val animalType = when {
        // Условия что-то вроде "если есть шерсть, 4 ноги и не умеет летать"
        hasFur && numberOfLegs == 4 && !canFly -> "Млекопитающее"
        // Если есть крылья и может летать
        canFly && numberOfLegs >= 2 -> "Птица"
        // Если много ног и не летает
        !canFly && numberOfLegs >= 6 -> "Насекомое"
        // Другие варианты
        else -> "Неопределенный тип животного"
    }

    println("Тип животного: $animalType")
}