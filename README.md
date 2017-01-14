![](http://www.i2draw.com/images/i2drawblue-01.png)
### This is the class for the i2draw sensor, and will allow you to easily integrate it into your current FTC robot code.

## Set up
___

#### First, you must put the I2draw.java file into your TeamCode location. Then, in your robot code you must create a I2draw variable, like this:

#### `I2draw i2draw;`

#### Then define this in the init phase (in an Opmode, in the init() function, in LinearOpMode before the waitForStart() command), like this:

#### `i2draw = new I2draw("name-of-voltage-device", "name-of-current-device", this);`

#### this is the opmode, and can be either a LinearOpMode, or a regular OpMode. If it is in your opmode, then just leave it as `this`

---
## Methods


### Current
#### `i2draw.getRobotCurrent()`
#### returns the current of the robot in amps

### Voltage
#### `i2draw.getRobotVoltage()`
#### returns the voltage of the robot in volts

### Power
#### `i2draw.getRobotPower()`
#### returns the power of the robot in watts

### Resistance
#### `i2draw.getRobotResistance()`
#### returns the resistance of the robot in ohms
