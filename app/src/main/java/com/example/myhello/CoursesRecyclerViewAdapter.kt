package com.example.myhello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_row_courses.view.*

class CoursesAdapter(var courseList: List<Courses>) :
    RecyclerView.Adapter<CoursesAdapter.CoursesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoursesViewHolder {
        var itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.activity_row_courses, parent, false)
        return CoursesViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return courseList.size
    }

    override fun onBindViewHolder(holder: CoursesViewHolder, position: Int) {
        holder.rowView.tvCourseCode.text = courseList[position].courseCode
        holder.rowView.tvCourseName.text = courseList[position].courseName
        holder.rowView.tvDescription.text = courseList[position].description
        holder.rowView.tvInstructor.text = courseList[position].instructor
    }

    class CoursesViewHolder(val rowView: View) : RecyclerView.ViewHolder(rowView)
}