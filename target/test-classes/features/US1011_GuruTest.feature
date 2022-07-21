
  Feature: US1011 Web tablosundaki istenen sutunu yazdirma
@guru @pr2
    Scenario: TC16 kullanici sutun basligi ile listealabilmeli
      Given kullanici "guruUrl" anasayfasinda
      And kullanici 2 sn bekler
      And "Prev Close (Rs)", sutunundaki tum degerleri yazdirir
      And kullanici 2 sn bekler
      Then sayfayi kapatir
