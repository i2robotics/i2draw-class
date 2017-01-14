package org.firstinspires.ftc.teamcode.Helpers;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.AnalogInput;
import com.qualcomm.robotcore.hardware.AnalogOutput;
import com.qualcomm.robotcore.hardware.HardwareMap;
public class I2draw {
    private final HardwareMap hardwareMap;
    public AnalogInput current_side;
    public AnalogInput voltage_side;

    public double I;
    public double V;
    public double R;
    public double P;

    public I2draw(String voltage_side_name, String current_side_name, LinearOpMode linearOpMode){
        hardwareMap = linearOpMode.hardwareMap;
        current_side = hardwareMap.analogInput.get(current_side_name);
        voltage_side = hardwareMap.analogInput.get(voltage_side_name);
    }

    public I2draw(String voltage_side_name, String current_side_name, OpMode OpMode){
        hardwareMap = OpMode.hardwareMap;
        current_side = hardwareMap.analogInput.get(current_side_name);
        voltage_side = hardwareMap.analogInput.get(voltage_side_name);
    }

    public double getRobotCurrent(){
        I = Math.abs((5 * current_side.getVoltage()) / .066);
        return I;
    }
    public double getRobotVoltage(){
        V = (5 * voltage_side.getVoltage())/(47/142.3);
        return V;
    }
    public double getRobotPower(){
        P = getRobotVoltage()*getRobotCurrent();
        return P;
    }
    public double getRobotResistance(){
        R = getRobotVoltage()/getRobotCurrent();
        return R;

    }




}
