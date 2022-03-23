package br.brunodorea.myapplication.data.repositories

import br.brunodorea.myapplication.core.RemoteException
import br.brunodorea.myapplication.data.services.GitHubServices
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException

class RepoRepositoryImpl(private val service: GitHubServices) : RepoRepository {

    override suspend fun listRepositories(user: String) = flow {
        try{
            val repoList = service.listRepositories(user)
            emit(repoList)
        } catch (ex: HttpException){
            throw RemoteException(ex.message ?: "Não foi possivel realizar a busca no momento.")
        }
    }
}