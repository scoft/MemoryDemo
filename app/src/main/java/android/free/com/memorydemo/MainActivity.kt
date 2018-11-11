package android.free.com.memorydemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.GO_01).setOnClickListener{_->
            val intent = Intent(MainActivity@this,HandlerActivity::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.GO_02).setOnClickListener{
            val intent = Intent(MainActivity@this,OneActivity::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.GO_03).setOnClickListener{
            val intent = Intent(MainActivity@this,TwoActivity::class.java)
            startActivity(intent)
        }
    }
}
