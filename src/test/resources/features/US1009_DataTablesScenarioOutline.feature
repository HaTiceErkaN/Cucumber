Feature: US1009 Datatables sitesibe 5 farkli giris yapalim
@datatable
  Scenario Outline:  TC14 kuullanici 5 farkli kayit girisi yapabilmeli

    When kullanici "datatablesUrl" anasayfasinda
    Then new butonuna basar
  And isim bölümüne "<firstname>" yazar
  Then kullanici 2 sn bekler
  And soyisim bölümüne "<lastname>" yazar
  Then kullanici 2 sn bekler
  And position bölümüne "<position>" yazar
  Then kullanici 2 sn bekler
  And office bölümüne "<office>" yazar
  Then kullanici 2 sn bekler
  And extension bölümüne "<extension>" yazar
  Then kullanici 2 sn bekler
  And startDate bölümüne "<startDate>" yazar
  Then kullanici 2 sn bekler
  And salary bölümüne "<salary>" yazar
  Then kullanici 2 sn bekler
  And Create tusuna basar
  When kullanici "<firstname>" ile arama yapar
  Then kullanici 2 sn bekler
  Then isim bolumunde "<firstname>" oldugunu test eder

    And sayfayi kapatir

    Examples:
    |firstname|lastname|position|office|extension|startDate |salary|
    |Alim     |Alim    |qa      |ankara|UI       |2021-10-11|10000 |
    |Berk     |Can     |tester  |ankara|api      |2022-05-05|11000 |
    |Huseyin  |Kacmaz  |BA      |berlin|-        |2022-07-10|40000 |
    |Fatih    |Sahin   |PO      |berlin|-        |2022-03-12|45000 |
    |Ahmet    |Kaya    |Tester  |ankara|database |2022-06-03|11000 |