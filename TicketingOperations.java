package com.jap.ticketing;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.Float.parseFloat;

public class TicketingOperations {


    //This method reads the sample.csv file provided and returns a List
    public List<TicketingData> readTicketingData(String fileName) {
        ArrayList<TicketingData> list1 = new ArrayList<>();
        try {
            File file = new File(fileName);
            FileReader reader = new FileReader(file);
            BufferedReader buffer = new BufferedReader(reader);

            String str;
            int m = 0;
            while ((str = buffer.readLine()) != null) {
                if (m == 0) {
                    m++;
                    continue;
                }
                String[] arr = str.split(",");
                TicketingData obj = new TicketingData(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], Integer.parseInt(arr[8]), parseFloat(arr[9]));
                list1.add(obj);
            }
        } catch (IOException e) {
            System.out.println("IO Exception");
        }
        return list1;
    }


    //This method sorts the data based on the kms travelled by a bus (route)
    public List<TicketingData> sortByKmsTravelled(List<TicketingData> ticketingDataList) {
        ArrayList<TicketingData> list2 = new ArrayList<>();
        Collections.sort(ticketingDataList, (o1, o2) -> Float.compare(o2.getTravelledKM(),o1.getTravelledKM()));
        for (TicketingData k : ticketingDataList) {
            list2.add(k);
        }
        return list2;
    }

    //This method calculates the total revenue from ticket collection amount
    public double totalAmountCollected(List<TicketingData> ticketingDataList) {
        TicketCollection tc = data -> {
            double result = 0;
            for (TicketingData k : ticketingDataList) {
                result = result + k.getTotalTicketAmount();
            }
            return result;
        };
           return tc.totalAmountCollected(ticketingDataList);
    }
}