package com.mhb.tgglebuttonmobilki

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.ToggleButton
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var przyciski: List<ToggleButton> = listOf(
            findViewById<ToggleButton>(R.id.t1),
            findViewById<ToggleButton>(R.id.t2),
            findViewById<ToggleButton>(R.id.t3),
            findViewById<ToggleButton>(R.id.t4),
            findViewById<ToggleButton>(R.id.t5),
            findViewById<ToggleButton>(R.id.t6),
            findViewById<ToggleButton>(R.id.t7),
            findViewById<ToggleButton>(R.id.t8),
            findViewById<ToggleButton>(R.id.t9)
        )
        /* 1 3 6 2 8 4 9 5 7*/
        var loso= mutableListOf<Int>()
            var o = 0
        var losowa = 0
     while(loso.size >= 8) {
            losowa = Random.nextInt(0, 8)
            if (o == 9) {
                o = loso.size
            } else {
                o += 1
            }
            if (losowa == loso[0]){}
            else {
                loso[o] = losowa
            }
            if (losowa == loso[1]){}
            else {
                loso[o] = losowa
            }
            if (losowa == loso[2]){}
            else {
                loso[o] = losowa
            }
            if (losowa == loso[3]){}
            else {
                loso[o] = losowa
            }
            if (losowa == loso[4]){}
            else {
                loso[o] = losowa
            }
            if (losowa == loso[5]){}
            else {
                loso[o] = losowa
            }
            if (losowa == loso[6]){}
            else {
                loso[o] = losowa
            }
            if (losowa == loso[7]){}
            else {
                loso[o] = losowa
            }
            if (losowa == loso[8]){}
            else {
                loso[o] = losowa
            }
        }


        var jestGit = 0
        przyciski[0].setOnClickListener { jestGit = 1 }
        przyciski[2].setOnClickListener {
            if (jestGit == 1) {
                jestGit = 2
            } else {
                for (i in 0..8) {
                    przyciski[i].isChecked = false
                    jestGit = 0
                }
            }
        }
        przyciski[5].setOnClickListener {
            if (jestGit == 2) {
                jestGit = 3
            } else {
                for (i in 0..8) {
                    przyciski[i].isChecked = false
                    jestGit = 0
                }
            }
        }
        przyciski[1].setOnClickListener {
            if (jestGit == 3) {
                jestGit = 4
            } else {
                for (i in 0..8) {
                    przyciski[i].isChecked = false
                    jestGit = 0
                }
            }
        }
        przyciski[7].setOnClickListener {
            if (jestGit == 4) {
                jestGit = 5
            } else {
                for (i in 0..8) {
                    przyciski[i].isChecked = false
                    jestGit = 0
                }
            }
        }
        przyciski[3].setOnClickListener {
            if (jestGit == 5) {
                jestGit = 6
            } else {
                for (i in 0..8) {
                    przyciski[i].isChecked = false
                    jestGit = 0
                }
            }
        }
        przyciski[8].setOnClickListener {
            if (jestGit == 6) {
                jestGit = 7
            } else {
                for (i in 0..8) {
                    przyciski[i].isChecked = false
                    jestGit = 0
                }
            }
        }
        przyciski[4].setOnClickListener {
            if (jestGit == 7) {
                jestGit = 8
            } else {
                for (i in 0..8) {
                    przyciski[i].isChecked = false
                    jestGit = 0
                }
            }
        }
        przyciski[6].setOnClickListener {
            if (jestGit == 8) {
                jestGit = 9
            } else {
                for (i in 0..8) {
                    przyciski[i].isChecked = false
                    jestGit = 0
                }
            }
        }
    }
}

