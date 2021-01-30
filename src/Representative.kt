class Representative(val name: String): Adder.OnAdderFinished {

    private val calulator = Adder()

    fun acceptAddOrder(number: Int){

        val resultantNumber = calulator.add(number,this)



    }

    override fun onCalcCompletion(newNumber: Int) {
        println("$name has coumpleted the number and it is ${newNumber}")
    }


}