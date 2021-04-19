package com.grupparbete.entities;

public class Beach {

        private long beachId;
        private String beachName;

        public Beach(long beachId,String beachName){
            this.beachId=beachId;
            this.beachName=beachName;

        }

    public long getBeachId() {
        return beachId;
    }

    public void setBeachId(long beachId) {
        this.beachId = beachId;
    }

    public String getBeachName() {
        return beachName;
    }

    public void setBeachName(String beachName) {
        this.beachName = beachName;
    }
}


