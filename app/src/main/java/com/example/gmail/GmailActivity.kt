package com.example.gmail

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class GmailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gmail_layout)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        // Tạo danh sách email mẫu
        val emailList = listOf(
            Email("Edurila.com", "Khóa học giảm giá", "Chỉ $19! Tham gia khóa học thiết kế web..."),
            Email("Chris Abad", "Cải thiện chiến dịch", "Hãy cho chúng tôi biết ý kiến của bạn..."),
            Email("Tuto.com", "8 giờ đào tạo miễn phí", "Photoshop, SEO, Blender, CSS, WordPress..."),
            Email("support", "Theo dõi dịch vụ của bạn", "SAS OVH - Thông tin dịch vụ và hợp đồng..."),
            Email("Matt from Ionic", "Ionic Creator mới", "Giới thiệu Ionic Creator phiên bản mới nhất...")
        )

        // Thiết lập LayoutManager và Adapter cho RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = EmailAdapter(emailList)
    }
}