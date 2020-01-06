package th.ac.su.ict.chutikarn.palette

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var showcolor = findViewById<TextView>(R.id.Showcolor)
        var one = findViewById<Button>(R.id.one)
        var two = findViewById<Button>(R.id.two)
        var three = findViewById<Button>(R.id.three)
        var four = findViewById<Button>(R.id.four)
        var five = findViewById<Button>(R.id.five)
        var six = findViewById<Button>(R.id.six)

        one.setOnClickListener{
            showcolor.setText("235-255-221")
            showcolor.setBackgroundColor(Color.parseColor("#EBE1DD"))
        }
        two.setOnClickListener{
            showcolor.setText("236-203-202")
            showcolor.setBackgroundColor(Color.parseColor("#eccbca"))

        }
        three.setOnClickListener{
            showcolor.setText("117-131-156")
            showcolor.setBackgroundColor(Color.parseColor("#75839c"))

        }
        four.setOnClickListener{
            showcolor.setText("153-169-191")
            
            showcolor.setBackgroundColor(Color.parseColor("#99a9bf"))

        }

        five.setOnClickListener{
            showcolor.setText("195-204-216")

            showcolor.setBackgroundColor(Color.parseColor("#c3ccd8"))

        }
        six.setOnClickListener{
            showcolor.setText("221-226-269")
            showcolor.setBackgroundColor(Color.parseColor("#dee2e5"))

        }
    }
}
