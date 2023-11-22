package OOPsAssignment;

import java.util.*;
public abstract class DessertItem {
    public abstract int getCost();
}

class Candy extends DessertItem{
    Scanner sc = new Scanner(System.in);
    int totalCandies = 0;
    int dollarInRupees = 60;
    public int addCandies(int candies) {
        this.totalCandies += candies;
        return totalCandies;
    }
    @Override
    public int getCost() {
        totalCandies=sc.nextInt();
        return totalCandies*dollarInRupees;
    }

 

}

class Cookie extends DessertItem{
    Scanner sc = new Scanner(System.in);
    int totalCookies=0;
    int euroInRupees=70;
    public int addCookies(int cookies) {
        this.totalCookies += cookies;
        return totalCookies;
    }

 

    @Override
    public int getCost() {
        totalCookies=sc.nextInt();
        return totalCookies*euroInRupees;
    }
}


class IceCream extends DessertItem{
    Scanner sc = new Scanner(System.in);
    int totalIceCreams=0;
    int costInRupees= 1;
    public int addIceCream(int iceCream) {
        totalIceCreams += iceCream;
        return totalIceCreams;
    }

 

    public int getCost() {
        totalIceCreams=sc.nextInt();
        return totalIceCreams*costInRupees;
    }
}