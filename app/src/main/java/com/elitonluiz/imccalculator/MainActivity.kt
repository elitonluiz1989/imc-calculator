package com.elitonluiz.imccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_calculate?.setOnClickListener {
            val imc = calculate(etWeight.text.toString().toFloatOrNull(), etHeight?.text.toString().toFloatOrNull())

            if (imc > 0) {
                tvTitle.text = imc.toString();
            }
        }
    }

    private fun calculate(weight: Float?, height: Float?): Float {
        var imc = 0.0F;

        if (weight != null && height != null) {
            imc = weight / (height * height)
        }

        return imc;
    }
}