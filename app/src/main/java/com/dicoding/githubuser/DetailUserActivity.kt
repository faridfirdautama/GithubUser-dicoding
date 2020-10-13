package com.dicoding.githubuser

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_detail_user.*

class DetailUserActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_USER = "extra_user"
    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_user)

        val actionBar = supportActionBar
        actionBar!!.title = "User Detail"

        val user = intent.getParcelableExtra<User>(EXTRA_USER) as User

        Glide.with(this)
            .load(user.avatar)
            .apply(RequestOptions().override(100, 100))
            .into(img_item_avatar)
        tv_item_name.text = user.name
        tv_item_username.text = user.username
        tv_item_repository.text = user.repository + " Repository"
        tv_item_company.text = user.company
        tv_item_location.text = user.location
        tv_item_follower.text = user.follower + " Follower"
        tv_item_following.text = user.following + " Following"
    }
}