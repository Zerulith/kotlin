class CellPhones(val brand: String, val model: String, val price: String)

fun main() {
    val cp1 = CellPhones("Samsung", "Galaxy S24", "$799")
    val cp2 = CellPhones("Apple", "iPhone 14", "$1,200")

    println(cp1.brand)
    println(cp1.model)
    println(cp1.price)

    println(cp2.brand)
    println(cp2.model)
    println(cp2.price)
}
 
