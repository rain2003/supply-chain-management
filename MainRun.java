package project;

import project.bean.Application;
import project.bean.Buyer;
import project.bean.Seller;
import project.service.*;

import java.util.Scanner;

public class MainRun {

    public static void main(String args[]) {

        Application application = new Application();

        Rating productRating = new ProductRating();
        Rating sellerRating = new SellerRating();

        BuyerService buyerService = new BuyerService();
        SellerService sellerService = new SellerService();

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("Press b for buyer or s for seller");

            char c = sc.next().charAt(0); // input from user

            String name = "sam"; // input from user
            String phoneNo = "34"; // input from user
            String gender = "male"; // input from user
            String address = "dsdf"; // input from user
            int age = 45; // input from user

            if (c == 'b') {
                Buyer buyer = new Buyer( name, phoneNo, gender, address, age);
                Application.buyers.put(buyer.getBuyerId(), buyer);

                buyerService.getAllProducts().forEach(product -> System.out.println(product.toString()));

                int productId = 2; // get from user
                int quantity = 10; // get from user

                buyerService.buyProduct(buyer.getBuyerId(), productId, quantity);

                System.out.println(buyer.toString());
                buyerService.getAllProducts().forEach(product -> System.out.println(product.toString()));

                int productIdToPutRatting = 2; // get from user
                int ratting = 5; // get from user

                buyerService.putRatting(productIdToPutRatting, ratting);

                buyerService.putRatting(productIdToPutRatting, ratting);

                int productIdAvgRating = 2; // get from user;
                productRating.calculateRating(productIdAvgRating);
                System.out.println(Application.inventory.get(productIdAvgRating).getAvgRating());

            } else {
                Seller seller = new Seller( name, phoneNo, gender, address, age);
                Application.sellers.put(seller.getSellerId(), seller);
            }

            
        }

    }

}
