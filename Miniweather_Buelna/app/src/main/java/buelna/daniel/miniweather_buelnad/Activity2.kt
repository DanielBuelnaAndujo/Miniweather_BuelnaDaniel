package buelna.daniel.miniweather_buelnad

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.act2)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val etClima = findViewById<EditText>(R.id.etClima)
        val bAceptar = findViewById<Button>(R.id.bAceptar)

        bAceptar.setOnClickListener {
            if (!etClima.text.isBlank()) {
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("clima", etClima.getText().toString().lowercase())
                startActivity(intent)
            }
        }
    }
}