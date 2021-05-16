package com.example.appblog.Model;

public class CommentsModel {
    String cId, comment, timestamp, uDp, uEmail, uName, uid;

    public CommentsModel() {
    }

    public CommentsModel(String cId, String comment, String timestamp, String uDp, String uEmail, String uName, String uid) {
        this.cId = cId;
        this.comment = comment;
        this.timestamp = timestamp;
        this.uDp = uDp;
        this.uEmail = uEmail;
        this.uName = uName;
        this.uid = uid;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getuDp() {
        return uDp;
    }

    public void setuDp(String uDp) {
        this.uDp = uDp;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
