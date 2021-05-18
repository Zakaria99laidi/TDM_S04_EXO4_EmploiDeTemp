package com.Laidi_Arar.biblo.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.Laidi_Arar.biblo.ui.model.Seance
import com.Laidi_Arar.biblo.ui.model.getListSeance

object ViewModel {
    val bookList : List<Seance> = getListSeance()
    val selectedBook : LiveData<Seance>
        get() =_selectedBook
    private val _selectedBook = MutableLiveData<Seance>()

    fun updateSelectedSeance(seance: Seance){
        _selectedBook.value = seance
    }
}