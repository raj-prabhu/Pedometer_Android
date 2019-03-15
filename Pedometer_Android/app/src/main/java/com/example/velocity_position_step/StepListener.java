package com.example.velocity_position_step;

public interface StepListener {

    public void step(long timeNs);
    public void velanddis(float vel_t, float dis_t);

}
