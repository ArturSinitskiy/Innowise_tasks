package com.hfad.task_1_coffee_builder

data class Coffee private constructor(
    private val coffeeName: String,
    private val isDouble: Boolean,
    private val milkML: Int,
    private val sugarSpoons: Int,
    private val creamML: Int,
    private val cinnamonMG: Int,
    private val syrupML: Int
) {
    class Builder {
        private var coffeeName: String = ""
        private var isDouble: Boolean = false
        private var milkML: Int = 0
        private var sugarSpoons: Int = 0
        private var creamML: Int = 0
        private var cinnamonMG: Int = 0
        private var syrupML: Int = 0

        fun makeDouble(isDouble: Boolean) = apply { this.isDouble = isDouble }
        fun addName(coffeeName: String) = apply { this.coffeeName = coffeeName }
        fun addMilk(milkML: Int) = apply { this.milkML = milkML }
        fun addSugar(sugarSpoons: Int) = apply { this.sugarSpoons = sugarSpoons }
        fun addCream(creamML: Int) = apply { this.creamML = creamML }
        fun addCinnamon(cinnamonMG: Int) = apply { this.cinnamonMG = cinnamonMG }
        fun addSyrup(syrupML: Int) = apply { this.syrupML = syrupML }
        fun build() = Coffee(coffeeName, isDouble, milkML, sugarSpoons, creamML, cinnamonMG, syrupML)
    }


    fun getInfoAboutComponents() = "Coffee: $coffeeName\n" +
            (if (isDouble) "Double Coffee\n" else "") +
            (if (milkML == 0) "" else "Milk: $milkML ml\n") +
            (if (sugarSpoons == 0) "" else "Sugar: $sugarSpoons spoons\n") +
            (if (creamML == 0) "" else "Cream: $creamML ml\n") +
            (if (cinnamonMG == 0) "" else "Cinnamon: $cinnamonMG mg\n") +
            (if (syrupML == 0) "" else "Syrup: $syrupML ml\n")

    fun isEmpty() = coffeeName == "" && milkML == 0 &&
            sugarSpoons == 0 && creamML == 0 &&
            cinnamonMG == 0 && syrupML == 0

}