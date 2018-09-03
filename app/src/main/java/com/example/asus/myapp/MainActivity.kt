package com.example.asus.myapp

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_title.*


class MainActivity : TitleActivity() {

  @SuppressLint("NewApi")
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    button_backward.setOnClickListener {
      Toast.makeText(this, "返回", Toast.LENGTH_SHORT).show()
//      HttpThread(baseUrl).start()

    }
    // webView.loadUrl("http://www.jikexueyuan.com");

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


    relative.setOnClickListener {
      startActivity(intent.setClass(this, Main2Activity::class.java))
    }

//    relative.setOnClickListener {
//      startActivity(intent.setClass(this, TitleActivity::class.java))
//    }

    time2.setIs24HourView(true)

    time2.setOnTimeChangedListener { view, hourOfDay, minute ->
      Toast.makeText(this, "${hourOfDay} : ${minute}", Toast.LENGTH_SHORT).show()
    }

//        getTime.setOnClickListener { it: View? ->
//            Toast.makeText(this, "" + t, Toast.LENGTH_SHORT).show()
//        }

    getTime.setOnClickListener {
      Toast.makeText(this, "" + time2.currentHour + " : " + time2.currentMinute, Toast.LENGTH_SHORT).show()
    }


  }

}
