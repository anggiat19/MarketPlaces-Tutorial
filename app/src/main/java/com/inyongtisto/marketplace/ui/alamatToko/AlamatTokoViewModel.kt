package com.inyongtisto.marketplace.ui.alamatToko

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.inyongtisto.marketplace.core.data.repository.AlamatRepository
import com.inyongtisto.marketplace.core.data.repository.AppRepository
import com.inyongtisto.marketplace.core.data.source.model.AlamatToko
import com.inyongtisto.marketplace.core.data.source.remote.request.CreateTokoRequest

class AlamatTokoViewModel(private val repo: AlamatRepository) : ViewModel() {
    fun get() = repo.getAlamatToko().asLiveData()
    fun create(data: AlamatToko) = repo.createAlamatToko(data).asLiveData()
    fun update(data: AlamatToko) = repo.updateAlamatToko(data).asLiveData()
    fun delete(id: Int?) = repo.deleteAlamatToko(id).asLiveData()
}