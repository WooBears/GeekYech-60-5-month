package com.example.counter60

class Injector {

    companion object{

        fun getModel(): CountModel {
            return CountModel()
        }

        fun getPresenter(view: CountView): CountPresenter {
            return CountPresenter(view)
        }
    }
}