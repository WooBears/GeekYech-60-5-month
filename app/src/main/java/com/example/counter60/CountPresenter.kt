package com.example.counter60

class CountPresenter(private val counterView: CountView){

    private var model = Injector.getModel()

    fun increment()
    {
        model.increment()
        counterView.showChangeCount(model.count)

        if (model.count == 10) counterView.showToast()

        if (model.count == 15) counterView.showIncreasedColor()
    }

    fun decrement()
    {
        model.decrement()
        counterView.showChangeCount(model.count)

        if (model.count < 15) counterView.showDecreaseColor()
    }
}