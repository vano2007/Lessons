import Forest.Something.SomeClass;
import Forest.Squirel;
import Forest.Tree;

// import Forest.*;  такая запись импортирует все классы из пакета Forest
// import java.util.*; такая запись импортирует все классы из пакета java.util

import java.util.Scanner;

public class Package {
    public static void main(String[] args) {
        Tree tree1 = new Tree();
        Squirel squirel1 = new Squirel();

        Scanner scanner = new Scanner(System.in);
        SomeClass someInstace = new SomeClass();

    }
}
