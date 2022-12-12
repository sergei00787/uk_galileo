package com.jbond.app.tags;

import java.util.ArrayList;
import java.util.List;

public class GalileoRowTags {
    private List<Tag> tags;

    public GalileoRowTags() {
        this.tags = new ArrayList<>();
    }

    public void addTagToRow(Tag tag){
        tags.add(tag);
    }

    public List<Tag> getTags() {
        return tags;
    }
}
