package com.mobildersi.kotlinfonksiyonlar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("*************Fonksiyonlar******************")
        ekranaYaz()
        topla(5,7)
        var sonuc=hesapla(7,8)
        println("Hesapla Sonucu:"+sonuc)
    }

    fun ekranaYaz(){
        println("ekranaYaz fonksiyonu çalıştı")
    }

    fun topla(a:Int,b:Int){
        println("Toplam:"+(a+b))
    }

    fun hesapla(x:Int,y:Int) : Int{
        return x*y
    }
}