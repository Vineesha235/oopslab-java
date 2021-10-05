//Question No: 12

import java.util.Scanner;

public class Q12_BookMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter the no. of books: ");
        int n = input.nextInt();
        Book[] books = new Book[n];

        for (int i=0; i<n; i++){
            books[i] = new Book();
            System.out.printf("\nEnter Book %d Details..........", (i+1));
            books[i].read();
            System.out.println("......................");
        }
        System.out.print("Select a Category: ");
        String cat = input.next();
        int count = 0;

        for (int i=0; i<n; i++){
            if (books[i].category.equals(cat)){
                count++;
                System.out.printf("\nBook %d \n",count );
                books[i].display();
            }
        }
        if(count == 0)
            System.out.println("Sorry, Books not Available!");
    }
}


class Publisher{
    String name;
    int number;

    void read(){
        Scanner input = new Scanner(System.in);
        System.out.print("\nName of Publisher: ");
        this.name = input.next();
        System.out.print("Publication Number :");
        this.number = input.nextInt();
    }
}


class Book extends Publisher{
    String title;
    String author;
    String category;
    float price;

    void read(){
        super.read();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Book Title: ");
        this.title = input.next();
        System.out.print("Name of Author: ");
        this.author = input.next();
        System.out.print("Book Category: ");
        this.category = input.next();
        System.out.print("Book Price: ");
        this.price = input.nextFloat();
    }
    void display(){
        System.out.println("Book Title : " + this.title);
        System.out.println("Author : " + this.author);
        System.out.println("Category : " + this.category);
        System.out.println("Book Price : " + this.price);
        System.out.println("Publisher : " + this.name);
        System.out.println("Publication Number : " + number);
    }
}

