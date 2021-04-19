package com.grupparbete.entities;
import java.util.ArrayList;
public class Beach {

        private long beachID;
        private String beachName;

        public Beach(long beachID,String BeachName){
            this.beachID=beachID;
            this.beachName=beachName;

        }

    public long getBeachID() {
        return beachID;
    }

    public void setBeachID(long beachID) {
        this.beachID = beachID;
    }

    public String getBeachName() {
        return beachName;
    }

    public void setBeachName(String beachName) {
        this.beachName = beachName;
    }
}


