package com.example.uf1act10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val editTextNom = findViewById<EditText>(R.id.editTextText)
        val editTextCognom = findViewById<EditText>(R.id.editTextText2)
        val editNumberEdat = findViewById<EditText>(R.id.editTextNumberDecimal)
        val editTextUsuari = findViewById<EditText>(R.id.editTextText4)
        val passwordAuthentication = findViewById<EditText>(R.id.editTextTextPassword)

        val button = findViewById<Button>(R.id.button)


        button.setOnClickListener {

            if(editTextNom.text.isNotBlank() && editTextCognom.text.isNotBlank() && editNumberEdat.text.isNotBlank() && editTextUsuari.text.isNotBlank() && passwordAuthentication.text.isNotBlank()) {

                Toast.makeText(this, "Registre Complet", Toast.LENGTH_SHORT).show()


            }else {

                Toast.makeText(this, "No s'han omplert tots els camps", Toast.LENGTH_SHORT).show()
            }
        }

        val btn: Button = findViewById(R.id.button6)
        btn.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }

        val btn2: Button = findViewById(R.id.button7)
        btn2.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity2:: class.java)
            startActivity(intent)
        }
    }
}