package com.example.home14

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.home14.databinding.ActivityMagicBinding

class MagicActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMagicBinding

    private val answers = listOf(
        "Да",
        "Нет",
        "Возможно",
        "Скорее всего да",
        "Скорее всего нет",
        "Имеются перспективы",
        "Вопрос задан неверно"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMagicBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val text = binding.eTquestion.toString()
        val mgcAnsw = binding.textView2

        binding.button2.setOnClickListener {
            if (text.isEmpty()) {
                Toast.makeText(this@MagicActivity,"Задайте вопрос!", Toast.LENGTH_SHORT).show()
            } else {
                mgcAnsw.setText(answers.random())
            }
        }

        binding.button3.setOnClickListener {
            val intent = Intent(this@MagicActivity, ConundrumsActivity::class.java)
            startActivity(intent)
        }
    }
}