class Adder {

    fun add(number: Int, callback: OnAdderFinished){

        val newNumber = number + 1


        callback.onCalcCompletion(newNumber)


    }

    interface OnAdderFinished{

        fun onCalcCompletion(newNumber: Int)

    }

}