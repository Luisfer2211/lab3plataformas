abstract class Food(val name: String, val price: Double) {
    abstract fun cook(): String
}

class Burger(name: String, price: Double) : Food(name, price) {
    override fun cook(): String {
        return "Asando la hamburguesa $name"
    }
}


class Pizza(name: String, price: Double) : Food(name, price) {
    override fun cook(): String {
        return "Horneando la pizza $name"
    }
}

