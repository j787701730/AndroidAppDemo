package com.example.asus.myapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main2)

    linear.setOnClickListener {
      //            Toast.makeText(this, "click", Toast.LENGTH_SHORT).show()
      finish()
    }

    val baseUrl = "https://www.zhengw.top/getbooks"
    
//    Http.init(this)
//
//    Http.post {
//      headers {
//        "Content-Type" - "application/json"
//      }
//      url = baseUrl
//      onSuccess { bytes ->
//        // handle data
//        ajaxtext.hint = bytes.toString(Charset.defaultCharset())
//      }
//    }
//    webwiew.loadUrl("http://www.jikexueyuan.com")

  }
}
