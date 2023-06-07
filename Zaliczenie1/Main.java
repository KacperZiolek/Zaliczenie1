class Main {
  public static void main(String[] args) {
  int liczba;
    int liczba_pierwsza=0;
    int licznik = 0;
    for(liczba = 0; liczba <= 500; liczba++){
      if(liczba % 2 != 0){
        licznik ++;
        liczba_pierwsza = liczba;
    System.out.println(liczba_pierwsza);
      }      
    }
    System.out.println("ILOŚĆ LICZB: "+licznik);
    System.out.println("Kacpr Ziółek 169759 ETDI2");

  }
}

/*

Jeśli % nie zwraca liczby 0 Wypisz liczbę
*/