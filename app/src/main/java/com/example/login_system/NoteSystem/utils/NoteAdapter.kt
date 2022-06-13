package com.example.login_system.NoteSystem.utils

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.login_system.NoteSystem.model.Note
import com.example.login_system.databinding.ItemNoteBinding

class NoteAdapter (var Notes:List<Note>) : RecyclerView.Adapter<NoteAdapter.NoteViewHolder>() {
    inner  class  NoteViewHolder(val binding: ItemNoteBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        return NoteViewHolder(ItemNoteBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        holder.binding.apply {
            txTitel.text = Notes[position].title
            txnote.text = Notes[position].notetxt
        }
    }

    override fun getItemCount(): Int {
        return Notes.size
    }
}