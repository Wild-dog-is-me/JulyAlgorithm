package org.dog.July_14;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ice_water
 * @Date: 2022/07/14/10:34 PM
 */

class Solution3 {
  public int robotSim(int[] commands, int[][] obstacles) {
    int[] xdir = {0,1,0,-1};
    int[] ydir = {1,0,-1,0};
    Set<String> bar = new HashSet<>();
    for(int i = 0; i < obstacles.length; i++){
      bar.add(obstacles[i][0]+" "+obstacles[i][1]);
    }
    int xnow = 0;
    int ynow = 0;
    int dirnow = 0;
    int max = 0;
    for(int i = 0; i < commands.length; i++){
      if(commands[i] > 0){
        for(int j = 0; j < commands[i]; j++){
          String barkey = (xnow + xdir[dirnow]) + " " + (ynow + ydir[dirnow]);
          if(bar.contains(barkey)){
            break;
          }
          xnow += xdir[dirnow];
          ynow += ydir[dirnow];
          int dis = xnow*xnow+ynow*ynow;
          if(dis > max){
            max = dis;
          }
        }
      }
      if(commands[i] < 0){
        if(commands[i] == -1){
          dirnow += 1;
        }
        if(commands[i] == -2){
          dirnow += 3;
        }
        dirnow = dirnow % 4;
      }
    }
    return max;
  }
}
