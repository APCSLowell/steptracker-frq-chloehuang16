import java.util.ArrayList;
public class StepTracker
{
 private int stepsNeed;
 private int allSteps;
 private int days; 
 private int activeDays;
 public StepTracker(int stepsGoal){
  stepsNeed = stepsGoal;
  allSteps = 0;
  days = 0;
  activeDays = 0;
 }
 public void addDailySteps(int steps){
  allSteps += steps;
  days++;
  if (steps >= stepsNeed){
   activeDays++;
  }
 }
 public int activeDays(){
  return activeDays;
 }
 public double averageSteps(){
  if (days == 0){
   return 0.0;
  }
  else{
   return (double)totalSteps/totalDays;
  }
 }
}

