package com.example.asus.myapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        eat.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "选中", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "未选中", Toast.LENGTH_SHORT).show()
            }
        }

        sleep.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "选中", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "未选中", Toast.LENGTH_SHORT).show()
            }
        }
        game.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "选中", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "未选中", Toast.LENGTH_SHORT).show()
            }
        }


        checkAll.setOnCheckedChangeListener { buttonView, isChecked ->
            eat.isChecked = isChecked
            sleep.isChecked = isChecked
            game.isChecked = isChecked
            if (isChecked) {
                buttonView.text = "全不选"
            } else {
                buttonView.text = "全选"
            }
        }

        nan.setOnClickListener {
            nan2.isChecked = !it.isSelected
        }

        nv.setOnClickListener {
            nv2.isChecked = !it.isSelected
        }

        nan.setOnCheckedChangeListener { buttonView, isChecked ->
            nan2.isChecked = isChecked
        }
        nv.setOnCheckedChangeListener { buttonView, isChecked ->
            nv2.isChecked = isChecked
        }
        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            if (checkedId == nan.id) {
                Toast.makeText(this, "你选中男", Toast.LENGTH_SHORT).show()
            } else if (checkedId == nv.id) {
                Toast.makeText(this, "你选中女", Toast.LENGTH_SHORT).show()
            }
        }

        imgv.setImageResource(R.drawable.img1)
    }
}
