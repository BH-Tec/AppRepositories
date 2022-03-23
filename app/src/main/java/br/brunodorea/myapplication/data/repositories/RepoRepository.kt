package br.brunodorea.myapplication.data.repositories

import br.brunodorea.myapplication.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user:String): Flow<List<Repo>>
}