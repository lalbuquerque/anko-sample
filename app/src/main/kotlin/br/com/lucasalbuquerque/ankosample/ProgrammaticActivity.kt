package br.com.lucasalbuquerque.ankosample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.setContentView

class ProgrammaticActivity : AppCompatActivity () {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ProgrammaticActivityUI().setContentView(this)
    }
}