package br.com.crinnger.kotlinagenda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CalendarContract
import android.provider.CalendarContract.Events.*
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val setButton = findViewById(R.id.set_event)  as Button

        setButton.setOnClickListener{
            val intent=Intent(Intent.ACTION_INSERT)
                    .setData(CONTENT_URI)
                    .putExtra(TITLE,"BootCamp Everis")
                    .putExtra(EVENT_LOCATION,"On line")
                    .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,System.currentTimeMillis())
                    .putExtra(CalendarContract.EXTRA_EVENT_END_TIME,System.currentTimeMillis() + (60*60*100))
            Log.e("Debug","inicializando Intent")
            startActivity(intent)
        }
    }
}