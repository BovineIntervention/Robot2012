
package edu.wpi.first.wpilibj.templates;


//import edu.wpi.first.wpilibj.camera.AxisCamera;
//import edu.wpi.first.wpilibj.image.ColorImage;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.camera.AxisCamera;
import edu.wpi.first.wpilibj.image.BinaryImage;
import edu.wpi.first.wpilibj.image.ColorImage;
import edu.wpi.first.wpilibj.image.CriteriaCollection;
import edu.wpi.first.wpilibj.image.NIVision;
import edu.wpi.first.wpilibj.image.ParticleAnalysisReport;

public class RobotTemplate extends SimpleRobot {
    
    //Ultrasonic swagSonic = new Ultrasonic(1,2,3,4);  
    AxisCamera cam;
    Jaguar j1  = new Jaguar(1); //back left inverted
    Jaguar j2 = new Jaguar(2); //back right
    Jaguar j3 = new Jaguar(3); //front right
    Jaguar j4 = new Jaguar(4); //front left inverted
    Jaguar j5 = new Jaguar(5);  //bottom shooting wheels
    Jaguar j6 = new Jaguar(6);  //loading arm
    Jaguar j7 = new Jaguar(7);  // top shooting wheels
    Relay spike = new Relay(1); // belt spike
    DigitalInput elsich = new DigitalInput(1);
    DigitalInput elsich2 = new DigitalInput(2);
 //   DigitalInput elsich3 = new DigitalInput(3);
   // DigitalInput elsich4 = new DigitalInput(4);
    Joystick leftStick = new Joystick(1); // joystick1
    Joystick rightStick = new Joystick(2);
    Object swagject = new Object();
    Gyro superawsomegyro = new Gyro(1);
    KinectStick left = new KinectStick(1);
    KinectStick right = new KinectStick(2);
    Relay bridge = new Relay(2);    
    KinectStick head = new KinectStick(3);
    
   // RobotDrive hDrive = new RobotDrive(j2, j4, j1, j3);
    
    
    Timer time2 = new Timer();
  
  //  Servo s1 = new Servo(5); // camera rotation
   // Servo s2 = new Servo(6);
   // AxisCamera camera;
    //ColorImage image;
    
    //double[] servoPosition = new double[2]; // camera rotation
    
    public void autonomous() {
        Timer time = new Timer();
        time.start();
        time.reset();
        time2.start();
        this.time2.reset();
        boolean blah = this.swagject.getClass().desiredAssertionStatus();
        Object[] asdfa = new Object[3];
        Jaguar[] lulz = new Jaguar[2];
        DigitalInput[] elsiches = new DigitalInput[7];
        Gyro[] megaawesomegyroes = new Gyro[5];
        
        
        
        
        while(time.get() < 15) {
                bridge.set(Relay.Value.kReverse);

               /* if (time.get() > 15) {
                j1.set(left.getY(GenericHID.Hand.kLeft)*-1);
                j2.set(right.getY(GenericHID.Hand.kRight));
                j3.set(right.getY(GenericHID.Hand.kRight));
                j4.set(left.getY(GenericHID.Hand.kLeft)*-1);
                }*/
                
                if(time.get() > 3)
                    bridge.set(Relay.Value.kOff);
                 if(time.get()>5 && time.get() < 7 || time.get() > 11) {
                    spike.set(Relay.Value.kReverse);
                  } else { 
                     spike.set(Relay.Value.kOff);
                  }
               
            
           if (time.get() > 0) {
                
            
            j5.set(1);
            this.j7.set(1);
            
            }
           // swagSonic.getRangeMM();
            
            
            
        }        time2.stop();
        
        
             
    }

   
    public void operatorControl() {
        boolean driveSystem = false;
        double ratio =0;
        boolean init = true;
        double area;
        double rat;
        String out = "";
        boolean allignCommand = true;
        getWatchdog().kill();
    ; // R.I.P. super.this.threads
        superawsomegyro.reset();;
        spike.set(Relay.Value.kOff);
     //   ColorImage image;
      //  BinaryImage image2;
    //    BinaryImage image3;
  //      BinaryImage image4;
        int spikeState = 0;
        j1.set(0);
        this.j2.set(0<1?0:0);
        j3.set(0);
        j4.set(0);
        j5.set(0);
        this.j6.set(0);
        j7.set(0);
        int counter = 0;
     //   CriteriaCollection cc = new CriteriaCollection();
   //     cc.addCriteria(NIVision.MeasurementType.IMAQ_MT_BOUNDING_RECT_WIDTH, 0, 55, true);
    /*    AnalogChannel a = new AnalogChannel(3);
        
        String volts = Double.toString(a.getVoltage());

        DriverStationLCD.getInstance().println(DriverStationLCD.Line.kMain6, 4, "Squishiness:" + volts);
  */ //       cam = AxisCamera.getInstance();  
            while (true && isOperatorControl() && isEnabled()) { // loop until change
//System.out.println("ASFD");
      //try{
                
               // image = cam.getImage();
            //    image.write("C:/Users/Developer/Desktop/test.png");
             //   image2 = image.thresholdHSL(113, 189, 61, 255, 126, 227);
                
           //     image3 = image2.particleFilter(cc);

         //       image4 = image3.convexHull(true);
               // System.out.println(image2.getNumberParticles());

                
       //         if(init)
                //{
              //      ratio = 0.4488188976;
            //        init = false;
          //      }
              //  System.out.println(image4.getNumberParticles());
            //    for(int i =0;i<image4.getNumberParticles();i++)
          //          {
        //   rat = (double)image4.getParticleAnalysisReport(i).boundingRectHeight/
                   //         image4.getParticleAnalysisReport(i).boundingRectWidth;
                 //       if(rat > ratio-.1 && rat < ratio+.1)
               //         {
             //               ratio = rat;
           //                 area = image4.getParticleAnalysisReport(i).particleArea;
         //                   out="";
       //                      out += "Found, Width: " + i+":"+image4.getParticleAnalysisReport(i).boundingRectWidth;
     //                       DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 1, out);
   //                         DriverStationLCD.getInstance().updateLCD();
                           /* if(allignCommand) {
                                int centerX = image2.getParticleAnalysisReport(i).center_mass_x;
                                System.out.println(centerX);
                                if(centerX > 160 + 10) {
                                    System.out.println("RIGHT");
                                    j1.set(-.05);
                                    j2.set(-.05);
                                    j3.set(-.05);
                                    j4.set(-.05);
                                }
                                else if(centerX < 160 - 10) {
                                    System.out.println("LEFT");
                                    j1.set(.05);
                                    j2.set(.05);
                                    j3.set(.05);
                                    j4.set(.05);
                                }
                            }*/
 //                           break;
                     //   }else{out="";
                   //         DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 1, out);
                 //           DriverStationLCD.getInstance().updateLCD();}
               //     }    

             //   image.free();
           //     image2.free();
         //       image3.free();
       //         image4.free();
     //           }catch(Exception e){e.printStackTrace();};
                
   //            if(leftStick.getRawButton(1) && counter >= 150 && !driveSystem)
 //              {
             //      driveSystem = true;
           //        counter = 0;
         //      }
       //        else if (leftStick.getRawButton(1) && counter >= 150 && driveSystem)
     //          {
                  // driveSystem = false;
                //   counter = 0;
              // }
            //   counter++;
          //     String temp = "";
        //       temp += driveSystem;
      //        DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser2, 1, temp);
              
          //    if(!driveSystem)
        //      {
                //j1.set(left.getY(GenericHID.Hand.kLeft)*-1);
              //  j2.set(right.getY(GenericHID.Hand.kRight));
            //    j3.set(right.getY(GenericHID.Hand.kRight));
          //      j4.set(left.getY(GenericHID.Hand.kLeft)*-1);
        //      }
                if(leftStick.getRawButton(4))
                {
                    j6.set(-1.0);
                }
                else if(leftStick.getRawButton(1))
                {
                    j6.set(1.0);
                }
   
                if(leftStick.getRawButton(2) && j7.get() < 1.0 && j5.get() < 1.0) {
                    j5.set(j5.get() + .01);
                     j7.set(j7.get() + .01);
                } else if (leftStick.getRawButton(3) && j5.get() > 0 && j7.get() > 0) {
    
                     //this slows the speed of the luanching wheels
                     
                     j5.set(j5.get() - .01);
                     
                     j7.set(j7.get() - .01);
                    
                }
                
                
                
                
                if(leftStick.getRawAxis(3) > .75)
                {
                    spike.set(Relay.Value.kForward);
                     System.out.println("forward");
                }
                else if(leftStick.getRawAxis(3) < -.75)       
                {
                    spike.set(Relay.Value.kReverse);
                    System.out.println("reverse");
                }
                else
                    spike.set(Relay.Value.kOff);
                
                
                if(leftStick.getRawButton(8)){j5.set(.9);j7.set(1);
                
                } else if (leftStick.getRawButton(7)) {
                    
                    j5.set(1);j7.set(.9);
                    
                    
                } else if (leftStick.getRawAxis(6) >.5) {
                    
                    j5.set(0);j7.set(0);
                    
                    
                }
                
                //head left 2 head right 2
                /*if(head.getRawButton(1))
                    bridge.set(Relay.Value.kForward);
                else if(head.getRawButton(2))
                    bridge.set(Relay.Value.kReverse);
                else
                    bridge.set(Relay.Value.kOff);*/
                
                
                //start copy
                /*if((right.getY(GenericHID.Hand.kRight) > .2 || right.getY(GenericHID.Hand.kRight) < -.2) && (right.getX(GenericHID.Hand.kRight) < .2 && right.getX(GenericHID.Hand.kRight) > -.2)) {
                    //rawaxis 3 == x axis
                    //rawaxis 4 == y axis
                    j1.set(right.getY(GenericHID.Hand.kRight) * -1);
                    j2.set((right.getY(GenericHID.Hand.kRight)));
                    j3.set(right.getY(GenericHID.Hand.kRight));
                    j4.set(right.getY(GenericHID.Hand.kRight) * -1);    
    
                } else if((right.getX(GenericHID.Hand.kRight) > .2 || right.getX(GenericHID.Hand.kRight) < -.2) && (right.getY(GenericHID.Hand.kRight) < .2 && right.getY(GenericHID.Hand.kRight) > -.2)) {
    
                    // Sets motor speed for right and right strafing
                    j1.set(right.getX(GenericHID.Hand.kRight) * -1);
                    j2.set(right.getX(GenericHID.Hand.kRight) * -1);
                    j3.set(right.getX(GenericHID.Hand.kRight));
                    j4.set(right.getX(GenericHID.Hand.kRight));
    
                } else if(right.getY(GenericHID.Hand.kRight) < -.2 && right.getX(GenericHID.Hand.kRight) > .2) {
                    //diagnal back right
                    j1.set(0);
                    j2.set(right.getY(GenericHID.Hand.kRight)>-.5&&right.getX(GenericHID.Hand.kRight)>.5?-.5:-.9);
                    j3.set(0);
                    j4.set((right.getY(GenericHID.Hand.kRight)>-.5&&right.getX(GenericHID.Hand.kRight)>-.5?.5:.9);
     
                } else if(right.getY(GenericHID.Hand.kRight) < -.2 && right.getX(GenericHID.Hand.kRight) < -.2) {
        //diagnal back right
                    j1.set(right.getY(GenericHID.Hand.kRight)>-.5&&right.getX(GenericHID.Hand.kRight)>-.5?.5:.9);
                    j2.set(0);
                    j3.set(right.getY(GenericHID.Hand.kRight)>-.5&&right.getX(GenericHID.Hand.kRight)>-.5?-.5:-.9);
                    j4.set(0);
   
                } else if(right.getY(GenericHID.Hand.kRight) > .2 && right.getX(GenericHID.Hand.kRight) > .2) {
        //diagnal front right
                    j1.set(right.getY(GenericHID.Hand.kRight)>-.5&&right.getX(GenericHID.Hand.kRight)>-.5?-.5:-.9);
                    j2.set(0);
                    j3.set(right.getY(GenericHID.Hand.kRight)>-.5&&right.getX(GenericHID.Hand.kRight)>-.5?.5:.9);
                    j4.set(0);
    
                } else if(right.getY(GenericHID.Hand.kRight) > .2 && right.getX(GenericHID.Hand.kRight) < -.2) {
        //diagnal front right
                    j1.set(0);
                    j2.set(right.getY(GenericHID.Hand.kRight)>-.5&&right.getX(GenericHID.Hand.kRight)>-.5?.5:.9);
                    j3.set(0);
                    j4.set(right.getY(GenericHID.Hand.kRight)>-.5&&right.getX(GenericHID.Hand.kRight)>-.5?-.5:-.9);
    
                }*/
                //end copy
               // if(left.getY(GenericHID.Hand.kLeft) < .2 && left.getY(GenericHID.Hand.kLeft) > -.2)
                //    bridge.set(Relay.Value.kForward);
                //else if(left.getY(GenericHID.Hand.kLeft) < .35)
                  //  bridge.set(Relay.Value.kReverse);
                //else
                  //  bridge.set(Relay.Value.kOff);
                time2.reset();
              //  try{System.out.println(superawsomegyro.getAngle());}catch(Exception e){}
      //          double range = swagSonic.getRangeInches();
       //         String powerlevel = range<12?"Don't Try, too close":range<24?"1":range<36?"3":range<55?"4":range<145?"5":"Too far to make Basket";
         //       String powerlevelm = range<12?"Don't Try, too close":range<24?"1":range<36?"3":range<55?"4":range<145?"5":"Too far to make Basket";
           //     String powerlevell = range<12?"Don't Try, too close":range<24?"1":range<36?"3":range<55?"4":range<145?"5":"Too far to make Basket";
                
             //   DriverStationLCD.getInstance().println(DriverStationLCD.Line.kMain6, 1,Double.toString(swagSonic.getRangeInches()));
               // DriverStationLCD.getInstance().println(DriverStationLCD.Line.kMain6, 2, "Recomended Power Level top basket is " + powerlevel);
               // DriverStationLCD.getInstance().println(DriverStationLCD.Line.kMain6, 3, "Recomended Power Level middle basket is " + powerlevel);
               // DriverStationLCD.getInstance().println(DriverStationLCD.Line.kMain6, 4, "Recomended Power Level lower basket is " + powerlevel);
                
               
                
               //String string = this.toString();
              // System.out.println(string);
           // String  STring = Integer.toString(string.toString().toString().toCharArray().toString().compareTo(string.toString().toString())).toString();
               // if(true==true && false==false)
                 //   this.getSwag();
                
                //else
                 // if (true==false && false==true)
               //     this.die();
             
    //           if(driveSystem)
  //             {
                if((leftStick.getRawAxis(2) > .2 || leftStick.getRawAxis(2) < -.2) && (leftStick.getRawAxis(1) < .2 && leftStick.getRawAxis(1) > -.2)) {
    
                    j1.set(leftStick.getRawAxis(2) * -1);
                    j2.set((leftStick.getRawAxis(2)));
                    j3.set(leftStick.getRawAxis(2));
                    j4.set((leftStick.getRawAxis(2)) * -1);
                    
                    
    
    
                } else if((leftStick.getRawAxis(1) > .2 || leftStick.getRawAxis(1) < -.2) && (leftStick.getRawAxis(2) < .2 && leftStick.getRawAxis(2) > -.2)) {
    
                    // Sets motor speed for left and right strafing
                    j1.set(leftStick.getRawAxis(1) * -1);
                    j2.set(leftStick.getRawAxis(1) * -1);
                    j3.set(leftStick.getRawAxis(1));
                    j4.set(leftStick.getRawAxis(1));
    
                } else if(leftStick.getRawAxis(1) > .2 && leftStick.getRawAxis(2) > .2) {
                    //diagnal back right
                    j1.set(leftStick.getRawAxis(1)<.5&&leftStick.getRawAxis(2)<.5?-.5:-.9);
                    j2.set(0);
                    j3.set(leftStick.getRawAxis(1)<.5&&leftStick.getRawAxis(2)<.5?.5:.9);
                    j4.set(0);
     
                } else if(leftStick.getRawAxis(2) > .2 && leftStick.getRawAxis(1) < -.2) {
        //diagnal back left
                    j1.set(0);
                    j2.set(leftStick.getRawAxis(2)<.5&&leftStick.getRawAxis(1)>-.5?.5:.9);
                    j3.set(0);
                    j4.set(leftStick.getRawAxis(2)<.5&&leftStick.getRawAxis(1)>-.5?-.5:-.9);
   
                } else if(leftStick.getRawAxis(2) < -.2 && leftStick.getRawAxis(1) > .2) {
        //diagnal front right
                    j2.set(leftStick.getRawAxis(2)>-.5&&leftStick.getRawAxis(1)<.5?-.5:-.9);
                    j1.set(0);
                    j4.set(leftStick.getRawAxis(2)>-.5&&leftStick.getRawAxis(1)<.5?.5:.9);
                    j3.set(0);
    
                } else if(leftStick.getRawAxis(2) < -.2 && leftStick.getRawAxis(1) < -.2) {
        //diagnal front left
                    j2.set(0);
                    j1.set(leftStick.getRawAxis(2)>-.5&&leftStick.getRawAxis(1)>-.5?.5:.9);
                    j4.set(0);
                    j3.set(leftStick.getRawAxis(2)>-.5&&leftStick.getRawAxis(1)>-.5?-.5:-.9);
    
                } else if(leftStick.getRawButton(6)) {
    
                    // Spins robot right when button 6 is press, speed based on Z axis
                    j1.set(.6);
                    j2.set(.6);
                    j3.set(.6);
                    j4.set(.6);
       
                } else if(leftStick.getRawButton(5)) {
    
                    // Spins robot left when button 5 is press, speed based on Z axis
                    j1.set(-.6);
                    j2.set(-.6);
                    j3.set(-.6);
                    j4.set(-.6);
 
                } else {
                    
                    j1.set(0);
                    j2.set(0);
                    j3.set(0);
                    j4.set(0);
     
 
                }
      //         }
                
                
                
         /*    }
          * 
          * 
 }//else2
 }//else1
}//3
}//4
}//5 
    }
    }
             ;;
 */
 
        /*
 Camera Rotation

 */

     /*  while(rightStick.getRawAxis(2) < -.1 || rightStick.getRawAxis(2) > .1 || rightStick.getRawAxis(1) >.1|| rightStick.getRawAxis(1) < -.1) {
         
                     if(rightStick.getRawAxis(2) > .2 && servoPosition[0] >= 0) {
                    
                         s1.set(servoPosition[0] -= .000017);//Y axis
         
                     } else if(rightStick.getRawAxis(2) < -.2 && servoPosition[0]<= 1) {
                         
                        s1.set(servoPosition[0] += .000017);
            
                     }

                     if(rightStick.getRawAxis(1) > .2 && servoPosition[1] <= 1) {
         ;;
                         s2.set(servoPosition[1] += .000017);
         
                     } else if(rightStick.getRawAxis(1) < -.2 && servoPosition[1] >= 0) {
         
                         s2.set(servoPosition[1] -= .000017);
         
                     }
       
                 }
                 
                
    
    

                 try {
    
                     image.free();

                 }catch(Exception e){}


                 try {

    
                     image = AxisCamera.getInstance().getImage();


                 }catch(Exception e){}


                 if(rightStick.getRawButton(6)) {
    
                     servoPosition[1] = .5;
                     s2.set(.5);
    
                 }*/;;;;


                 if (rightStick.getRawButton(4) && j7.get() < 1.0 && j5.get() < 1.0) {
                     
                     
           ;;;;          //this increases the speed of the luanching wheels
                     j5.set(j5.get() + .01);
                     j7.set(j7.get() + .01);
                 }

                 if (rightStick.getRawButton(5) && j5.get() > 0 && j7.get() > 0) {
    
                     //this slows the speed of the luanching wheels
                     
                     j5.set(j5.get() - .01);
                     
                     j7.set(j7.get() - .01);
                 }
                 
                 //if (leftStick.getRawButton(7)) {
                     
                   //  j5.set(1);
                     //j7.set(.95);
                     
                 //}
                 
                 if (rightStick.getRawButton(6)) {
                     
                     j5.set(1);
                     j7.set(.90);
                     
                 }
                 
                // if (leftStick.getRawButton(5)) {
                     
                     
                  //   j5.set(0);
                    // j7.set(0);
                     
                 //}

                 if (rightStick.getRawButton(7)) {
    
                     //this is a failsafe so if the press 7 the luanching wheels stop
                     j5.set(0);
                     j7.set(0);
                 }
                 String sj5="";
                 String sj7="";
                 sj7 = Double.toString(j7.get());
                 sj5 = Double.toString(j5.get());

                 if (rightStick.getRawButton(1)) {
    
                     //theese next two ifs change wheather the loading belt is on or not
                     spike.set(Relay.Value.kOn);
                        spike.set(Relay.Value.kReverse);

                 }else if(leftStick.getRawButton(10)) {
                  
                     spike.set(Relay.Value.kReverse);   
                 
                 }else if(leftStick.getRawButton(9))
                 {
                     spike.set(Relay.Value.kForward);
                 }else if (!rightStick.getRawButton(1) && !leftStick.getRawButton(10)) {
                     {
                     spike.set(Relay.Value.kOff);

                 }
                 
                 }
                 if (rightStick.getRawButton(2) /*&& !elsich.get()*/) {
    
                 
                     j6.set(-1);
                     
                 }    

                 if (rightStick.getRawButton(3) /*&& !elsich2.get()*/) {
    
                 
                     j6.set(1);
                     
                 }    
                     

                 if (!rightStick.getRawButton(3) && !rightStick.getRawButton(2)) {
                     ;;;
                     //this sets the speed of the loading arm to zero if it is not mving up or down
                     j6.set(0);
                     
                 }
                 
             //    if (leftStick.getRawButton(9)) {
                     
               //      if (superawsomegyro.getAngle() > 10) {
                         
             //            j1.set(.1);
           //              j2.set(-.1);
         //                j3.set(-.1);
       //                  j4.set(.1);
     //;                    
    //                 } else if (superawsomegyro.getAngle() < -10) {
  //;;;                       
 //;      //                 j1.set(-.1);
      //                   j2.set(.1);
    //                     j3.set(.1);
  //                       j4.set(-.1);
                         
//;                     } else if (superawsomegyro.getAngle() < -2 && superawsomegyro.getAngle() > -10) {
                         //;;;
                       //  j1.set(-.1);
                     //    j2.set(.1);
                   //      j3.set(.1);
                 //        j4.set(-.1);
               //          ;;;
             //        } else if (superawsomegyro.getAngle() > 2 && superawsomegyro.getAngle() < 10) {
                         
                         //j1.set(.1);
                       //  j2.set(-.1);
                     //    j3.set(-.1);
                   //      j4.set(.1);
                         
                 //    } else {
               //          
             //            j1.set(0);
           //              j2.set(0);
              //           j3.set(0);
            //             j4.set(0);
          //              ;; 
        //             }
                     
                                          
                     
                     
                 
                 
                     
                     
                     
                 }
    
         }
            
    }
    

    
  //  public static void die() {
        
    //    boolean True = false;
     //   boolean False = true;
      //  ;;;;;
   // }
   // ;
   // public static void getSwag() {
        
        
        //System.out.println("Balls Fun Swag Warm-Up Semicolon");
     //   ;;;;
   // }
    
//}// this is a comment
// this is a comment below a comment
// this is a comment below a comment thats below a comment
// this is a comment below a comment thats below a comment thats below a comment
// this is a comment below a comment thats below a comment thats below a comment thats below a comment
// this is a comment below a comment thats below a comment thats below a comment thats below a comment
// this is a comment below a comment thats below a comment thats below a co mment thats below a comment thats below a comment
// this is a comment below a comment thats below a comment thats below a comment thats below a comment thats below a comment thats below a comment
/*
 *
 *
 *
 * a few more comments below some comments
 *                                   |              |       
 *                              |    |      /\      |     |                               
 *                              |    |     /  \     |     |                                       
 *                              \     \    \  /    /     /                                    
 *                               \     \    \/    /     /                                                 
 *                                \     \   /\   /     /                                  
/*                                 \     \ /  \ /     /                                     
*                                   \     /    \     /                                            
*                                    \   /      \   /                         
 *                                    \_/        \_/                       
 *                                      \        /              
 *                                       \      /                                     
 *                                      / \    / \                 
 *                                     /   \  /   \                            
 *                                    /     \/     \                                  
 *                                   /              \           
 *                                  /                \           
 *                                 |                  |                 
 *                                 |                  |                   
 *                                 |                  |               
 * 
 *
 *
 *      ___       ___
 *     /   \     /   \
 *    |  0  |   |  0  |
 *     \___/     \___/
 *            O
 *   \                /
 *    \______________/
 *              | |
 *              | |
 *///           \_/
/*               /
 *
 *
 *
 *
 *
 *
 *    _
 *   / \   /
 *  /   \_/
 * /
 *
 *

// */