package com.bootcoding.java.assignment;

public class LockApp {
    public static void main(String[] args) {
        Lock l = new Lock();
        l.lockSpecification("B212", "Manual Lock", 500);
        l.lockSpecification("S121", "Digital Lock", 1000);

    }}

