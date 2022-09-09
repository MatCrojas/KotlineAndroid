package com.example.ejerciciob

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.ejerciciob.databinding.ActivityMainBinding
import com.example.ejerciciob.vistas.Persona
import com.example.ejerciciob.vistas.SaludoActivity


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        //Toma toda la interface para almacenar su referencia en Binding
        //Para usar esto, utiliza el buildFeatures de buildGradle
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btn.setOnClickListener {
            var intento = Intent(this, SaludoActivity::class.java)
            var persona = Persona(binding.nombre.text.toString(), binding.paterno.text.toString())

            intento.putExtra("persona", persona)
            println("SI APRETO EL BOTON INGE xD")
            startActivity(intento)

        }



            /*
        }
        // Utiliza el id de el layout directamente, se importa en la parte superior
        btn.setOnClickListener {
            var mensaje = "Hola " + nombre.text.toString() + " " + paterno.text.toString()
            Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
            nombre.setText("")
            paterno.setText("")
        }



        //La forma segura que siempre funciona para asignar por medio del id...

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

    }
}