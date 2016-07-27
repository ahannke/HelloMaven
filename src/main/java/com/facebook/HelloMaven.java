package com.facebook;

import spark.Spark;

public class HelloMaven {

    public static void main(String[] args) {
        System.out.println("Hello Maven");
	
	Spark.get("/", (a, b) -> "coœtamcoœtam");
    }
}