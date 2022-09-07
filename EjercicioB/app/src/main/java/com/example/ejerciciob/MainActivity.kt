package com.example.ejerciciob

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    lateinit var nombre:EditText
    lateinit var paterno:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

/*
La forma segura que siempre funciona para asignar por medio del id...
        button = findViewById(R.id.btn)
        nombre = findViewById(R.id.nombre)
        paterno = findViewById(R.id.paterno)

                button.setOnClickListener {
            var mensaje = "Hola " + nombre.text.toString() + " " + paterno.text.toString()
            Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
            nombre.setText("")
            paterno.setText("")
        }
*/
        // Utiliza el id de el layout directamente, se importa en la parte superior
        btn.setOnClickListener {
            var mensaje = "Hola " + nombre.text.toString() + " " + paterno.text.toString()
            Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
            nombre.setText("")
            paterno.setText("")
        }

    }
}