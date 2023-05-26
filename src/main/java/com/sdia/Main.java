package com.sdia;

import com.sdia.stubs.Radar;
import com.sdia.stubs.RadarServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Scanner;

public class Main {
    private static RadarServiceGrpc.RadarServiceBlockingStub stub;

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 1234)
                .usePlaintext()
                .build();
        stub = RadarServiceGrpc.newBlockingStub(channel);
        Scanner sc = new Scanner(System.in);

        // Detect infraction
        int choice = 0;
        while(choice != 2) {
            System.out.println("\n1. Detect infraction");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter radar id: ");
                    Long radarId = sc.nextLong();
                    System.out.print("Enter vehicle speed: ");
                    Double speed = sc.nextDouble();
                    System.out.print("Enter vehicle id: ");
                    String vehicleId = sc.next();
                    System.out.println("Detecting infraction...");
                    Radar.DetectRequest request = Radar.DetectRequest.newBuilder()
                            .setRadarId(radarId)
                            .setVehicleId(vehicleId)
                            .setSpeed(speed)
                            .build();
                    stub.detectInfraction(request);
                    break;
                case 2:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

}