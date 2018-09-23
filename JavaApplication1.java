/*
 * Written By Lisandra Soto
 * CMIS 141 Project 4 
 * JaveApplication1
 * Date: April 26 2018
 * This Program Gives you the flower and bird of each state! 
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author lili
 */
public class JavaApplication1 {

    public static int getInfo(String stateSymb[][],String state)
   {
       int position = -1;
       boolean found = false;
       for (int index=0; index<stateSymb.length && !found; index++)
       {
           if(stateSymb[index][0].equalsIgnoreCase(state))
               position=index;            
       }
       return position;
   }


    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        String[][] stateInformation = new String[][] {
            {"Alabama", "Yellowhammer", "Camelia"},
            {"Alaska", "Willow Ptarmigan", "Forget-Me-Not"},
            {"Arizona", "Cactus Wren", "Saguaro Cactus Blossom"},
            {"Arkansas", "Mockingbird", "Apple Blossom"},
            {"California", "California Valley Quail", "Golden Poppy"},
            {"Colorado", "Lark Bunting", "Rocky Mountain Columbine"},
            {"Connecticut", "Robin", "Mountain Laurel"},
            {"Delaware", "Blue Hen Chicken", "Peach Blossom"},
            {"Florida", "Mockingbird", "Orange Blossom"},
            {"Georgia", "Brown Thrasher", "Cherokee Rose"},
            {"Hawaii", "Nene", "Hawaiian Hibiscus"},
            {"Idaho", "Mountain Bluebird", "Syringa, mock orange"},
            {"Illinois", "Cardinal", "Violet"},
            {"Indiana", "Cardinal", "Peony"},
            {"Iowa", "Eastern Goldfinch", "Wild Praire Rose"},
            {"Kansas", "Western Meadowlark", "Sunflower"},
            {"Kentucky", "Cardinal", "Goldenrod"},         
            {"Louisiana", "Eastern Brown Pelican", "Magnolia"},
            {"Maine", "Chickadee", "Pine Cone and Tassel"},
            {"Maryland", "Baltimore Oriole", "Black-Eyed Susan"},
            {"Massachusetts", "Chickadee", "Mayflower"},
            {"Michigan", "Robin", "Apple Blossom"},
            {"Minnesota", "Common Loon", "Pink and White Lady's Slippper"},
            {"Mississippi", "Mockingbird", "Magnolia"},
            {"Missouri", "Bluebird", "Hawthorn"},
            {"Montana", "Western Meadowlark", "Bitterroot"},
            {"Nebraska", "Western Meadowlark", "Goldenrod"},
            {"Nevada", "Mountain Bluebird", "Sagebrush"},
            {"New Hampshire", "Purple Finch", "Purple Lilac"},
            {"New Jersey", "Eastern Goldfinch", "Violet"},
            {"New Mexico", "Roadrunner", "Yucca Flower"},
            {"New York", "Bluebird", "Rose"},
            {"North Carolina", "Cardinal", "Flowering Dogwood"},
            {"North Dakota", "Western Meadowlark", "Wild Praire Rose"},
            {"Ohio", "Cardinal", "Scarlet Carnation"},
            {"Oklahoma","Scissor-tailed Flycatcher","Oklahoma Rose"},          
            {"Oregon", "Western Meadowlark", "Oregon Grape"},
            {"Pennsylvania", "Ruffed Grouse", "Mountain Laurel"},
            {"Rhode Island", "Rhode Island Red", "Violet"},         
            {"South Carolina", "Great Carolina Wren", "Yellow Jessamine"},
            {"South Dakota", "Ring-necked Pheasant", "Pasque Flower"},
            {"Tennessee", "Mockingbird", "Purple Passionflower"},
            {"Texas", "Mockingbird", "Bluebonnet Sp."},
            {"Utah", "Common American Gull", "Sego Lily"},
            {"Vermont", "Hermit Thrush", "Red Clover"},
            {"Virginia","Cardinal"," American Dogwood"},
            {"Washington", "Willow Goldfinch", "Coast Rhododendrum"},
            {"West Virginia", "Cardinal", "Rhododendron"},
            {"Wisconsin", "Robin", "Wood Violet"},
            {"Wyoming", "Western Meadowlark", "Indian Paintbrush"}
        };

        while(true) {
            System.out.println("Enter a State or None to exit:");
            String stateName = userInput.nextLine();

            if(stateName.equalsIgnoreCase("None")) {
                System.exit(0);
            }
            else {
                int position = getInfo(stateInformation, stateName);
                if(position != -1) {
                    System.out.println("Bird: " + stateInformation[position][1]);
                    System.out.println("Flower: " + stateInformation[position][2]);                 
                }
                else {
                    System.out.println("Invalid State Entered");
                }              
            }          
        }
    }
    }
    
