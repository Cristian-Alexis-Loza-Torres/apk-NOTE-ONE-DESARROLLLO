package com.gamdestroyerr.roomnote.ui.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Establecer el retraso en milisegundos
        val splashScreenDelay: Long = 2500

        // Usar Handler para esperar el tiempo especificado antes de iniciar NoteActivity
        Handler(Looper.getMainLooper()).postDelayed({
            // Iniciar NoteActivity después del retraso
            val intent = Intent(this@SplashActivity, NoteActivity::class.java)
            startActivity(intent)
            finish()
        }, splashScreenDelay)
    }
}
