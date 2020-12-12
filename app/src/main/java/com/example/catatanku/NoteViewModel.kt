package com.example.catatanku

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData

class NoteViewModel(application: Application) : AndroidViewModel(application)
{
    private var repository: catatan.NoteRepository =
        catatan.NoteRepository(application)
    private var allNotes: LiveData<List<catatan.Note>> = repository.getAllNotes()
    fun insert(note: catatan.Note) {
        repository.insert(note)
    }
    fun update(note: catatan.Note) {
        repository.update(note)
    }
    fun delete(note: catatan.Note) {
        repository.delete(note)
    }
    fun deleteAllNotes() {
        repository.deleteAllNotes()
    }
    fun getAllNotes(): LiveData<List<catatan.Note>> {
        return allNotes
    }
}