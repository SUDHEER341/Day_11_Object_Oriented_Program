package com.objectOrientedProgram;
import java.util.ArrayList;
import java.util.Scanner;

public class StockAccountManagement {

    public static void main(String[] args) {
        int temp = 0;
        Scanner scanner = new Scanner(System.in);
        StockPortfo p = new StockPortfo();
        while (temp == 0) {
            System.out.println("Enter the details of Stock ");
            StockPortfo.Stock s = new StockPortfo.Stock();
            System.out.println("Enter Company Name:");
            s.company = scanner.nextLine();
            System.out.println("Enter number of share:");
            s.NoOfShare = scanner.nextInt();
            System.out.println("Enter Price of share:");
            s.price = scanner.nextDouble();

            p.portf.add(s);
            System.out.println("Do you want to add more Stocks? enter 0 for YES or 1 for NO!");
            temp = scanner.nextInt();
        }
        for (int i = 0; i < p.portf.size(); i++) {
            System.out.println(p.totalValue());

        }
    }
}

class StockPortfo {
    ArrayList<Stock> portf = new ArrayList<>();
    double totalValue = 0;

    static class Stock {
        int NoOfShare;
        String company;
        double price;
    }

    public double totalValue() {
        for (Stock stock : portf) {
            totalValue += stock.price * stock.NoOfShare;
        }
        return totalValue;
    }
}
