package com.example.madis_v2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class RegistroActivity : AppCompatActivity() {

    var bt_Login : TextView?= null
    var bt_Registro : TextView?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        bt_Login = findViewById(R.id.btn_login)
        bt_Registro = findViewById(R.id.btn_registro)

        bt_Login!!.setOnClickListener{
            val BD_info = Intent(this, LoginActivity::class.java)

            startActivity(BD_info)
        }
        bt_Registro!!.setOnClickListener{
            val BD_info = Intent(this, LoginActivity::class.java)
            Toast.makeText(this, "Usuario Registrado", Toast.LENGTH_SHORT).show()
            startActivity(BD_info)
        }


    }
}