package com.grupparbete.entities;
import java.util.ArrayList;
public class Beach {

        private int beachID;

        public Beach(int beachID){
            this.beachID=beachID;
        }
        public void setBeachID(int beachID){
            this.beachID=beachID;
        }
        public int getBeachID(){
            return beachID;
        }


        ArrayList<String> beachList = new ArrayList<String>();

        public void addbeachList(String beach) {
            beachList.add("");
        }
    }


