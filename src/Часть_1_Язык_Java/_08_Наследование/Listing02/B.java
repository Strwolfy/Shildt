package Часть_1_Язык_Java._08_Наследование.Listing02;

// A's j is not accessible here.
class B extends A {
    int total;

    void sum() {
        //total = i + j; // ERROR, j is not accessible here
    }
}
