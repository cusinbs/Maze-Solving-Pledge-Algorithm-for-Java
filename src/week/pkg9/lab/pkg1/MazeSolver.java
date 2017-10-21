/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week.pkg9.lab.pkg1;

import java.util.ArrayList;

/**
 *
 * @author Welcomes
 */
public class MazeSolver {
    private String[] maze;
    private int startX, startY;
    
    public MazeSolver(String[] maze, int x, int y){
        this.maze = maze;
        this.startX = x;
        this.startY = y;
    }
    
    public ArrayList<int[]> SolveMaze(){
        int cr = startX, cc = startY, dir = 0, dirF = 0; //cr: current row, cc: current column, dir: direction its point to, dirF: Future direction
        boolean done = false;
        ArrayList<int[]> solveSteps = new ArrayList<int[]>(); // 2D dynamic array to store steps
        int[] start = {cr,cc};
        solveSteps.add(start);
        
        
        while(!done){
            int[] step = new int[2];
            if(dir == 1){ //Left
                char[] line = maze[cr].toCharArray();
                line[cc] = '<';
                maze[cr] = String.valueOf(line);
                if(maze[cr-1].charAt(cc) != '#' && maze[cr-1].charAt(cc) != '@'){//Turn Right of Left(Up)
                    dirF = 0;
                    cr--;
                }else if(maze[cr].charAt(cc-1) != '#' && maze[cr].charAt(cc-1) != '@'){//Go Straigt of Left(Left)
                    dirF = 1;
                    cc--;
                }else if(maze[cr+1].charAt(cc) != '#' && maze[cr+1].charAt(cc) != '@'){//Turn Left of Left(Down)
                    dirF = 2;
                    cr++;
                }else if(maze[cr].charAt(cc+1) != '#' && maze[cr].charAt(cc+1) != '@'){//Turn Back of Left(Right)
                    dirF = 3;
                    cc++;
                }
                
            }
            
            if(dir == 2){ //Down
                char[] line = maze[cr].toCharArray();
                line[cc] = 'v';
                maze[cr] = String.valueOf(line);
                if(maze[cr].charAt(cc-1) != '#' && maze[cr].charAt(cc-1) != '@'){//Turn Right of Down(Left)
                    dirF = 1;
                    cc--;
                }else if(maze[cr+1].charAt(cc) != '#' && maze[cr+1].charAt(cc-1) != '@'){//Go Straigt of Down(Down)
                    dirF = 2;
                    cr++;
                }else if(maze[cr].charAt(cc+1) != '#' && maze[cr].charAt(cc+1) != '@'){//Turn Left of Down(Right)
                    dirF = 3;
                    cc++;
                }else if(maze[cr-1].charAt(cc) != '#' && maze[cr-1].charAt(cc) != '@'){//Turn Back of Down(Up)
                    dirF = 0;
                    cr--;
                }
            }
            
            if(dir == 3){//Right
                char[] line = maze[cr].toCharArray();
                line[cc] = '>';
                maze[cr] = String.valueOf(line);
                if(maze[cr+1].charAt(cc) != '#' && maze[cr+1].charAt(cc) != '@'){//Turn Right of Right(Down)
                    dirF = 2;
                    cr++;
                }else if(maze[cr].charAt(cc+1) != '#' && maze[cr].charAt(cc+1) != '@'){//Go Straigt of Right(Right)
                    dirF = 3;
                    cc++;
                }else if(maze[cr-1].charAt(cc) != '#' && maze[cr-1].charAt(cc) != '@'){//Turn Left of Right(Up)
                    dirF = 0;
                    cr--;
                }else if(maze[cr].charAt(cc-1) != '#' && maze[cr].charAt(cc-1) != '@'){//Turn Back of Right(Left)
                    dirF = 1;
                    cc--;
                }
            }
            
            if(dir == 0){//Up
                char[] line = maze[cr].toCharArray();
                if(line[cc] != '@'){
                    line[cc] = '^';
                }
                maze[cr] = String.valueOf(line);
                if(maze[cr].charAt(cc+1) != '#' && maze[cr].charAt(cc+1) != '@'){//Turn Right of Up(Right)
                    dirF = 3;
                    cc++;
                }else if(maze[cr-1].charAt(cc) != '#' && maze[cr-1].charAt(cc) != '@'){//Go Straigt of Up(Up)
                    dirF = 0;
                    cr--;
                }else if(maze[cr].charAt(cc-1) != '#' && maze[cr].charAt(cc-1) != '@'){//Turn Left of Up(Left)
                    dirF = 1;
                    cc--;
                }else if(maze[cr+1].charAt(cc) != '#' && maze[cr+1].charAt(cc) != '@'){//Turn Back of Up(Down)
                    dirF = 2;
                    cr++;
                }
            }
            
            if(maze[cr].charAt(cc) == '*'){
                done = true;
            }
            dir = dirF;
            step[0] = cr;
            step[1] = cc;
            solveSteps.add(step);
        }
        return solveSteps;
    }
}
