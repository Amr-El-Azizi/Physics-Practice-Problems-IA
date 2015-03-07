/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.QuestionDatabase;

/**
 *
 * @author Amr
 */
import java.util.Random;
import my.Question.Question;
public class QuestionDatabase
{
    double g = 10d;
    public QuestionDatabase()
    {
        
    }
    
    public Question VD1()
    {
        double x = rnum(25) + 1;
        double y = rnum(25) + 1;
        return new Question("Velocity","An object has a velocity of " + Double.toString(x) + "ms^-1 for " + Double.toString(y) + "s, how far did it travel?", x*y, "m", "Displacement");
    }
    
    public Question VD2()
    {
        double x = rnum(25) + 1;
        double y = rnum(25) + 1;
        return new Question("Velocity","If an object moved " + Double.toString(x) + "m after " + Double.toString(y) + "s, what was its velocity?", x/y, "ms^-1", "Displacement");
    }
    
    public Question VD3()
    {
        double x = rnum(25) + 1;
        double y = rnum(25) + 1;
        return new Question("Velocity","If an object moved at " + Double.toString(x) + "ms^-1 and traveled a distance of " + Double.toString(y) + "m, how long did it travel?", y/x, "s", "Displacement");
    }
    
    public Question VD4()
    {
        double x = rnum(25) + 1;
        double y = rnum(25) + 1;
        return new Question("Velocity","When an object travels at -" + Double.toString(x) + "ms^-1 for " + Double.toString(y) + "s, what was its final displacement?", -x*y, "m", "Displacement");
    }
    
    public Question VD5()
    {
        double x = rnum(25) + 1;
        double y = rnum(25) + 1;
        return new Question("Velocity","If an object reached a displacement -" + Double.toString(x) + "m after " + Double.toString(y) + "s, what was its velocity?", x/y, "s", "Displacement");
    }
    
    public Question Acc1()
    {
        double x = sign() * rnum(25) + 1;
        double y = sign() * rnum(25) + 1;
        double z = rnum(25) + 1;
        return new Question("Acceleration","If an object started moving at " + Double.toString(x) + "ms^-1 and was at a speed of " + Double.toString(y) + "ms^-1 after " + Double.toString(z) + "s, how fast did it accelerate?", (y-x)/z, "ms^-2");
    }
    
    public Question Acc2()
    {
        double x = sign() * rnum(25) + 1;
        double y = sign() * rnum(25) + 1;
        double z = rnum(25) + 1;
        return new Question("Acceleration","If an object accelerates at a rate of " + Double.toString(x) + "ms^-2 and was at a speed of " + Double.toString(y) + "ms^-1 at the beginning, what was its velocity after " + Double.toString(z) + "s?", y + x*z, "ms^-1");
    }
    
    public Question Acc3()
    {
        double x = sign() * rnum(25) + 1;
        double y = rnum(25) + 1;
        double z = sign() * rnum(25) + 1;
        return new Question("Acceleration","An object accelerated at a rate of " + Double.toString(x) + "ms^-2 for " + Double.toString(y) + "s and reached a velocity of " + Double.toString(z) + "ms^-1. What was its initial velocity?", z - x*y, "ms^-1");
    }
    
    public Question Acc4()
    {
        double sign = sign();
        double x = sign * rnum(25) + 1;
        double y = sign * rnum(25) + 1;
        return new Question("Acceleration","An object accelerated at a rate of " + Double.toString(x) + "ms^-2 and had a total change of velocity of " + Double.toString(y) + "ms^-1. How long was it accelerating for?", y/x, "s");
    }
    
    public Question HoriMot1()
    {
        double x = rnum(25) + 1;
        double y = rnum(25) + 1;
        return new Question("Horizontal Motion","A penguin slides off of an ice flow at a velocity of " + Double.toString(x) + "ms^-1. When he hits the water, he experiences a backwards acceleration and stops " + Double.toString(y) + "m from the edge. What is the acceleration he experienced?", x/(2*y), "ms^-2", "Acceleration", "Displacement", "Velocity");
    }
    
    public Question HoriMot2()
    {
        double sign = sign();
        double x = sign * rnum(25) + 1;
        double y = sign * rnum(25) + 1;
        return new Question("Horizontal Motion","A ball rolls at an initial velocity of " + Double.toString(x) + "ms^-1. If it comes to rest after traveling " + Double.toString(y) + "m, what was its acceleration?", (x*x)/(2*y), "ms^-2", "Acceleration", "Displacement", "Velocity");
    }
    
    public Question HoriMot3()
    {
        double x = sign() * rnum(25) + 1;
        double y = sign() * rnum(25) + 1;
        double z = rnum(25) + 1;
        return new Question("Horizontal Motion","An object moves at an initial velocity of " + Double.toString(x) + "ms^-1. If it accelerates at a rate of " + Double.toString(y) + "ms^-2 for  " + Double.toString(z) + "s, what is its change in displacement?", x*z + (y*z*z)/2, "m", "Acceleration", "Displacement", "Velocity");
    }
    
    public Question HoriMot4()
    {
        double x = rnum(25) + 1;
        double y = rnum(25) + 1;
        return new Question("Horizontal Motion","A cart is moving at a speed of " + Double.toString(x) + "ms^-1 while being accelerated at a rate of -" + Double.toString(y) + "ms^-2. How long does it take to reach the initial point?", 2*x/y, "s", "Acceleration", "Displacement", "Velocity");
    }
    
    public Question DropB1()
    {
        double x = rnum(25) + 1;
        return new Question("Dropping a ball","A ball is dropped from a building " + Double.toString(x) + "m high. How long does it take to reach the bottom?", 2*x/g, "s", "Drop");
    }
    
    public Question DropB2()
    {
        double x = rnum(25) + 1;
        double u = rnum(50) + 50;
        return new Question("Dropping a ball","A " + Double.toString(u) + "g penny is dropped from a cliff " + Double.toString(x) + "m high. What is its final velocity before impact?", Math.sqrt(2*g*x), "ms^-1", "Drop");
    }
    
    public Question DropB3()
    {
        double x = rnum(5) + 1;
        double u = rnum(50) + 50;
        return new Question("Dropping a ball","An object weighing " + Double.toString(u) + "g is dropped from a table and hits the ground after " + Double.toString(x) + "s. What is the height of the table?", (g*x*x)/2, "m", "Drop");
    }
    
    public Question DropB4()
    {
        double x = rnum(11) + 50;
        double u = rnum(50) + 50;
        return new Question("Dropping a ball","An object is dropped from a helicopter and hits the ground after " + Double.toString(x) + "s. What is its velocity right before it hits the ocean if it has a density of " + Double.toString(u) + "gcm^-3?", (g*x*x)/2, "m", "Drop");
    }
    
    public Question DropB5()
    {
        double x = rnum(25) + 1;
        double u = rnum(5) + 1;
        return new Question("Dropping a ball","A " + Double.toString(u) + "kg weigh is dropped from the edge of a cliff and has a final velocity of " + Double.toString(x) + "ms^-1. How long did it take to hit the ground?", x/g, "s", "Drop");
    }
    
    public Question DropB6()
    {
        double x = rnum(25) + 1;
        return new Question("Dropping a ball","A rubber ball is dropped from a rooftop has a velocity of " + Double.toString(x) + "ms^-1 right before impact. How high up from the ground is the rooftop?", (x*x)/(2*g), "m", "Drop");
    }
    
    public Question ThrowB1()
    {
        double y = rnum(25) + 1;
        double x = rnum(5) + 1;
        double u = rnum(50) + 50;
        return new Question("Throwing a ball","A ball is thrown downward off of a cliff " + Double.toString(y) + "m high with a velocity of " + Double.toString(x) + "ms^-1. What is its final velocity before impact if it weighs " + Double.toString(u) + "g?", Math.sqrt(x * x + 2*g*y), "ms^-1", "Throw", "Initial");
    }
    
    public Question ThrowB2()
    {
        double y = rnum(1) + 2;
        double x = rnum(5) + 1;
        double u = rnum(50) + 50;
        return new Question("Throwing a ball","A ball is thrown upwards by someone " + Double.toString(y) + "m tall with a velocity of " + Double.toString(x) + "ms^-1. What is its final velocity before impact if it weighs " + Double.toString(u) + "g?", Math.sqrt(x * x + 2*g*y), "ms^-1", "Throw", "Initial");
    }
    
    public Question ThrowB3()
    {
        double x = rnum(25) + 1;
        double y = rnum(6) + 5;
        double u = rnum(50) + 50;
        return new Question("Throwing a ball","An object is thrown downward off of a triangular rooftop " + Double.toString(y) + "m high with a velocity of " + Double.toString(x) + "ms^-1. How long does it take to hit the bootom if it has a volume of " + Double.toString(u) + "cm^3?", (Math.sqrt(x*x-2*g*y)-x)/g, "s", "Throw", "Initial");
    }
    
    public Question ThrowB4()
    {
        double x = rnum(25) + 1;
        double y = rnum(6) + 5;
        return new Question("Throwing a ball","An object is thrown upwards off of a building " + Double.toString(y) + "m high with a velocity of " + Double.toString(x) + "ms^-1. How long does it take to hit the bootom?", (Math.sqrt(x*x-2*g*y)-x)/g + 2*x/g, "s", "Throw", "Initial");
    }
    
    public Question ThrowB5()
    {
        double x = rnum(5) + 1;
        double y = rnum(6) + 5;
        return new Question("Throwing a ball","An object is thrown straight down out of a windo at a velocity of " + Double.toString(x) + "ms^-1. How tall is the window if the ball takes" + Double.toString(y) + "s to reach the ground?", x*y + (g*y*y)/2, "m", "Throw", "Initial");
    }
    
    public Question ThrowB6()
    {
        double x = rnum(5) + 1;
        double y = rnum(11) + 15;
        return new Question("Throwing a ball","An object is thrown straight vertically upwards out of a hovering helicopter at a velocity of " + Double.toString(x) + "ms^-1. How high up is the helicopter if the ball takes " + Double.toString(y) + "s to reach the ground?", x*y + (g*y*y)/2, "s", "Throw", "Initial");
    }
    
    public Question LS1()
    {
        double y = rnum(15) + 10;
        double x = rnum(5) + 1;
        double u = rnum(50) + 50;
        return new Question("Launching a Ball off of a surface","A ball is kicked off of a building " + Double.toString(y) + "m high with a horizontal velocity of " + Double.toString(x) + "ms^-1. Not accounting for friction, what is its final vertical velocity before impact if it weighs " + Double.toString(u) + "g?", Math.sqrt(2*y*g), "ms^-1", "Projectile Motion");
    }
    
    public Question LS2()
    {
        double y = rnum(15) + 10;
        double x = rnum(5) + 1;
        double u = rnum(50) + 50;
        return new Question("Launching a Ball off of a surface","A ball is kicked off of a building " + Double.toString(y) + "m high with a horizontal velocity of " + Double.toString(x) + "ms^-1. Ignoring fluid resistance, what is its final horizontal velocity before impact if it weighs " + Double.toString(u) + "g?", x, "ms^-1", "Projectile Motion");
    }
    
    public Question LS3()
    {
        double y = rnum(15) + 10;
        double x = rnum(5) + 1;
        double t = (Math.sqrt(x*x-2*g*y)-x)/g;
        return new Question("Launching a Ball off of a surface","A ball is kicked off of a building " + Double.toString(y) + "m high with a horizontal velocity of " + Double.toString(x) + "ms^-1. Ignoring fluid resistance, how far does it travel before it hits the ground?", x*t, "ms", "Projectile Motion");
    }
    
    public Question LS4()
    {
        double y = rnum(5) + 1;
        double x = rnum(5) + 1;
        double t = x/g;
        return new Question("Launching a Ball off of a surface","A brick is thrown horizontally out of a building at the velocity of " + Double.toString(y) + "ms^-1. If it has a final vertical velocity of " + Double.toString(x) + "ms^-1, what is its change in displacement?", y*t, "m", "Projectile Motion");
    }
    
    public Question LA1()
    {
        double y = rnum(16) + 15;
        double z = rnum(71) + 10;
        double t = 2*Math.sin(z * 0.0174532925)* y/g;
        return new Question("Launching an object at an angle","A cannon launches a cannonball at a " + Double.toString(z) + " degree angle so that it lands on a surface of the same height. If the initial velocity is " + Double.toString(y) + "ms^-1, how long does it take to reach the ground?",  t, "s", "Projectile Motion", "Angle");
    }
    
    public Question LA2()
    {
        double y = rnum(16) + 15;
        double z = rnum(71) + 10;
        double t = 2*Math.sin(z * 0.0174532925)* y/g;
        return new Question("Launching an object at an angle","A stick of dynamite is placed under a rock so that a shard is launched at a " + Double.toString(z) + " degree angle. If the initial velocity is " + Double.toString(y) + "ms^-1, how far does the shard travel?",  t*Math.cos(z * 0.0174532925)*y, "m", "Projectile Motion", "Angle");
    }
    
    public Question LA3()
    {
        double y = rnum(16) + 15;
        double x = rnum(3) + 1;
        double z = rnum(71) + 10;
        double u = Math.sin(z * 0.0174532925);
        double t = (Math.sqrt(u*u + 2*g*x)-u)/g;
        return new Question("Launching an object at an angle","If a" + Double.toString(x) + "m tall person throws a rugby ball at a" + Double.toString(z) + " degree angle with an initial velocity of " + Double.toString(y) + "ms^-1, what is the change in displacement once the rugby ball hits the ground?",  t*Math.cos(z * 0.0174532925)*y, "m", "Projectile Motion", "Angle");
    }
    
    public Question Vector1()
    {
        double x = rnum(26) + 50;
        double y = rnum(26) + 30;
        return new Question("Vector","If a card heading north at " + Double.toString(x) + "ms^-1 collides into a car heading south at " + Double.toString(y) + "ms^-1, what is the resulting vector from the crash?", x + y, "ms^-1");
    }
    
    public Question Vector2()
    {
        double x = rnum(26) + 60;
        double y = rnum(31) + 30;
        return new Question("Vector","If a ball rolling east at " + Double.toString(x) + "ms^-1 collides into a ball rolling east at " + Double.toString(y) + "ms^-1, what is the resultant velocity?", x - y, "ms^-1");
    }
    
    public Question Vector3()
    {
        double x = rnum(26) + 50;
        double y = rnum(26) + 50;
        return new Question("Vector","If a card heading north at " + Double.toString(x) + "ms^-1 collides into a car heading east at " + Double.toString(y) + "ms^-1, what is the magnitude of the resultant vector?", Math.sqrt(x*x + y*y), "ms^-1");
    }
    
    public Question FLaw1()
    {
        double x = rnum(101) + 1;
        return new Question("First Law","If a cart is moving at a constant velocity of " + Double.toString(x) + "ms^-1, what is the net force acting on the object?", 0, "N", "Force", "Newton", "Law");
    }
    
    public Question FLaw2()
    {
        double x = rnum(101) + 1;
        return new Question("First Law","If an object is falling at a constant speed of " + Double.toString(x) + "ms^-1, what is the net force acting on the object?", 0, "N", "Force", "Newton", "Law");
    }
    
    public Question FLaw3()
    {
        double x = rnum(50) + 100;
        return new Question("First Law","What is the force exerted by the table on a " + Double.toString(x) + "g object?", x*g/1000, "N", "Force", "Newton", "Law");
    }
    
    public Question FLaw4()
    {
        double x = rnum(30)+1;
        return new Question("First Law","What is the mass of an object if the normal force acting on the object is " + Double.toString(x) + "N?", x/g, "kg", "Force", "Newton", "Law");
    }
    
    public Question FSFriction1()
    {
        double x = rnum(30)+20;
        return new Question("Flat Surface Friction","An object is being pulled at a constant speed with a force of " + Double.toString(x) + "N, what is the frictional force between the object and the surface?", x, "N", "Friction", "Force");
    }
    
    public Question FSFriction2()
    {
        double x = rnum(30)+20;
        double y = (rnum(99)+1)/100d;
        return new Question("Flat Surface Friction","An block with a mass of " + Double.toString(x) + "kg is sliding along a surface at a constant speed. If the coefficient of friction between the two objects is " + Double.toString(y) + ", what is the force of friction?", x * g * y, "N", "Friction", "Force");
    }
    
    public Question AORFriction1()
    {
        double y = (rnum(99)+1)/100d;
        return new Question("Angle of Repose","If the coeffecient of static friction between two objects is " + Double.toString(y) + ", calculate the angle of repose.", Math.atan(y)/0.0174532925, "degrees", "Friction", "Force", "Angle");
    }
    
    public Question AORFriction2()
    {
        double y = rnum(30)+20;
        double x = rnum(55)+20;
        double z = y/x;
        return new Question("Angle of Repose","If the normal force exerted on an object is " + Double.toString(y) + "N and the maximum frictional force is " + Double.toString(x) + "N, what is the angle of repose?", Math.atan(z)/0.0174532925, "degrees", "Friction", "Force", "Angle");
    }
    
    public Question AORFriction3()
    {
        double z = rnum(71) + 10;
        return new Question("Angle of Repose","If the angle of repose between two object a and surface b is " + Double.toString(z) + " degrees, what is the coeffecient of friction?", Math.tan(z)/0.0174532925, "degrees", "Friction", "Force", "Angle");
    }
    
    public Question AORFriction4()
    {
        double y = (rnum(99)+1)/100d;
        double x = (rnum(99)+1)/100d;
        double z = rnum(100)+500;
        return new Question("Angle of Repose","A person taps car that weighs " + Double.toString(z) + "kg and is on an incline. If it begins sliding down, what is the new frictional force if the coeffecient of kinetic friction is " + Double.toString(x) + " and the coeffecient of static fraction is " + Double.toString(y) + "?", x * g * z, "N", "Friction", "Force", "Angle");
    }
    
    public Question Fma1()
    {
        double x = rnum(11)+10;
        double y = rnum(6)+5;
        return new Question("Second Law","If an object of mass " + Double.toString(x) + "kg is accelerating at a rate of " + Double.toString(y) + "ms^-2, what is the net force?", x*y, "N", "Force", "Newton", "Law");
    }
    
    public Question Fma2()
    {
        double x = rnum(6)+1;
        double y = rnum(6)+5;
        return new Question("Second Law","If an object experiencing a force of " + Double.toString(x) + "N is accelerating at a rate of " + Double.toString(y) + "ms^-2, what is its mass?", x/y, "kg", "Force", "Newton", "Law");
    }
    
    public Question Fma3()
    {
        double x = rnum(6)+1;
        double y = rnum(11)+10;
        return new Question("Second Law","An object is experiencing a force of " + Double.toString(x) + "N. If it has a mass of " + Double.toString(y) + "kg, what is its acceleration?", x/y, "ms^-2", "Force", "Newton", "Law");
    }
    
    public Question AngledForces1()
    {
        double y = rnum(55)+20;
        double z = rnum(100)+500;
        return new Question("Angled Forces","A car of mass " + Double.toString(z) + "kg is resting on an inclined road with an angle of " + Double.toString(y) + "degrees. What is the force of friction holding the car in place?", Math.sin(y*0.0174532925)*g*z, "N", "Force", "Angled");
    }
    
    public Question AngledForces2()
    {
        double y = rnum(55)+20;
        double z = rnum(10)+50;
        return new Question("Angled Forces","A block of mass " + Double.toString(z) + "kg is resting on an inclined table with an angle of " + Double.toString(y) + "degrees. What is the magnitude of the normal force exerted by the table on the block?", Math.cos(y*0.0174532925)*g*z, "N", "Force", "Angled");
    }
    
    public Question AngledForces3()
    {
        double y = rnum(55)+20;
        double z = rnum(10)+50;
        return new Question("Angled Forces","A block of mass " + Double.toString(z) + "kg is resting on a frictionless table inclined table with an angle of " + Double.toString(y) + "degrees. If it is held in place by a string attached to the top of the incline, what is the pulling force of said string?", Math.sin(y*0.0174532925)*g*z, "N", "Force", "Angled");
    }
    
    public Question AngledForces4()
    {
        double y = rnum(45)+20;
        double z = rnum(10)+50;
        double a = rnum(3) + 3;
        double x = Math.cos(y*0.0174532925)*z*g;
        return new Question("Angled Forces","A stationary object of mass " + Double.toString(z) + "kg is resting on a hill that has an angle of " + Double.toString(y) + "degrees. It is held in place by a person pulling on it. If a person begins to pull it at a cosntant rate of " + Double.toString(a) + "ms^-2, what is the pulling force?", z*a + x, "N", "Force", "Angled");
    }
    
    //Helpers
    public int sign()
    {
        if(rnum(2) == 1)
        return 1;
        else
        return -1;
    }
    
    public int rnum(int max)
    {
       Random randomGenerator = new Random();
       return randomGenerator.nextInt(max);
    }
    
    public Question[] searcher()
    {
        Question[] tempqarray = new Question[52];
        tempqarray[0] = VD1();
        tempqarray[1] = VD2();
        tempqarray[2] = VD3();
        tempqarray[3] = VD4();
        tempqarray[4] = VD5();
        tempqarray[5] = Acc1();
        tempqarray[6] = Acc2();
        tempqarray[7] = Acc3();
        tempqarray[8] = Acc4();
        tempqarray[9] = HoriMot1();
        tempqarray[10] = HoriMot2();
        tempqarray[11] = HoriMot3();
        tempqarray[12] = HoriMot4();
        tempqarray[13] = DropB1();
        tempqarray[14] = DropB2();
        tempqarray[15] = DropB3();
        tempqarray[16] = DropB4();
        tempqarray[17] = DropB5();
        tempqarray[18] = DropB6();
        tempqarray[19] = ThrowB1();
        tempqarray[20] = ThrowB2();
        tempqarray[21] = ThrowB3();
        tempqarray[22] = ThrowB4();
        tempqarray[23] = ThrowB5();
        tempqarray[24] = ThrowB6();
        tempqarray[25] = LS1();
        tempqarray[26] = LS2();
        tempqarray[27] = LS3();
        tempqarray[28] = LS4();
        tempqarray[29] = LA1();
        tempqarray[30] = LA2();
        tempqarray[31] = LA3();
        tempqarray[32] = Vector1();
        tempqarray[33] = Vector2();
        tempqarray[34] = Vector3();
        tempqarray[35] = FLaw1();
        tempqarray[36] = FLaw2();
        tempqarray[37] = FLaw3();
        tempqarray[38] = FLaw4();
        tempqarray[39] = FSFriction1();
        tempqarray[40] = FSFriction2();
        tempqarray[41] = AORFriction1();
        tempqarray[42] = AORFriction2();
        tempqarray[43] = AORFriction3();
        tempqarray[44] = AORFriction4();
        tempqarray[45] = Fma1();
        tempqarray[46] = Fma2();
        tempqarray[47] = Fma3();
        tempqarray[48] = AngledForces1();
        tempqarray[49] = AngledForces2();
        tempqarray[50] = AngledForces3();
        tempqarray[51] = AngledForces4();
        return tempqarray;
    }
    
    public Question rQ()
    {
        int a = rnum(12);
        if(a == 0)
        {
            int b = rnum(5);
            if(b == 0)
            return VD1();
            else if(b == 1)
            return VD2();
            else if(b == 2)
            return VD3();
            else if(b == 3)
            return VD4();
            else if(b == 4)
            return VD5();
        }
        else if(a == 1)
        {
            int b = rnum(4);
            if(b == 0)
            return Acc1();
            else if(b == 1)
            return Acc2();
            else if(b == 2)
            return Acc3();
            else if(b == 3)
            return Acc4();
        }
        else if(a == 2)
        {
            int b = rnum(4);
            if(b == 0)
            return HoriMot1();
            else if(b == 1)
            return HoriMot2();
            else if(b == 2)
            return HoriMot3();
            else if(b == 3)
            return HoriMot4();
        }
        else if(a == 3)
        {
            int b = rnum(6);
            if(b == 0)
            return DropB1();
            else if(b == 1)
            return DropB2();
            else if(b == 2)
            return DropB3();
            else if(b == 3)
            return DropB4();
            else if(b == 4)
            return DropB5();
            else if(b == 5)
            return DropB6();
        }
        else if(a == 4)
        {
            int b = rnum(6);
            if(b == 0)
            return ThrowB1();
            else if(b == 1)
            return ThrowB2();
            else if(b == 2)
            return ThrowB3();
            else if(b == 3)
            return ThrowB4();
            else if(b == 4)
            return ThrowB5();
            else if(b == 5)
            return ThrowB6();
        }
        else if(a == 5)
        {
            int b = rnum(4);
            if(b == 0)
            return LS1();
            else if(b == 1)
            return LS2();
            else if(b == 2)
            return LS3();
            else if(b == 3)
            return LS4();
        }
        else if(a == 6)
        {
            int b = rnum(3);
            if(b == 0)
            return LA1();
            else if(b == 1)
            return LA2();
            else if(b == 2)
            return LA3();
        }
        else if(a == 7)
        {
            int b = rnum(3);
            if(b == 0)
            return Vector1();
            else if(b == 1)
            return Vector2();
            else if(b == 2)
            return Vector3();
        }
        else if(a == 8)
        {
            int b = rnum(4);
            if(b == 0)
            return FLaw1();
            else if(b == 1)
            return FLaw2();
            else if(b == 2)
            return FLaw3();
            else if(b == 3)
            return FLaw4();
        }
        else if(a == 9)
        {
            int b = rnum(2);
            if(b == 0)
            return FSFriction1();
            else if(b == 1)
            return FSFriction2();
        }
        else if(a == 10)
        {
            int b = rnum(4);
            if(b == 0)
            return AORFriction1();
            else if(b == 1)
            return AORFriction2();
            else if(b == 2)
            return AORFriction3();
            else if(b == 3)
            return AORFriction4();
        }
        else if(a == 11)
        {
            int b = rnum(3);
            if(b == 0)
            return Fma1();
            else if(b == 1)
            return Fma2();
            else if(b == 2)
            return Fma3();
        }
         else if(a == 11)
        {
            int b = rnum(4);
            if(b == 0)
            return AngledForces1();
            else if(b == 1)
            return AngledForces2();
            else if(b == 2)
            return AngledForces3();
            else if(b == 3)
            return AngledForces4();
        }
        
        return new Question("Error", "Error", 0, "Error");
    }
    
    public String getUnit(String subunit)
    {
        if(subunit.equals("Velocity") || subunit.equals("Acceleration") || subunit.equals("Horizontal Motion") || subunit.equals("Dropping a ball") || subunit.equals("Throwing a ball") || subunit.equals("Launching a Ball off of a surface") || subunit.equals("Launching an object at an angle"))
        return "K";
        if(subunit.equals("Vector") || subunit.equals("First Law") || subunit.equals("Flat Surface Friction") || subunit.equals("Angle of Repose") || subunit.equals("Second Law") || subunit.equals("Angled Forces"))
        return "F";
        return null;
    }
}
