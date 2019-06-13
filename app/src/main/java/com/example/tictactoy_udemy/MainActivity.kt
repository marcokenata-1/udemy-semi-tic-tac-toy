package com.example.tictactoy_udemy

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    protected fun buClick(view : View){
        val buSelected = view as Button
        var cellID=0
        when(buSelected.id){
            R.id.bu1 -> cellID = 1
            R.id.bu2 -> cellID = 2
            R.id.bu3 -> cellID = 3
            R.id.bu4 -> cellID = 4
            R.id.bu5 -> cellID = 5
            R.id.bu6 -> cellID = 6
            R.id.bu7 -> cellID = 7
            R.id.bu8 -> cellID = 8
            R.id.bu9 -> cellID = 9
        }

//        Toast.makeText(this,"ID:"+cellID, Toast.LENGTH_SHORT).show()
        playGame(cellID,buSelected)
    }


    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()
    var activePlayer = 1

    fun playGame(cellID:Int, buSelected:Button){
        if (activePlayer == 1){
            buSelected.text = "X"
            buSelected.setBackgroundColor(Color.GREEN)
            player1.add(cellID)
            activePlayer = 2
        } else {
            buSelected.text = "X"
            buSelected.setBackgroundColor(Color.BLUE)
            player2.add(cellID)
            activePlayer = 1
        }

        buSelected.isEnabled = false
    }

    fun checkWinner(){
        //skipped because too long..
        /*
        algorithm is checking 1 by 1,
        e.g. 1 2 3, 4 5 6, and 7,8,9 
         */
    }
}
