package br.brunodorea.myapplication.domain

import br.brunodorea.myapplication.core.UseCase
import br.brunodorea.myapplication.data.model.Repo
import br.brunodorea.myapplication.data.repositories.RepoRepository
import br.brunodorea.myapplication.data.services.GitHubServices
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
    ) : UseCase<String, List<Repo>>() {
    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }

}