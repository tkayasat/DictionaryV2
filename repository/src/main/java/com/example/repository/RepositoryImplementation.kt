package com.example.repository

class RepositoryImplementation(private val dataSource: DataSource<List<SearchResultDto>>) :
    Repository<List<SearchResultDto>> {

    override suspend fun getData(word: String): List<SearchResultDto> {
        return dataSource.getData(word)
    }
}