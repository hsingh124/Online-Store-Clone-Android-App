package com.example.phonestore;

public class Brand {

        private int id;
        private String name;
        private String imgname;

        public Brand(int id, String name, String imgname){
            this.id = id;   //brand ID
            this.name = name;   //brand Name
            this.imgname = imgname;     //image address of the brand logo
        }

        public int getId(){
            return this.id;
        }   //returns ID of brand
        public String getName() {
            return this.name;
        }   //returns Name of brand
        public String getImgName() { return this.imgname; }     //returns Image address of brand Logo
}
