package com.example.myhello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_course.*

data class Courses(val courses_id: Int, val courses_name: String, val courses_code: Int,val instructor: String, val description: String)

class courses() : AppCompatActivity(), Parcelable {
    constructor(parcel: Parcel) : this() {
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course)
        rvCourses.layoutManager = LinearLayoutManager(baseContext)
        val coursesAdapter = coursesRecyclerViewAdapter(
            coursesList = listOf(
                Courses(1, "Kotlin", 1215008, "John", "Trainer"),
                Courses(2, "Javascript", 1215007, "Purity", "Trainer"),
                Courses(3, "Python", 1215006, "James", "Trainer"),
                Courses(4, "UI/UX Dev", 1215005, "Jeff", "Trainer"),
                Courses(5, "Entrepreneurship", 1215004, "Kelly", "Trainer"),
                Courses(6, "UI/UX Design", 1215003, "Nyandia", "Trainer"),
                Courses(7, "PD", 1215002, "Rogders", "Trainer"),
                Courses(8, "Navigating", 1215001, "Vero", "Trainer")
            )
        )
        rvCourses.adapter = coursesAdapter


    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<courses> {
        override fun createFromParcel(parcel: Parcel): courses {
            return courses(parcel)
        }

        override fun newArray(size: Int): Array<courses?> {
            return arrayOfNulls(size)
        }
    }

}


    }
}