class Juice(name: String, price: Double) : Drink(name, price) {
    override fun pour(): String {
        return "Sirviendo el jugo $name"
    }

    override fun cook(): String {
        return "Exprimiendo el jugo $name"
    }
}
