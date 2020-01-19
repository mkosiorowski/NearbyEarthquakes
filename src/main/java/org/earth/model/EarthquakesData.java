package org.earth.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EarthquakesData {

    @SerializedName("type")
    @Expose
    public String type;
    @SerializedName("metadata")
    @Expose
    public Metadata metadata;
    @SerializedName("features")
    @Expose
    public List<Feature> features = null;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    @Override
    public String toString() {
        return "EarthquakesData{" +
                "type='" + type + '\'' +
                ", metadata=" + metadata +
                ", features=" + features +
                '}';
    }
}