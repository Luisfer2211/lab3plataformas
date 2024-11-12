fun main() {
    val burger = Burger("Gauchito", 55.0)
    val pizza = Pizza("5 carnes", 50.0)
    val iceCream = IceCream("Doble Bola", 25.0)
    val juice = Juice("Monster", 10.0)

    // Imprimir cómo se cocina cada alimento
    println(burger.cook())
    println(pizza.cook())
    println(iceCream.cook())
    println(juice.cook())

    // Llamar a la función eat en IceCream
    println(iceCream.eat())

    // Calcular y mostrar el precio con descuento de la hamburguesa
    val discountedPrice = burger.discountedPrice(10.0)
    println("Precio con descuento de la hamburguesa: Q$discountedPrice")
}
