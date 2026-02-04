package buelna.daniel.miniweather_buelnad

import android.os.Bundle
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

        val tvTemperature = findViewById<TextView>(R.id.tvTemperature).setText("8°")
        val tvGreeting = findViewById<TextView>(R.id.tvGreeting).setText("Buenas Noches")
        val tvCity = findViewById<TextView>(R.id.tvCity).setText("Ciudad Obregón")
        val ivWeather = findViewById<ImageView>(R.id.ivWeather).setImageResource(R.drawable.ic_stormy)
        val tvWeather = findViewById<TextView>(R.id.tvWeather).setText("Frio")
    }
}