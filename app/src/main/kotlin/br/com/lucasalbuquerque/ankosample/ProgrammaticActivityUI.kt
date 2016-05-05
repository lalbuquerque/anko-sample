package br.com.lucasalbuquerque.ankosample

import android.text.InputType
import org.jetbrains.anko.*

class ProgrammaticActivityUI : AnkoComponent<ProgrammaticActivity> {
    override fun createView(ui: AnkoContext<ProgrammaticActivity>) = with(ui) {
        verticalLayout {

            val username = editText()
            val password = editText() {
                inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
            }.lparams{
                marginStart = dip(2)
                marginEnd = dip(2)
            }

        }
    }
}