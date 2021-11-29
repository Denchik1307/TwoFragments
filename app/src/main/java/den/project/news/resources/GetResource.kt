package den.project.news.resources

import den.project.news.data.SourceList
import den.project.news.test.LIST

class GetResource {
    fun getRes(): ArrayList<SourceList> {
        return LIST
    }
}