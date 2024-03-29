package com.biachacon.tetris

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_config.*

class ConfigActivity : AppCompatActivity() {

    var escolhido=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_config)

        var b = Bundle()

        val settings = getSharedPreferences("prefs", Context.MODE_PRIVATE)
        escolhido = settings.getInt("dificuldade", 0)

        if(escolhido==0)
            normalRB.isChecked=true
        else  if(escolhido==1)
            facilRB.isChecked=true
         else
            dificilRB.isChecked=true

        saveBt.setOnClickListener {
           if (normalRB.isChecked)
               b.putInt("dificuldade", 0)
           if(facilRB.isChecked)
               b.putInt("dificuldade", 1)
           if (dificilRB.isChecked)
               b.putInt("dificuldade", 2)

            //Toast.makeText(this, "${b.getInt("dificuldade")}", Toast.LENGTH_SHORT).show()
            var i = Intent(this, HomeActivity::class.java)
            i.putExtras(b)
            setResult(Activity.RESULT_OK, i)
            finish()
        }

    }
}
