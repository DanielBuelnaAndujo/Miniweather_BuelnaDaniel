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

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val tvTemperature = findViewById<TextView>(R.id.tvTemperature)
        val tvGreeting = findViewById<TextView>(R.id.tvGreeting)
        val tvCity = findViewById<TextView>(R.id.tvCity)
        val ivWeather = findViewById<ImageView>(R.id.ivWeather)
        val tvWeather = findViewById<TextView>(R.id.tvWeather)

        tvTemperature.setText("8°")
        tvGreeting.setText("Buenas Noches")
        tvCity.setText("Ciudad Obregón")

        val bundle = intent.extras
        val clima = bundle?.getString("clima")
        tvWeather.setText(clima)

        when (clima) {
            "sunny" -> { ivWeather.setImageResource(R.drawable.ic_sunny) }
            "rainy" -> { ivWeather.setImageResource(R.drawable.ic_rainy) }
            "stormy" -> { ivWeather.setImageResource(R.drawable.ic_stormy) }
            "snowy" -> { ivWeather.setImageResource(R.drawable.ic_snowy) }
            "windy" -> { ivWeather.setImageResource(R.drawable.ic_windy) }
            "cloudy" -> { ivWeather.setImageResource(R.drawable.ic_cloudy) }
            else -> { ivWeather.setImageResource(R.drawable.ic_rainy) }
        }

    }
}