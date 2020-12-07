package com.clickapp.activityresult

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.util.*

class TelaSelecaoActivity : AppCompatActivity() {
    var exibe_info_classe: TextView? = null
    var exibe_imagem_classe: ImageView? = null
    var exibie_preco_classe: TextView? = null
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_selecao)

            exibe_info_classe = findViewById(R.id.nome_classe) as TextView
            exibe_imagem_classe = findViewById(R.id.imagem_classe) as ImageView
            exibie_preco_classe = findViewById(R.id.preco_classe) as TextView

            //RECUPERAR DADOS ENVIADOS
            val dados = intent.extras
            var nome = dados?.getString("Name")
            var imagem = dados?.getInt("imagem")
            var preco = dados?.getString("preco")

            exibe_info_classe!!.text = (nome)
            exibe_imagem_classe!!.setImageResource(imagem!!)
            exibie_preco_classe!!.text = (preco)



    }
}