class IceCream {
    class IceCream(name: String, price: Double) : Food(name, price), Dessert {
        override fun cook(): String {
            return "Enfriando el helado $name"
        }

        override fun eat(): String {
            return "Comiendo el helado $name"
        }
    }
}