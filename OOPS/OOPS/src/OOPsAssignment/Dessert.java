package OOPsAssignment;

import java.util.*;





public class Dessert {

 

    Scanner sc = new Scanner(System.in);
    private void selectRoles() {
        System.out.println("Enter your role customer or owner");
        String role;
        role = sc.nextLine();
        roles(role);
    }
    private void roles(String role) {
        if(role.toUpperCase().equals("CUSTOMER")) {
            placeOrder();
        }
        else if(role.toUpperCase().equals("OWNER")) {
            addItems();
        }
        else
            System.out.println("Please enter valid details!");
    }

 

    private void addItems() {
        System.out.println("Choose items to be added: ");
        System.out.println("1.Candy\n2.Cookie\n3.IceCream");
        System.out.println("Enter your choice");
        int ch = sc.nextInt();
        addItemsOperation(ch);
    }
    private void addItemsOperation(int choice) {
        switch (choice) {
        case 1:
            Candy candy = new Candy();
            System.out.println("Enter the amount of candies to be added ");
            int amount;
            amount = sc.nextInt();
            int total= candy.addCandies(amount);
            System.out.println("Candies added successfully and total available are "+total);
            break;

 

        case 2:
            Cookie cookie = new Cookie();
            System.out.println("Enter the amount of cookies to be added ");
            amount = sc.nextInt();
            total=cookie.addCookies(amount);
            System.out.println("IceCreams added successfully and total available are "+total);
            break;
        case 3:
            IceCream iceCream = new IceCream();
            System.out.println("Enter the amount of ice-creams to be added ");
            amount = sc.nextInt();
            total=iceCream.addIceCream(amount);
            System.out.println("Ice creams are added successfully and total available are "+total);
            break;
        default:
            System.out.println("Please enter a valid number!");
            break;
        }

 

    }
    private void placeOrder() {
        System.out.println("Choose items to be added: ");
        System.out.println("1.Candy\n2.Cookie\n3.IceCream");
        System.out.println("Enter your choice");
        int ch = sc.nextInt();
        placeOrderOperation(ch);
    }
    private void placeOrderOperation(int choice) {
        switch(choice) {
        case 1:
            Candy candy = new Candy();
            System.out.println("Enter the amount of candies to be placed");
            int total=candy.getCost();
            System.out.println("Candies placed successfully and total cost is "+total);
            break;
        case 2:
            Cookie cookie = new Cookie();
            System.out.println("Enter the amount of cookies to be placed");
            total=cookie.getCost();
            System.out.println("Cookies placed successfully and total cost is "+total);
            break;
        case 3:
            IceCream iceCream = new IceCream();
            System.out.println("Enter the amount of icecreams to be placed");
            total=iceCream.getCost();
            System.out.println("IceCreams placed successfully and total cost is "+total);
            break;
        default:
            System.out.println("Please enter valid number");
            break;
        }
    }
    public static void main(String[] args) {
        Dessert dessert = new Dessert();
        dessert.selectRoles();
    }
}