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
public class Week9Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<int[]> result = new ArrayList<int[]>();
        System.out.println("Maze 1");
        String[] maze1 = {"#######","#*...@#","#######"};
        MazeSolver solveMaze1 = new MazeSolver(maze1, 1, 5);
        printMaze(maze1);
        System.out.println("Solved Steps:");
        printSteps(solveMaze1.SolveMaze());
        printMaze(maze1);
        
        
        System.out.println("\nMaze 2");
        String[] maze2 = {"#######","#...#@#","#*#...#","#######"};
        MazeSolver solveMaze2 = new MazeSolver(maze2, 1, 5);
        printMaze(maze2);
        System.out.println("Solved Steps:");
        printSteps(solveMaze2.SolveMaze());
        printMaze(maze2);
        
        System.out.println("\nMaze 3");
        String[] maze3 = {"##########","#...#....#","#*#....#@#","#.#.#..#.#","##########"};
        MazeSolver solveMaze3 = new MazeSolver(maze3, 2, 8);
        printMaze(maze3);
        System.out.println("Solved Steps:");
        printSteps(solveMaze3.SolveMaze());
        printMaze(maze3);
        
        System.out.println("\nMaze 4");
        String[] maze4 = {"############","##@........#","###..*######","############"};
        MazeSolver solveMaze4 = new MazeSolver(maze4, 1, 2);
        printMaze(maze4);
        System.out.println("Solved Steps:");
        printSteps(solveMaze4.SolveMaze());
        printMaze(maze4);
        
        System.out.println("\nMaze 5");
        String[] maze5 = {"############","#.#........#","#.#.######.#","#......#...#","#.###.@#.#.#","#..*####.#.#","############"};
        MazeSolver solveMaze5 = new MazeSolver(maze5, 4, 6);
        printMaze(maze5);
        System.out.println("Solved Steps:");
        printSteps(solveMaze5.SolveMaze());
        printMaze(maze5);
        
        System.out.println("\nMaze 6");
        String[] maze6 = {"############","#.#........#","#.#.######.#","#.#....#...#","#.###.*#.#.#","#...####.#.#","#.#.#..#.#.#","#.#.#.##.#.#","#@#......#.#","############"};
        MazeSolver solveMaze6 = new MazeSolver(maze6, 8, 1);
        printMaze(maze6);
        System.out.println("Solved Steps:");
        printSteps(solveMaze6.SolveMaze());
        printMaze(maze6);
    }
    
    public static void printMaze(String[] maze){
        for(int i = 0; i < maze.length; i++){
            for(int j = 0 ; j < maze[i].length(); j++){
                System.out.print(maze[i].charAt(j));
            }
            System.out.println();
        }
    }
    
    public static void printSteps(ArrayList<int[]> result){
        for(int i = 0; i <result.size(); i++){
            for(int j = 0; j < result.get(0).length; j++){
                System.out.print(result.get(i)[j] + " ");
            }
            System.out.println();
        }
    }
    
}
