package com.example.dz1_month5

import android.content.Context


class Injector(val context: Context) {

    companion object {
        fun fillModel() = CounterModel()

        fun fillPresenter() = Presenter()

    }

}