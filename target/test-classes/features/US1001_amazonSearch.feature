@Tumu
Feature: US1001 Kullanici Amazon Sayfasinda Arama Yapar

  @Nutella @ikisi
  Scenario: TC01 kullanici amazonda nutella aratir
    Given kullanici amazon anasayfasinda
    Then kullanici Nutella icin arama yapar
    And sonuclarin Nutella icerdigini test eder
    And sayfayi kapatir

@Java @ikisi @sirali
    Scenario: TC02 kullanici amazonda java aratir
      Given kullanici amazon anasayfasinda
      Then kullanici Java icin arama yapar
      And sonuclarin Java icerdigini test eder
      And sayfayi kapatir

  @iphone @pr1
      Scenario: TC03 kullanici iphone aratir
        Given kullanici amazon anasayfasinda
        Then kullanici "iphone" icin arama yapar
        And sonuclarin "iphone" icerdigini test eder
        And sayfayi kapatir