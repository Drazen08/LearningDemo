//package com.study.thinking;
//
///**
// * 内部类
// *
// * @version V1.0
// * @author: sunjx
// * @create: 2019/12/17
// */
//public class Initlise {
//    abstract class Contents {
//        abstract public int value();
//    }
//
//    interface Destination {
//        String readLabel();
//    }
//
//    static class Parcel3 {
//        private class PContents extends Contents {
//            private int i = 11;
//
//            @Override
//            public int value() {
//                return i;
//            }
//        }
//
//        protected class PDestination implements Destination {
//            private String label;
//
//            private PDestination(String whereTo) {
//                label = whereTo;
//            }
//
//            @Override
//            public String readLabel() {
//                return label;
//            }
//        }
//
//        public Destination dest(String s) {
//            return new PDestination(s);
//        }
//
//        public Contents cont() {
//            return new PContents();
//        }
//    }
//
//
//}
