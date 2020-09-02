package com.selen.kotlinhw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.selen.kotlinhw.ViewModel.MainViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_click.setOnClickListener(click)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        mainViewModel.getViewState().observeForever { value ->
            Toast.makeText(this, value.toString(), Toast.LENGTH_SHORT).show()
        }
    }

    private val click: View.OnClickListener = View.OnClickListener {
        mainViewModel.addCount()
    }
}