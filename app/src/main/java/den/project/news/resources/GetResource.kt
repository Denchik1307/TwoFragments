package den.project.news.resources

import den.project.news.data.SourceItem

interface GetResource {
    fun getRes(): ArrayList<SourceItem>
}