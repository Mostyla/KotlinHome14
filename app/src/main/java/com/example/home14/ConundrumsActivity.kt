package com.example.home14

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.home14.databinding.ActivityConundrumsBinding
import java.util.*
import kotlin.collections.ArrayList

class ConundrumsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityConundrumsBinding
    private val conundrums: ArrayList<ConundrumsModel> = ArrayList()

    private val conundrumsArray = arrayOf(
        "Речка спятила с ума — По домам пошла сама.",
        "Музыкант, певец, рассказчик — А всего труба да ящик.",
        "Из стены торчу,головой кручу, мою и пою целую семью.",
        "На раскрашенных страницах много праздников хранится."
    )
    private val conundrumsAnswers = arrayOf(
        "Водопровод",
        "Патефон",
        "Кран",
        "Календарь"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConundrumsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fillConundrums()
        generateTask()
        binding.button4.setOnClickListener {
            generateTask()
        }

        binding.button7.setOnClickListener {
            val intent = Intent(this@ConundrumsActivity,CalculateActivity::class.java)
            startActivity(intent)
        }

    }

    private fun generateTask() {
        val conundrumsModel = generateConundrums()
        binding.textView3.text = conundrumsModel.conundrums

        binding.button6.setOnClickListener {
            if (binding.textView3.text == conundrumsModel.conundrums) {
                Toast.makeText(this@ConundrumsActivity, conundrumsModel.answer, Toast.LENGTH_SHORT)
                    .show()
            }
        }
        binding.button5.setOnClickListener {
            if (binding.editText.text.toString() == conundrumsModel.answer) {
                Toast.makeText(this@ConundrumsActivity, "Верно", Toast.LENGTH_SHORT).show()
                generateTask()
            } else {
                Toast.makeText(this@ConundrumsActivity, "Неверно", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun generateConundrums(): ConundrumsModel {
        val random = Random().nextInt(conundrums.size)
        return conundrums[random]
    }

    private fun fillConundrums() {
        for (i in conundrumsArray.indices)
            conundrums.add(ConundrumsModel(conundrumsArray[i], conundrumsAnswers[i]))
    }
}