package com.example.madis_v2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DB_info_Activity : AppCompatActivity() {

    var bt_Ejercicios : TextView?= null
    var bt_Salir : TextView?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_db_info)

        bt_Ejercicios = findViewById(R.id.bt_Ejercicios_DB)
        bt_Salir = findViewById(R.id.bt_Salir_DB)

        bt_Ejercicios!!.setOnClickListener{
            val BD_info = Intent(this, EjerciciosActivity::class.java)
            BD_info.putExtra("Tema",2)

            startActivity(BD_info)
            finish()
        }
        bt_Salir!!.setOnClickListener{
            finish()
        }
    }
}