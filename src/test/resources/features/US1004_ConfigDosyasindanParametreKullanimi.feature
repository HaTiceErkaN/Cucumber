

  Feature: US1004 kullanici parametre ile configuration file'i kullanabilmeli

    @config @pr2
    Scenario: TC07 configuration properties dosyasindan parametre kullanimi
      Given kullanici "techproeducationUrl" anasayfasinda
      Then kullanici 3 sn bekler
      And url'in "techpro" icerdigini test eder
      Then sayfayi kapatir