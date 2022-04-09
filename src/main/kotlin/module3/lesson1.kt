package module3

fun main() {
    val juniorGrossSalary = 50_000
    val middleGrossSalary = 134_000
    val seniorGrossSalary = 167_000

    val juniorNetSalary = juniorGrossSalary * 0.87
    val juniorBank = juniorNetSalary * 0.3 * 12
    println("With a salary of $juniorGrossSalary person can accumulate $juniorBank in 1 year")

    val middleNetSalary = middleGrossSalary * 0.87
    val middleBank = middleNetSalary * 0.3 * 12
    println("With a salary of $middleGrossSalary person can accumulate $middleBank in 1 year")

    val seniorNetSalary = seniorGrossSalary * 0.87
    val seniorBank = seniorNetSalary * 0.3 * 12
    println("With a salary of $seniorGrossSalary person can accumulate $seniorBank in 1 year")

    calculateSavings(salary = juniorGrossSalary, rate = 0.5, period = 10)
    calculateSavings(middleGrossSalary, 0.25)
    calculateSavings(seniorGrossSalary)

    // val sum = calculateSavings(30000, 0.12, 8) +
           // calculateSavings(55000, 0.20, 8)

    val first = calculateSavings(30000, 0.12, 8) { _, _, _, bank ->
        println("First member's bank: $bank")
    }
    val second = calculateSavings(55000, 0.20, 8, printInfo = {salary, rate, period, bank ->
        println("Second member's bank: $bank")
    })
    val third = calculateSavings(50000, 0.30, 12, printInfo = {salary, rate, period, bank ->
        println("Salary: $salary, rate: ${rate * 100}%, period: $period months, $bank in 1 year")
    })
    println(first + second)
}

fun calculateSavings(salary: Int,
                     rate: Double = 0.3,
                     period: Int = 12,
                     printInfo: ((salary: Int, rate: Double, period: Int, bank: Double) -> Unit)? = null
) : Double {
    val netSalary = salary * 0.87
    val bank = netSalary * rate * period
    printInfo?.invoke(salary,rate, period, bank)
   // println("Salary: $salary, rate: ${rate * 100}%, period: $period months, $bank in 1 year")
    return  bank
}

