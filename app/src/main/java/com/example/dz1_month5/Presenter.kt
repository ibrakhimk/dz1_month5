package com.example.dz1_month5

class Presenter {

    var model = Injector.fillModel()
    lateinit var view: CounterView

    fun increment() {
        model.increment()
        view.updateText(model.count.toString())
        if (model.count == 10){
            view.showToastIncrement()
        }
        if (model.count == 15){
            view.getColor()
        }

    }
    fun decrement() {
        model.decrement()
        view.updateText(model.count.toString())
    }
    fun attachView(view: CounterView){
        this.view = view
    }
}