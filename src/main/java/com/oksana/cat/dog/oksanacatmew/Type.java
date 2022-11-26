package com.oksana.cat.dog.oksanacatmew;

public enum Type {

    hay_straw {
        @Override
        public String toString() {
            return "hay_straw";
        }
    },
    silage_haylage {
        @Override
        public String toString() {
            return "silage_haylage";
        }
    },
    roots {
        @Override
        public String toString() {
            return "roots";
        }
    },
    grass {
        @Override
        public String toString() {
            return "grass";
        }
    },
    Concentrates {
        @Override
        public String toString() {
            return "Concentrates";
        }
    };
    public abstract String toString();
}
