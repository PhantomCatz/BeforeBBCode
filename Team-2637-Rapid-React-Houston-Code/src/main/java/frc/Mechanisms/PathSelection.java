package frc.Mechanisms;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import frc.robot.Robot;

/***************************************************************************
    *
    * Autonomous selections
    * 
***************************************************************************/
public class PathSelection
{  
    private final int LEFT_POS = 1;
    private final int MIDDLE_POS_2_CARGO = 2;
    private final int MIDDLE_POS_4_CARGO = 3;
    private final int RIGHT_POS = 4;

    private final int LEFT_BEACH_POS = 5;
    private final int MIDDLE_BEACH_POS_3_CARGO = 6;
    private final int MIDDLE_BEACH_POS_5_CARGO =7;
    private final int RIGHT_BEACH_POS = 8;

    private final SendableChooser<Boolean> chosenAllianceColor = new SendableChooser<>();
    private final SendableChooser<Integer> chosenPath = new SendableChooser<>();

    
    public void initializePathOptions()
    {
        chosenAllianceColor.setDefaultOption("Blue Alliance", Robot.constants.BLUE_ALLIANCE);
        chosenAllianceColor.addOption("Red Alliance", Robot.constants.RED_ALLIANCE);
        SmartDashboard.putData(Robot.constants.ALLIANCE_COLOR, chosenAllianceColor);

        chosenPath.setDefaultOption(Robot.constants.POSITION_SELECTOR1, 1);
        chosenPath.addOption(Robot.constants.POSITION_SELECTOR2, 2);
        chosenPath.addOption(Robot.constants.POSITION_SELECTOR3, 3);
        chosenPath.addOption(Robot.constants.POSITION_SELECTOR4, 4);
        chosenPath.addOption(Robot.constants.POSITION_SELECTOR5, 5);
        chosenPath.addOption(Robot.constants.POSITION_SELECTOR6, 6);
        chosenPath.addOption(Robot.constants.POSITION_SELECTOR7, 7);
        chosenPath.addOption(Robot.constants.POSITION_SELECTOR8, 8);
        SmartDashboard.putData(Robot.constants.ALLIANCE_POSITION, chosenPath);
    }


    public void determinePath()
    {
        if(chosenAllianceColor.getSelected() == Robot.constants.BLUE_ALLIANCE)
        {
            if(chosenPath.getSelected() == LEFT_POS)
            {
                Robot.auton.blueLeftFender();
            }
            else if(chosenPath.getSelected() == MIDDLE_POS_2_CARGO)
            {
                Robot.auton.blueMiddleTwoCargo();
            }
            else if(chosenPath.getSelected() == MIDDLE_POS_4_CARGO)
            {
                Robot.auton.blueMiddleFourCargo();
            }
            else if(chosenPath.getSelected() == RIGHT_POS)
            {
                Robot.auton.blueRightFender();
            }

            
            else if(chosenPath.getSelected( ) == LEFT_BEACH_POS)
            {
                Robot.auton.blueBeachLeftFender();
            }
            else if(chosenPath.getSelected() == MIDDLE_BEACH_POS_3_CARGO)
            {
                Robot.auton.blueBeachMiddleThreeCargo();
            }
            else if(chosenPath.getSelected()== MIDDLE_BEACH_POS_5_CARGO)
            {
                Robot.auton.blueBeachMiddleFiveCargo();
            }
            else if(chosenPath.getSelected() == RIGHT_BEACH_POS)
            {
                Robot.auton.blueBeachRightFender();
            }
            
        }
        else
        {
            if(chosenPath.getSelected() == LEFT_POS)
            {
                Robot.auton.redLeftFender();
            }
            else if(chosenPath.getSelected() == MIDDLE_POS_2_CARGO)
            {
                Robot.auton.redMiddleTwoCargo();
            }
            else if(chosenPath.getSelected() == MIDDLE_POS_4_CARGO)
            {
                Robot.auton.redMiddleFourCargo();
            }
            else if(chosenPath.getSelected()== RIGHT_POS)
            {
                Robot.auton.redRightFender();
            }


            else if(chosenPath.getSelected( ) == LEFT_BEACH_POS)
            {
                Robot.auton.redBeachLeftFender();
            }
            else if(chosenPath.getSelected() == MIDDLE_BEACH_POS_3_CARGO)
            {
                Robot.auton.redBeachMiddleThreeCargo();
            }
            else if(chosenPath.getSelected()== MIDDLE_BEACH_POS_5_CARGO)
            {
                Robot.auton.redBeachMiddleFiveCargo();
            }
            else if(chosenPath.getSelected() == RIGHT_BEACH_POS)
            {
                Robot.auton.redRightFender();
            }
            
        }
    }
}