package com.dicoding.githubuser

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    val name: String,
    val username: String,
    val company: String,
    val location: String,
    val repository: String,
    val follower: String,
    val following: String,
    val avatar: Int
) : Parcelable

