package com.example.homework2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.homework2.databinding.ActivityMainBinding
import com.example.homework2.extantionce.load
import com.example.homework2.extantionce.showToast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    val list =
        mutableListOf("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ5GKVedOmGbyXe7aARGNP0b2ttFPWuH51cSAQfpye0KcOOIfvR8bXqZAjwXozkCTBNQFI&usqp=CAU",
            "https://рускондитер.рф/upload/shop_3/2/4/5/item_2459/small_shop_items_catalog_image2459.jpg",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT93ecv_8KgRSZswzKPWQUjI9d-s5mXsnDNgQU4I1P-34LpDGXgQ4u65jcXhhwW434DezQ&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS7a-AGENmG3hozlCTFiHwNQWOqUcz3RjZtnZHqwt6AYdDuPfyb9WPz2aT6a_ATKvFkT-k&usqp=CAU",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSrgqAYoKGPS-9ZqyE_emymQsxeagPcH--WqDAQ4Jtd0IWDxKbWjUjnmXygLt4hkg7PTRw&usqp=CAU")
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.sendBtn.setOnClickListener{
            
            send()

        }
        binding.random.setOnClickListener {
            coca()
        }
    }

    private fun send() {
        if (binding.URLEt.text.toString().isEmpty()) {
            showToast(getString(R.string.Ваш_текст_пуст))
        } else {
            val text = binding.URLEt.text.toString()
            list.add(text)
            binding.URLEt.setText("")
            showToast("Ваш текст успешен")
        }
    }

    private fun coca() {
        val random = Random.nextInt(list.size)
        val rand = list.get(random)
        binding.icIv.load(rand)

    }
}