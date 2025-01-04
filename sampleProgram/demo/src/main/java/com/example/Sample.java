package com.example;

public class Sample {

    public static String getAgeGroup(int age) {
        if (age < 0) {
            return "Invalid age";
        } else if (age < 10) {
            return "0-9 years old";
        } else if (age < 20) {
            return "10-19 years old";
        } else if (age < 30) {
            return "20-29 years old";
        } else if (age < 40) {
            return "30-39 years old";
        } else if (age < 50) {
            return "40-49 years old";
        } else if (age < 60) {
            return "50-59 years old";
        } else if (age < 70) {
            return "60-69 years old";
        } else if (age < 80) {
            return "70-79 years old";
        } else if (age < 90) {
            return "80-89 years old";
        } else if (age < 100) {
            return "90-99 years old";
        } else {
            return "100+ years old";
        }
    }
}