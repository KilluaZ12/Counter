package com.example.counter

import android.view.Display.Mode
import com.example.counter.model.Model
import com.example.counter.presenter.Presenter

class Injector {

    companion object{
        fun getModel() = Model()
        fun getPresenter(view: CounterView) = Presenter(view)
    }
}