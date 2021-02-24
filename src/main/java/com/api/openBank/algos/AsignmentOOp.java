package com.api.openBank.algos;

public class AsignmentOOp {
    public interface Flying{
        public int wings();
        public boolean takeOff();
        public boolean land();
    }
    public static class Falcon implements Flying{
        private String color;

        @Override
        public int wings() {
            return 2;
        }

        @Override
        public boolean takeOff() {

            return true;
        }

        @Override
        public boolean land() {
            return true;
        }
    }
    public class Eagle implements Flying{

        @Override
        public int wings() {
            return 0;
        }

        @Override
        public boolean takeOff() {
            return false;
        }

        @Override
        public boolean land() {
            return false;
        }
    }
    public static void main(String[] args){
Falcon falcon=new Falcon();

        System.out.println(falcon.land());
    }
}
