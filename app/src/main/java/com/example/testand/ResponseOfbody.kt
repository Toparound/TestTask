package com.example.testand

import com.google.gson.annotations.SerializedName

class ResponseOfbody(
    @SerializedName("items") val items: List<Item2>
)