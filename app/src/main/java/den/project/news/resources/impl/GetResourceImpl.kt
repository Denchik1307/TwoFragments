package den.project.news.resources.impl

import den.project.news.data.SourceItem
import den.project.news.resources.GetResource
import den.project.news.test.ITEM

class GetResourceImpl : GetResource {
    override fun getRes(): ArrayList<SourceItem> {
        return ITEM
    }
}