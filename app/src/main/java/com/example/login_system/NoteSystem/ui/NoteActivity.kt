package com.example.login_system.NoteSystem.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.login_system.NoteSystem.model.Note
import com.example.login_system.NoteSystem.utils.NoteAdapter
import com.example.login_system.R
import com.example.login_system.databinding.ActivityNoteBinding

class NoteActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNoteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note)
        binding = ActivityNoteBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        val noteListSingleItem = mutableListOf<Note>(
            Note("My Name", "Kamel Mojtaba Kamel "),
            Note("My Name", "Kamel Mojtaba Kamel ")
        )
        val adapter = NoteAdapter(noteListSingleItem)
        binding.rvNotes.adapter = adapter
        binding.rvNotes.layoutManager = LinearLayoutManager(this)
        binding.btnAddNote.setOnClickListener {
            val newNoteTitle = binding.etTitle.text.toString()
            val newNoteTxt = binding.editText.text.toString()

            val  newNote = Note(newNoteTitle, newNoteTxt)
            noteListSingleItem.add(newNote)
            adapter.notifyDataSetChanged()
            binding.etTitle.text.clear()
            binding.editText.text.clear()
        }
    }
}