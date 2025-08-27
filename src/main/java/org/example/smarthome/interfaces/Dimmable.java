package org.example.smarthome.interfaces;

public interface Dimmable {
    void dim(int level);
    int getDimLevel();

    int Max_DIM_LEVEL = 100;
    int Min_DIM_LEVEL = 0;
}
