package com.zbe.ecommerce

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class EcommerceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ecommerce)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Toast.makeText(this, "This is Ecommerce App", Toast.LENGTH_SHORT).show()


        val tvEcommerce = findViewById<TextView>(R.id.tvEcommerce)

        tvEcommerce.setOnClickListener {
            val intent = Intent()

            intent.setClassName(
                "com.zbe.zbeapp",  // app package name (from your app module's manifest)
                "com.zbe.zbeapp.MainActivity" // full path to MainActivity
            )

            startActivity(intent)
        }


    }
}