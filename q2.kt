class Thermostat {
    var temperature: Double = 0.0
        private set
    fun setTemperature(value: Double) {
        temperature = value
    }
}
fun main() {
    val thermostat = Thermostat()
    thermostat.setTemperature(25.0)
    println(thermostat.temperature)
}
