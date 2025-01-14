package org.shelyagin.lab25

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.shelyagin.lab25.SettingsFragment

class SettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportFragmentManager
            .beginTransaction()
            .replace(android.R.id.content, SettingsFragment())
            .commit()
    }
}