package com.example.dictionaryv2.main

import com.example.dictionaryv2.utils.mapSearchResultToResult

class MainInteractor(
    private val repositoryRemote: Repository<List<SearchResultDto>>,
    private val repositoryLocal: RepositoryLocal<List<SearchResultDto>>
) : Interactor<AppState> {

    override suspend fun getData(word: String, fromRemoteSource: Boolean): AppState {
        val appState: AppState
        if (fromRemoteSource) {
            appState = AppState.Success(mapSearchResultToResult(repositoryRemote.getData(word)))
            repositoryLocal.saveToDB(appState)
        } else {
            appState = AppState.Success(mapSearchResultToResult(repositoryLocal.getData(word)))
        }
        return appState
    }
}