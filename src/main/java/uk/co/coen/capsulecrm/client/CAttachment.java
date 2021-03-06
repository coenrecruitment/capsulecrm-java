package uk.co.coen.capsulecrm.client;

import com.google.common.base.MoreObjects;

public class CAttachment extends CIdentifiable {
    public String filename;
    public String contentType;

    public CAttachment() {
    }

    public CAttachment(String filename) {
        this.filename = filename;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("filename", filename)
                .add("contentType", contentType)
                .toString();
    }
}
