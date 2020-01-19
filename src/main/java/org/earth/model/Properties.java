
package org.earth.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Properties {

    @SerializedName("mag")
    @Expose
    public Double mag;
    @SerializedName("place")
    @Expose
    public String place;
    @SerializedName("time")
    @Expose
    public Long time;
    @SerializedName("updated")
    @Expose
    public Long updated;
    @SerializedName("tz")
    @Expose
    public Object tz;
    @SerializedName("url")
    @Expose
    public String url;
    @SerializedName("detail")
    @Expose
    public String detail;
    @SerializedName("felt")
    @Expose
    public Object felt;
    @SerializedName("cdi")
    @Expose
    public Object cdi;
    @SerializedName("mmi")
    @Expose
    public Object mmi;
    @SerializedName("alert")
    @Expose
    public Object alert;
    @SerializedName("status")
    @Expose
    public String status;
    @SerializedName("tsunami")
    @Expose
    public Integer tsunami;
    @SerializedName("sig")
    @Expose
    public Integer sig;
    @SerializedName("net")
    @Expose
    public String net;
    @SerializedName("code")
    @Expose
    public String code;
    @SerializedName("ids")
    @Expose
    public String ids;
    @SerializedName("sources")
    @Expose
    public String sources;
    @SerializedName("types")
    @Expose
    public String types;
    @SerializedName("nst")
    @Expose
    public Integer nst;
    @SerializedName("dmin")
    @Expose
    public Double dmin;
    @SerializedName("rms")
    @Expose
    public Double rms;
    @SerializedName("gap")
    @Expose
    public Double gap;
    @SerializedName("magType")
    @Expose
    public String magType;
    @SerializedName("type")
    @Expose
    public String type;
    @SerializedName("title")
    @Expose
    public String title;

    public Double getMag() {
        return mag;
    }

    public void setMag(Double mag) {
        this.mag = mag;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Long getUpdated() {
        return updated;
    }

    public void setUpdated(Long updated) {
        this.updated = updated;
    }

    public Object getTz() {
        return tz;
    }

    public void setTz(Object tz) {
        this.tz = tz;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Object getFelt() {
        return felt;
    }

    public void setFelt(Object felt) {
        this.felt = felt;
    }

    public Object getCdi() {
        return cdi;
    }

    public void setCdi(Object cdi) {
        this.cdi = cdi;
    }

    public Object getMmi() {
        return mmi;
    }

    public void setMmi(Object mmi) {
        this.mmi = mmi;
    }

    public Object getAlert() {
        return alert;
    }

    public void setAlert(Object alert) {
        this.alert = alert;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTsunami() {
        return tsunami;
    }

    public void setTsunami(Integer tsunami) {
        this.tsunami = tsunami;
    }

    public Integer getSig() {
        return sig;
    }

    public void setSig(Integer sig) {
        this.sig = sig;
    }

    public String getNet() {
        return net;
    }

    public void setNet(String net) {
        this.net = net;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public String getSources() {
        return sources;
    }

    public void setSources(String sources) {
        this.sources = sources;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public Integer getNst() {
        return nst;
    }

    public void setNst(Integer nst) {
        this.nst = nst;
    }

    public Double getDmin() {
        return dmin;
    }

    public void setDmin(Double dmin) {
        this.dmin = dmin;
    }

    public Double getRms() {
        return rms;
    }

    public void setRms(Double rms) {
        this.rms = rms;
    }

    public Double getGap() {
        return gap;
    }

    public void setGap(Double gap) {
        this.gap = gap;
    }

    public String getMagType() {
        return magType;
    }

    public void setMagType(String magType) {
        this.magType = magType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Properties{" +
                "mag=" + mag +
                ", place='" + place + '\'' +
                ", time=" + time +
                ", updated=" + updated +
                ", tz=" + tz +
                ", url='" + url + '\'' +
                ", detail='" + detail + '\'' +
                ", felt=" + felt +
                ", cdi=" + cdi +
                ", mmi=" + mmi +
                ", alert=" + alert +
                ", status='" + status + '\'' +
                ", tsunami=" + tsunami +
                ", sig=" + sig +
                ", net='" + net + '\'' +
                ", code='" + code + '\'' +
                ", ids='" + ids + '\'' +
                ", sources='" + sources + '\'' +
                ", types='" + types + '\'' +
                ", nst=" + nst +
                ", dmin=" + dmin +
                ", rms=" + rms +
                ", gap=" + gap +
                ", magType='" + magType + '\'' +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
