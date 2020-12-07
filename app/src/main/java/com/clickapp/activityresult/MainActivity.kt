package com.clickapp.activityresult

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    var im_et: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        im_et = findViewById(R.id.alienigena) as ImageView
        im_et!!.setOnClickListener(){

            val detalhesDaClasse = Intent(this, TelaSelecaoActivity::class.java)
            detalhesDaClasse.putExtra("Name", "E.T Grey")
            detalhesDaClasse.putExtra("imagem", R.drawable.etimage)
            detalhesDaClasse.putExtra("preco", "R$ 6999,00")
            startActivity(detalhesDaClasse)

        }
    }
}