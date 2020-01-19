
package org.earth.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Metadata {

    @SerializedName("generated")
    @Expose
    public Long generated;
    @SerializedName("url")
    @Expose
    public String url;
    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("status")
    @Expose
    public Integer status;
    @SerializedName("api")
    @Expose
    public String api;
    @SerializedName("count")
    @Expose
    public Integer count;

    public Long getGenerated() {
        return generated;
    }

    public void setGenerated(Long generated) {
        this.generated = generated;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Metadata{" +
                "generated=" + generated +
                ", url='" + url + '\'' +
                ", title='" + title + '\'' +
                ", status=" + status +
                ", api='" + api + '\'' +
                ", count=" + count +
                '}';
    }
}
