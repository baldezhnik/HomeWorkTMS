package com.dsd.homework.hw18

data class Vegetables (private val region:Region) {
    private var potato: Float = 0F
    private var cabbage: Float = 0F
    private var beet: Float = 0F

    fun getRegion(): Region {
        return this.region
    }

    fun getPotato(): Float {
        return this.potato
    }

    fun getCabbage(): Float {
        return this.cabbage
    }

    fun getBeet(): Float {
        return this.beet
    }

    fun setVegetables(potato: Float, cabbage: Float, beet: Float) {
        this.potato = potato
        this.cabbage = cabbage
        this.beet = beet
    }

    override fun toString(): String {
        return "В регионе $region собрано:\n картофеля=${String.format("%.2f", potato)}," +
                " капусты=${String.format("%.2f", cabbage)}," +
                " свеклы=${String.format("%.2f", beet)}\n"
    }
}