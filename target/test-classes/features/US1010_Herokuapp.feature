
  Feature: US1010 herokuapp
@heroku @sirali @pr1
    Scenario: TC15 herokuapp'dan delete butonu calismali

      Given kullanici "herokuappUrl" anasayfasinda
      And add element butonuna basar
      Then kullanici 3 sn bekler
      Then Delete butonu gorunur oluncaya kadar bekler
      And Delete butonunun gorunur oldugunu test eder
      Then kullanici 2 sn bekler
      Then Delete butonuna basar
      And Delete butonunun gorunmedigini test eder
      And sayfayi kapatir