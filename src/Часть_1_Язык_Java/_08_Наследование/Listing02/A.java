package Часть_1_Язык_Java._08_Наследование.Listing02;

// listing 2
/* In a class hierarchy, private members remain
   private to their class.

   This program contains an error and will not
   compile.
*/

// Create a superclass.
class A {
    int i; // public be default
    private int j; // private to A

    void setij(int x, int y) {
        i = x;
        j = y;
    }
}

