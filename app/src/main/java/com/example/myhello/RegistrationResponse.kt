package com.example.myhello
import com.google.gson.annotations.SerializedName

 data class RegistrationResponse (
     @SerializedName("message") var message: String,
     @SerializedName("student") var student: Student.Student
 )
