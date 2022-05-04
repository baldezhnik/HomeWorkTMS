package com.dsd.homework.hw18

data class Vegetables (private val region:Region) {
    private var potato: Float = 0F
    private var cabbage: Float = 0F
    private var beet: Float = 0F
    private var victory: Boolean = false

    fun getVictory(): Boolean {
        return victory
    }

    fun getRegion(): Region{
        return region
    }

    fun getPotato(): Float {
        return potato
    }

    fun getCabbage(): Float {
        return cabbage
    }

    fun getBeet(): Float {
        return beet
    }

    fun setVegetables(potato: Float, cabbage: Float, beet: Float) {
        this.potato = potato
        this.cabbage = cabbage
        this.beet = beet
        victory = (potato>=100) and (cabbage>=100) and (beet>=100)
    }

    override fun toString(): String {
        return "В регионе $region собрано:\n картофеля=${String.format("%.2f", potato)}т," +
                " капусты=${String.format("%.2f", cabbage)}т," +
                " свеклы=${String.format("%.2f", beet)}т\n"
    }
}