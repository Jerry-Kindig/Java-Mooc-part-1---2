/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jerry pc
 */
import java.util.Scanner;
import java.util.ArrayList;

public class ExamResults {
    
    private int totalNum;
    private ArrayList<Integer> grades;
    private int curGrade;
    private int fails;
    private Scanner lukija;
    private int[] dist;
    private double acceptPerc;
    
    public ExamResults(Scanner lukija){
        this.grades = new ArrayList<Integer>();
        this.grades = new ArrayList<Integer>();
        this.curGrade = 0;
        this.fails = 0;
        this.lukija = lukija;
        this.dist = new int[6];
        this.acceptPerc = 0;
    }
    
    public void enterGrades(){
        System.out.println("Type exam scores, -1 completes:");
        while(true){
            this.curGrade = this.lukija.nextInt();
            if(this.curGrade != -1){
                if(this.curGrade > -1 && this.curGrade < 61){
                    this.grades.add(this.curGrade);
                }
            } else {
                break;
            }
        }    
        this.gradeDistribution();
        this.acceptancePercentage();
        System.out.println(this.toString());
    }
    
    public void gradeDistribution(){
        for(int grade: this.grades){
            if(grade < 30){
                this.dist[0]++;
                this.fails++;
            } else if (grade < 35){
                this.dist[1]++;
            } else if (grade < 40){
                this.dist[2]++;
            } else if (grade < 45){
                this.dist[3]++;
            } else if (grade < 50){
                this.dist[4]++;
            } else {
                this.dist[5]++;
            }
            System.out.println(this.fails);
        }
    }
    
    public void acceptancePercentage(){
        
        int size = this.grades.size();
        if(!this.grades.isEmpty()){
            this.acceptPerc = (double)(size - this.fails) / size;
            this.acceptPerc *= 100;
        }
    }
    
    public String printLine(int num){
        String line = "";
        for(int i = 0; i < this.dist[num]; i++){
            line = line + "*";
        }
        return line;
    }
    
    @Override
    public String toString(){
        return "Grade distribution:\n" +
                "5: " + this.printLine(5) +
                "\n4: " + this.printLine(4) +
                "\n3: " + this.printLine(3) +
                "\n2: " + this.printLine(2) +
                "\n1: " + this.printLine(1) +
                "\n0: " + this.printLine(0) +
                "\nAcceptance percentage: " + String.format("%.2f", this.acceptPerc);
    }
}
